package Rock;

public class MetamorphicRock extends Rock {
    public MetamorphicRock(int sampleNumber, double weight) {
        super(sampleNumber, weight);
        setDescription("Metamorphic rocks are formed when existing rocks are transformed by heat, " +
                     "pressure, or chemical processes while remaining solid, creating new textures and minerals.");
    }
}