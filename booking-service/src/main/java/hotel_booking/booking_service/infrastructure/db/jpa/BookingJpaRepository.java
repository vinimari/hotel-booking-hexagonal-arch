package hotel_booking.booking_service.infrastructure.db.jpa;

import hotel_booking.booking_service.core.domain.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingJpaRepository extends JpaRepository<Booking, Long> {
}
