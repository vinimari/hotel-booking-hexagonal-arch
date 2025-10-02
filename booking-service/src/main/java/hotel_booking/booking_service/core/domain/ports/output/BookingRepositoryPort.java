package hotel_booking.booking_service.core.domain.ports.output;

import hotel_booking.booking_service.core.domain.entities.Booking;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookingRepositoryPort {
    Booking save(Booking booking);
    Optional<Booking> findById(Long id);
}
