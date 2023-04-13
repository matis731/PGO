public class Car {
    private double engine_capacity;

     Car(String color, String brand, double engine_capacity) {
        this.color = color;
        this.brand = brand;
        this.engine_capacity = engine_capacity;
    }

    private final String color;
    private final String brand;

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public double getEngineCapacity() {
        return engine_capacity;
    }

    public void setEngineCapacity(double engine_capacity) {
        this.engine_capacity = engine_capacity;
    }

    public boolean isHighRevving() {
        return engine_capacity >= 2.0;
    }

    public static void main(String[] args) {
        Car myCar = new Car("czarny", "Audi", 2.0);
        System.out.println("Marka: " + myCar.getBrand()); // Marka: Audi
        System.out.println("Kolor: " + myCar.getColor()); // Kolor: czarny
        System.out.println("Pojemność silnika: " + myCar.getEngineCapacity() + " l"); // Pojemność silnika: 2.0 l
        System.out.println("Czy silnik jest wysokoobrotowy? " + myCar.isHighRevving()); // Czy silnik jest wysokoobrotowy? true

        myCar.setEngineCapacity(1.6);
        System.out.println("Nowa pojemność silnika: " + myCar.getEngineCapacity() + " l"); // Nowa pojemność silnika: 1.6 l
        System.out.println("Czy silnik jest wysokoobrotowy? " + myCar.isHighRevving()); // Czy silnik jest wysokoobrotowy? false
    }


}

