package Rock;

public class SedimentaryRock extends Rock {
    public SedimentaryRock(int sampleNumber, double weight) {
        super(sampleNumber, weight);
        setDescription("Sedimentary rocks are formed by the accumulation and compaction of mineral " +
                     "and organic particles, often through water or wind deposition, and may contain fossils.");
    }
}