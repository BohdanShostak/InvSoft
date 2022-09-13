import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;

public class TruckTest {

    public static Transport car1;
    public static Transport car2;
    public static Transport car3;
    public static Transport car4;

    @BeforeClass
    public static void createCars() {
        car1 = new Truck("truck", "Skoda", "Cargo", 14.5, 25000);
        car2 = new Truck("truck", "Skoda", "Cargo", 14.5, 25000);
        car3 = new Truck("truck", "Skoda", "Cargo", 14.5, 25000);
        car4 = new Truck("sedan", "Skoda", "Fabia", 4.2, 400);
    }

    @Test
    public void equalsReflexiveTest() {
        Assert.assertTrue(car1.equals(car1));
        Assert.assertTrue(car4.equals(car4));
    }

    @Test
    public void equalsSymmetricTest() {
        boolean expected = car1.equals(car2);
        boolean expected2 = car1.equals(car4);
        Assert.assertEquals(expected, car2.equals(car1));
        Assert.assertEquals(expected2, car4.equals(car1));
    }

    @Test
    public void equalsTransitiveTest() {
        boolean condition1 = car1.equals(car2);
        boolean condition2 = car2.equals(car3);
        boolean expected = condition1 & condition2;
        Assert.assertEquals(expected, car1.equals(car3));

        boolean condition21 = car1.equals(car2);
        boolean condition22 = car2.equals(car4);
        boolean expected2 = condition21 & condition22;
        Assert.assertEquals(expected2, car1.equals(car4));
    }

    @Test
    public void equalsConsistentTest() {
        Assert.assertEquals(car1.equals(car2), car1.equals(car2));
        Assert.assertEquals(car1.equals(car4), car1.equals(car4));
    }

    @Test
    public void equalsCompareToNullTest() {
        Assert.assertFalse(car1.equals(null));
    }

    @Test
    public void hashCodeOneObjectTest() {
        Assert.assertEquals(car1.hashCode(), car1.hashCode());
    }

    @Test
    public void hashCodeTwoEqualsObjects() {
        Assert.assertEquals(car1.hashCode(), car2.hashCode());
    }

    @Test
    public void EqualsHashCodeWithCollectionTest() {
        Collection<Transport> cars = new HashSet<>();
        cars.add(car1);
        cars.add(car1);
        cars.add(car1);
        Assert.assertEquals(1, cars.size());
    }

}
