import java.util.Scanner;

public class RickshaFareCalculator
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        //Basic input
        System.out.print("Enter distance(km): ");
        double distance=sc.nextDouble();
        sc.nextLine();
        
        System.out.print("\nEnter time(min): ");
        int time=sc.nextInt();
        sc.nextLine();
        
        System.out.print("\nEnter shift(Day\\Night): ");
        String shift=sc.next();
        sc.close();
        
        
        //Fare rule
        double baseFare=50;
        double costPerKm=10;
        double costPerMin=1;
        double maxDistaneLimit=5;
        double localDiscount=0.10;
        double nightCharge=0.5;
        
        //Calculations
        double fare=baseFare+ (distance*costPerKm) + (time*costPerMin);
        
        fare=(shift.equalsIgnoreCase("day") && distance>maxDistaneLimit)?fare-=localDiscount:fare;
        
        fare=(shift.equalsIgnoreCase("night"))?fare+=nightCharge:fare;
        
        System.out.println("\n\n=======Biratnagar Riksha Fare=======");
        System.out.println("Total fare: "+fare);
        
        
        
        
    }
}