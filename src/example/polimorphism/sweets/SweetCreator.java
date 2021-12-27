package example.polimorphism.sweets;

import java.util.List;

public class SweetCreator {

    private List<SweetProducer> sweetProducers;

    public SweetCreator(List<SweetProducer> sweetProducers) {
        this.sweetProducers = sweetProducers;
    }

    public void createSweets() {
        sweetProducers.forEach(SweetProducer::produceSweet);
    }
}
