package spring_introduction_2;

public class Driver {

    private Car car;

    public Driver(Car car) {
        this.car = car;
    }

    public void callCar() {
        System.out.println("My car is ");
        car.sound();
    }
}
