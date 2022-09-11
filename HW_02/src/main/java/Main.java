public class Main {

    public static void main(String[] args) {

        Transport car1 = new Transport("car", "Skoda", "Octavia", 4.5);
        Transport car2 = new Sedan("sedan", "Skoda", "Octavia", 4.5, "Grey");
        Transport car3 = new Wagon("wagon", "Skoda", "Octavia", 4.5, 450);

        System.out.println("Hash code: ");
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());

        System.out.print("reflexive: ");
        System.out.println(car1.equals(car1));
        System.out.print("symmetric: ");
        System.out.println(car1.equals(car2));
        System.out.println(car2.equals(car1));
        System.out.print("transitive: ");
        System.out.println(car1.equals(car2));
        System.out.println(car2.equals(car3));
        System.out.println(car1.equals(car3));
        System.out.print("consistent: ");
        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car2));
        System.out.println("Change object");
        car2.setModel("Fabia");
        System.out.println(car1.equals(car2));
        System.out.print("Compare to null: ");
        System.out.println(car1.equals(null));
    }

}
