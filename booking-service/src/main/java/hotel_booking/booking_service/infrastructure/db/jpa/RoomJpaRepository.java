package hotel_booking.booking_service.infrastructure.db.jpa;

import hotel_booking.booking_service.core.domain.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomJpaRepository extends JpaRepository<Room, Long> {
}
