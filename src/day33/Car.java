package day33;

public class Car {
    public static void main(String[] args) {
        CarBranch car = new CarBranch();
        car.model1 = "Toyota";
        car.model2 = "Nissan";
        String model1 = car.getModel1();
        String model2 = car.getModel2();
        System.out.println(model1);
        System.out.println(model2);

    }
}
