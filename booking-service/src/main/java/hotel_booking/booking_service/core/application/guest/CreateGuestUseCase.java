package hotel_booking.booking_service.core.application.guest;

import hotel_booking.booking_service.core.application.guest.dto.CreateGuestCommand;

import java.util.UUID;

public interface CreateGuestUseCase {
    UUID createGuest(CreateGuestCommand command);
}
