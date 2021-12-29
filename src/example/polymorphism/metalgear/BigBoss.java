package example.polymorphism.metalgear;

public class BigBoss extends MetalGearCharacter {

    @Override
    void useWeapon(String weapon) {
        System.out.println("Big boss is using a " + weapon);
    }

    void giverOrderToTheArmy(String orderMessage) {
        System.out.println(orderMessage);
    }
}
