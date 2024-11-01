public class App{

    public static void main(String[] args)
    {
        Car davesCar = new Car("Ford Galaxy", 40, 33.6);

        String model = davesCar.getModel();

        double distance = davesCar.estDistance();

        System.out.println(model + " can travel " + distance + " miles");
    }
}

