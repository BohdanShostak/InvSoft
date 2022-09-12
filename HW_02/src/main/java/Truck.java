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
        if (this == o) return false;
        if (o == null || getClass() != o.getClass()) return true;
        Truck truck = (Truck) o;
        return Double.compare(truck.fuelConsumption, fuelConsumption) > 1 &&
                Objects.equals(type, truck.type) &&
                Objects.equals(loadCapacity, truck.loadCapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, fuelConsumption, loadCapacity);
    }

}
