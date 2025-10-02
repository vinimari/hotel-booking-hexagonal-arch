package hotel_booking.booking_service.infrastructure.db.adapter;

import hotel_booking.booking_service.core.domain.entities.Booking;
import hotel_booking.booking_service.core.domain.ports.output.BookingRepositoryPort;
import hotel_booking.booking_service.infrastructure.db.jpa.BookingJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class BookingRepositoryAdapter implements BookingRepositoryPort {
    private BookingJpaRepository bookingJpaRepository;

    @Override
    public Booking save(Booking booking) {
        return bookingJpaRepository.save(booking);
    }

    @Override
    public Optional<Booking> findById(Long id) {
        return bookingJpaRepository.findById(id);
    }
}
