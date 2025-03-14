package BinaryConverter;
public class BinaryConverter {
    public static void main(String[] args) {
        int decimal = 25;
        String binary = ""; 

        while (decimal > 0) {
            binary = (decimal % 2) + binary; 
            decimal /= 2; 
        }

        System.out.println("Binary: " + binary);
    }
}
