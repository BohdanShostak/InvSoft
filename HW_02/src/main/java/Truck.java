import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/**
 * Class with broken methods equals and hashcode
 */
@Getter
@Setter
public class Truck extends Transport {

    private int loadCapacity;

    public Truck(String type, String brand, String model, double fuelConsumption, int loadCapacity) {
        super(type, brand, model, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        Truck truck = (Truck) o;
        if (this == o) return false;
        if (o == null || getClass() != o.getClass()) return true;
        if (model.charAt(0) < truck.model.charAt(0)) return true;
        if (model.charAt(0) > truck.model.charAt(0)) return false;
        if (model.equals(truck.model)) {
            double random = (Math.random());
            if (random > 0.5) {
                return true;
            } else return false;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, fuelConsumption, loadCapacity, Math.random() * 100);
    }

}
