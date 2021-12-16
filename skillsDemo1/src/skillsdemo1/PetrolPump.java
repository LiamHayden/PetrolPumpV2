package skillsdemo1;

/**
 *
 * @author Liam Hayden
 * 
 * Date: 02/12/2021
 */
public class PetrolPump {
    // declare instance variables
    private Double pricePerLitre, amountOfLitresInPump, minPumpQuantity;
    final String petrolType;
    
    // constructor 
    public PetrolPump() {
        pricePerLitre = 0d;
        amountOfLitresInPump = 0d;
        minPumpQuantity = 0d;
        petrolType = "";
    }
    
    public PetrolPump(double price, double numOfLitres, double minQuantityForPump, String fuelType) {
        this.pricePerLitre = price;
        this.amountOfLitresInPump = numOfLitres;
        this.minPumpQuantity = minQuantityForPump;
        this.petrolType = fuelType;
    }
    
    // method to add fuel
    public void addFuel(double amountOfPetrolPerPump) {
        amountOfLitresInPump += amountOfPetrolPerPump;
    }
    
    // method to fill car
    public float fillCarFromPump(double amountOfFuelCarRequires) {
        float price = (float) (pricePerLitre * amountOfFuelCarRequires);
        amountOfLitresInPump -= amountOfFuelCarRequires;
        return price;
    }
    
    // getters
    public double getPricePerLitre() {
        return pricePerLitre;
    }
    
    public double getAmountOfLitresInPump() {
        return amountOfLitresInPump;
    }
    
    public double getMinPumpQuantity() {
        return minPumpQuantity;
    }
    
    public String getPetrolType() {
        return petrolType;
    }
    
    // setters
    public void setPrice(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }
    
    public void setMinPumpQuantity(double minPumpQuantity) {
        this.minPumpQuantity = minPumpQuantity;
    }
}
