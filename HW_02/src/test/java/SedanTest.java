import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SedanTest {

    public static Transport car1;
    public static Transport car2;
    public static Transport car3;
    public static Transport car4;

    @BeforeClass
    public static void createCars() {
        car1 = new Sedan("sedan", "Skoda", "Octavia", 4.5, "Grey");
        car2 = new Sedan("sedan", "Skoda", "Octavia", 4.5, "Grey");
        car3 = new Sedan("sedan", "Skoda", "Octavia", 4.5, "Grey");
        car4 = new Sedan("sedan", "Skoda", "Fabia", 4.2, "Black");
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
    public void hashCodeTwoObjectsTest() {
        if (car1.equals(car2)) {
            Assert.assertEquals(car1.hashCode(), car2.hashCode());
        } else {
            Assert.assertNotEquals(car1.hashCode(), car2.hashCode());
        }
        if (car1.equals(car4)) {
            Assert.assertEquals(car1.hashCode(), car4.hashCode());
        } else {
            Assert.assertNotEquals(car1.hashCode(), car4.hashCode());
        }
    }

}
