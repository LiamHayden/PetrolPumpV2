package skillsdemo1;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author Liam Hayden
 * 
 * Date: 02/12/2021 - 16/12/2021
 */

public class TestPetrolPump {
    
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat dc = new DecimalFormat("€##,###.00");
    
    public TestPetrolPump(Object obj) {
        double petrolToPurchase;
        System.out.println("Enter the amount of petrol(litres) you wish to purchase: ");
        petrolToPurchase = sc.nextDouble();
        
        // check amount of petrol in pump
        if (petrolToPurchase < obj.getMinPumpQuantity()) {
            System.out.println("You cannot get less than " + PP1.getMinPumpQuantity() + " petrol quantity.");
        }
        // check petrol in pump
        else if (petrolToPurchase > PP1.getAmountOfLitresInPump()) {
            System.out.println("Sale cannot be completed. There is not enough petrol in the pump.");
        }
        else {
            System.out.println("Price: " + dc.format(PP1.fillCarFromPump(petrolToPurchase)));
        }
        
        // Refill pump
        PP1.addFuel(1000);
        System.out.println("Amount of fuel in petrol pump: " + PP1.getAmountOfLitresInPump());
    }
}
