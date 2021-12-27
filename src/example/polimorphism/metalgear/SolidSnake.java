package example.polimorphism.metalgear;

public class SolidSnake extends MetalGearCharacter {

    @Override
    void useWeapon(String weapon) {
        System.out.println("Solid Snake is using a " + weapon);
    }

}
