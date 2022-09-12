import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Transport {

    public String type;
    public String brand;
    public String model;
    public double fuelConsumption;

}
