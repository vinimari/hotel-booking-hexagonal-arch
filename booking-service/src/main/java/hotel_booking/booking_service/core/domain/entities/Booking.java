package hotel_booking.booking_service.core.domain.entities;

import hotel_booking.booking_service.core.domain.Enums.BookingStatus;
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
    private BookingStatus status;
}
