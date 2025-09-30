package hotel_booking.booking_service.infrastructure.db.adapter;

import hotel_booking.booking_service.core.domain.entities.Room;
import hotel_booking.booking_service.core.domain.ports.RoomRepositoryPort;
import hotel_booking.booking_service.infrastructure.db.jpa.RoomJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class RoomRepositoryAdapter implements RoomRepositoryPort {
    private RoomJpaRepository roomJpaRepository;

    @Override
    public Room save(Room room) {
        return roomJpaRepository.save(room);
    }

    @Override
    public Optional<Room> findById(Long id) {
        return roomJpaRepository.findById(id);
    }
}
