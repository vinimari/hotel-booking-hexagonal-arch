package hotel_booking.booking_service.core.domain.entities;

import hotel_booking.booking_service.core.domain.enums.BookingAction;
import hotel_booking.booking_service.core.domain.enums.BookingStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime placeAt;
    private LocalDateTime start;
    private LocalDateTime end;
    @Enumerated(EnumType.STRING)
    private BookingStatus status = BookingStatus.CREATED;

    public void setStatus(BookingAction action) {
        switch (this.status) {
            case CREATED:
                if (action == BookingAction.PAY) {
                    this.status = BookingStatus.PAID;
                }
                if (action == BookingAction.CANCEL) {
                    this.status = BookingStatus.CANCELED;
                }
                break;
            case PAID:
                if (action == BookingAction.FINISH) {
                    this.status = BookingStatus.FINISHED;
                }
                if (action == BookingAction.REFUND) {
                    this.status = BookingStatus.REFUNDED;
                }
                break;
            case CANCELED:
                if (action == BookingAction.REOPEN) {
                    this.status = BookingStatus.CREATED;
                }
                break;
        };
    }
}
