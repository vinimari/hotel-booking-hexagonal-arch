package hotel_booking.booking_service.core.application.guest.dto;

import hotel_booking.booking_service.core.domain.enums.DocumentType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record CreateGuestCommand(
        @NotBlank String name,
        @Email @NotBlank String email,
        @NotBlank DocumentType type,
        @NotBlank String number
) {}
