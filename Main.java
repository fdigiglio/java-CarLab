//Import Scanner Class
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main{
    public static void main(String []args){

        DecimalFormat df = new DecimalFormat("###.##");


        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your start mileage: ");
        int startMileageInput = input.nextInt();

        System.out.print("What is your end mileage: ");
        int endMileageInput = input.nextInt();

        System.out.print("How many gallons have you used: ");
        double gallonsInput = input.nextDouble();

        Car car = new Car(startMileageInput, endMileageInput, gallonsInput);


        System.out.println("====================================================");
        System.out.println("Start Mileage: " + car.getStartMiles());
        System.out.println("End Mileage: " + car.getEndMiles());
        System.out.println("Gallons used: " + car.getGallons());
        System.out.println("Your MPG is: " + df.format(car.getMPG()));
    }
}