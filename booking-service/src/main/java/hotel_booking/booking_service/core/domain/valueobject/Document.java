package hotel_booking.booking_service.core.domain.valueobject;

import hotel_booking.booking_service.core.domain.enums.DocumentType;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Embeddable
@NoArgsConstructor
public class Document {
    private DocumentType type;
    private String number;

    public Document(DocumentType type, String number) {
        if (number == null || number.isBlank()) throw new IllegalArgumentException("Document number required");
        this.type = type;
        this.number = number;
    }
}
