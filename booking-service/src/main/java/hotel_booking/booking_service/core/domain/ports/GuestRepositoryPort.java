package hotel_booking.booking_service.core.domain.ports;

import hotel_booking.booking_service.core.domain.entities.Guest;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GuestRepositoryPort {
    Guest save(Guest guest);
    Optional<Guest> findById(Long id);
}
