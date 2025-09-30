package hotel_booking.booking_service.infrastructure.db.jpa;

import hotel_booking.booking_service.core.domain.entities.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestJpaRepository extends JpaRepository<Guest, Long> {
}
