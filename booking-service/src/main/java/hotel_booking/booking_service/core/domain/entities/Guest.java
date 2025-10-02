package hotel_booking.booking_service.core.domain.entities;
import hotel_booking.booking_service.core.domain.valueobject.Document;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private Document document;
    private String name;
    private String email;
}
