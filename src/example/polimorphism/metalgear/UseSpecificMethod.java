package example.polimorphism.metalgear;

public class UseSpecificMethod {

    public static void executeActionWith(MetalGearCharacter metalGearCharacter) {
        metalGearCharacter.useWeapon("SOCOM");

        if (metalGearCharacter instanceof BigBoss) {
            ((BigBoss) metalGearCharacter).giverOrderToTheArmy("Attack");
        }
    }

    public static void main(String[] args) {
        executeActionWith(new SolidSnake());
        executeActionWith(new BigBoss());
    }
}
