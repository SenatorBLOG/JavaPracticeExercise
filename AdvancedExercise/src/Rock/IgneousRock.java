package Rock;

public class IgneousRock extends Rock {
    public IgneousRock(int sampleNumber, double weight) {
        super(sampleNumber, weight);
        setDescription("Igneous rocks form through the cooling and solidification of magma or lava. " +
                     "They can be intrusive (formed underground) or extrusive (formed at the surface).");
    }
}
