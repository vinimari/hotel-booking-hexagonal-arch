package hotel_booking.booking_service.core.domain.enums;

public enum BookingAction {
    PAY,      // after created
    FINISH,   // after paid and used
    CANCEL,   // can never be paid
    REFUND,   // paid then refound
    REOPEN    // after canceled
}
