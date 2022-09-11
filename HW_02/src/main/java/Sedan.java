import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

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
        if (o == null) return false;
        Transport transport = (Transport) o;
        return Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel());
    }

}
