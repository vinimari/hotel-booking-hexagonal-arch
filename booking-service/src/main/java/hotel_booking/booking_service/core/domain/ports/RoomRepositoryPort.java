package hotel_booking.booking_service.core.domain.ports;

import hotel_booking.booking_service.core.domain.entities.Room;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoomRepositoryPort {
    Room save(Room room);
    Optional<Room> findById(Long id);
}
