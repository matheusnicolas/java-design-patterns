package example.polymorphism.sweets;

public class CakeProducer extends SweetProducer {

    @Override
    public void produceSweet() {
        System.out.println("Sweet produced!");
    }

}
