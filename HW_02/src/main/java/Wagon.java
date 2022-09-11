import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Wagon extends Transport {

    private int trunkVolume;

    public Wagon(String type, String brand, String model, double fuelConsumption, int trunkVolume) {
        super(type, brand, model, fuelConsumption);
        this.trunkVolume = trunkVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Transport transport = (Transport) o;
        return Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel());
    }

}
