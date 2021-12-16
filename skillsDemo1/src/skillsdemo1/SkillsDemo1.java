package skillsdemo1;

/**
 *
 * @author Liam Hayden
 * 
 * Date: 02/12/2021 - 16/12/2021
 */
public class SkillsDemo1 {
    public static void main(String[] args) {
        PetrolPump PP1 = new PetrolPump(0.75, 20000, 2, "Unleaded");
        TestPetrolPump TPP1 = new TestPetrolPump(PP1);
    }
}
