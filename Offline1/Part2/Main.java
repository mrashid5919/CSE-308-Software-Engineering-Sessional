import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your continental location: ");
        Scanner sc=new Scanner(System.in);
        String location=sc.nextLine();

        CarFactory carFactory=new CarFactory();

        Car car=carFactory.getCar(location);

        car.info();
    }
}
