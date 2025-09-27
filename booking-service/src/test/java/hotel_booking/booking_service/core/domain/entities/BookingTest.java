package hotel_booking.booking_service.core.domain.entities;

import hotel_booking.booking_service.core.domain.enums.BookingAction;
import hotel_booking.booking_service.core.domain.enums.BookingStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class BookingTest {

    private Booking booking;

    @BeforeEach
    void setUp() {
        this.booking = new Booking();
    }

    @Nested
    class GivenCreatedStatus {
        @Test
        void givenCreated_whenPay_thenStatusIsPaid() {
            booking.setStatus(BookingAction.PAY);
            assert(booking.getStatus()).equals(BookingStatus.PAID);
        }
        @Test
        void givenCreated_whenCancel_thenStatusIsCanceled() {
            booking.setStatus(BookingAction.CANCEL);
            assert(booking.getStatus()).equals(BookingStatus.CANCELED);
        }
        @Test
        void givenCreated_whenInvalidAction_thenStatusRemainsCreated() {
            booking.setStatus(BookingAction.FINISH);
            assert(booking.getStatus()).equals(BookingStatus.CREATED);

            booking.setStatus(BookingAction.REFUND);
            assert(booking.getStatus()).equals(BookingStatus.CREATED);

            booking.setStatus(BookingAction.REOPEN);
            assert(booking.getStatus()).equals(BookingStatus.CREATED);
        }
    }

    @Nested
    class GivenPaidStatus {
        @Test
        void givenPaid_whenFinish_thenStatusIsFinished() {
            booking.setStatus(BookingAction.PAY);
            booking.setStatus(BookingAction.FINISH);
            assert(booking.getStatus()).equals(BookingStatus.FINISHED);
        }
        @Test
        void givenPaid_whenRefund_thenStatusIsRefunded() {
            booking.setStatus(BookingAction.PAY);
            booking.setStatus(BookingAction.REFUND);
            assert(booking.getStatus()).equals(BookingStatus.REFUNDED);
        }
        @Test
        void givenPaid_whenInvalidAction_thenStatusRemainsPaid() {
            booking.setStatus(BookingAction.PAY);

            booking.setStatus(BookingAction.CANCEL);
            assert(booking.getStatus()).equals(BookingStatus.PAID);

            booking.setStatus(BookingAction.REOPEN);
            assert(booking.getStatus()).equals(BookingStatus.PAID);
        }
    }

    @Nested
    class GivenCanceledStatus {
        @Test
        void givenCanceled_whenReopen_thenStatusIsCreated() {
            booking.setStatus(BookingAction.CANCEL);
            booking.setStatus(BookingAction.REOPEN);
            assert(booking.getStatus()).equals(BookingStatus.CREATED);
        }
        @Test
        void  givenCanceled_whenInvalidAction_thenStatusRemainsCanceled() {
            booking.setStatus(BookingAction.CANCEL);

            booking.setStatus(BookingAction.PAY);
            assert(booking.getStatus()).equals(BookingStatus.CANCELED);

            booking.setStatus(BookingAction.FINISH);
            assert(booking.getStatus()).equals(BookingStatus.CANCELED);

            booking.setStatus(BookingAction.REFUND);
            assert(booking.getStatus()).equals(BookingStatus.CANCELED);
        }
    }

    @Test
    void givenFinished_whenAnyAction_thenStatusRemainsFinished() {
        booking.setStatus(BookingAction.PAY);
        booking.setStatus(BookingAction.FINISH);
        for (BookingAction action : BookingAction.values()) {
            booking.setStatus(action);
            assert (booking.getStatus()).equals(BookingStatus.FINISHED);
        }
    }

    @Test
    void givenRefunded_whenAnyAction_thenStatusRemainsRefunded() {
        booking.setStatus(BookingAction.PAY);
        booking.setStatus(BookingAction.REFUND);
        for (BookingAction action : BookingAction.values()) {
            booking.setStatus(action);
            assert(booking.getStatus()).equals(BookingStatus.REFUNDED);}
    }
}
