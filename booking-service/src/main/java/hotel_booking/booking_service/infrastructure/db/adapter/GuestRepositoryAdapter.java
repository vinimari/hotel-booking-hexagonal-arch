package hotel_booking.booking_service.infrastructure.db.adapter;

import hotel_booking.booking_service.core.domain.entities.Guest;
import hotel_booking.booking_service.core.domain.ports.output.GuestRepositoryPort;
import hotel_booking.booking_service.infrastructure.db.jpa.GuestJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class GuestRepositoryAdapter implements GuestRepositoryPort {
    private GuestJpaRepository guestJpaRepository;

    @Override
    public Guest save(Guest guest) {
        return this.guestJpaRepository.save(guest);
    }

    @Override
    public Optional<Guest> findById(Long id) {
        return this.guestJpaRepository.findById(id);
    }
}
