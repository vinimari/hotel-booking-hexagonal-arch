package hotel_booking.booking_service.core.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer number;
    private Boolean isInMaintenance;

    public Boolean isAvailable() {
        return !this.isInMaintenance && !this.hasGuest();
    }
    public Boolean hasGuest() {
        return true;
    }
}
