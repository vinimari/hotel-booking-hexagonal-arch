package hotel_booking.booking_service.core.domain.valueobject;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@Embeddable
@NoArgsConstructor
public class ReservationPeriod {
    private LocalDate dataCheckIn;
    private LocalDate dataCheckOut;

    public ReservationPeriod(LocalDate dataCheckIn, LocalDate dataCheckOut) {
        if (dataCheckIn.isAfter(dataCheckOut)) {
            throw new IllegalArgumentException("Check-in date should be before check-out date.");
        }
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
    }
}
