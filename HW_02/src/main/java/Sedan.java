import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/**
 * Class with working methods equals and hashcode
 */
@Getter
@Setter
public class Sedan extends Transport {

    private String color;

    public Sedan(String type, String brand, String model, double fuelConsumption, String color) {
        super(type, brand, model, fuelConsumption);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sedan sedan = (Sedan) o;
        return Double.compare(sedan.fuelConsumption, fuelConsumption) == 0 &&
                Objects.equals(type, sedan.type) &&
                Objects.equals(brand, sedan.brand) &&
                Objects.equals(model, sedan.model) &&
                Objects.equals(color, sedan.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, brand, model, fuelConsumption, color);
    }

}
