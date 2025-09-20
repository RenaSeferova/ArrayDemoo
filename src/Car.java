public class Car {
    String model;
    String make;
    int year;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                '}';
    }

    public Car(String model, String make, int year) {
        this.model = model;
        this.make = make;
        this.year = year;
    }
}
