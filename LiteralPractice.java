public class LiteralPractice {

    public static void main(String[] args) {
        
        long largeNumber = 5000000000L; 
        float piEstimate = 3.14159f;
        char copyrightSymbol = '\u00A9'; 

    
        System.out.println("--- Specific Literal Practice ---");
        System.out.println("long value (requires 'L'):        " + largeNumber);
        System.out.println("float value (requires 'f'):       " + piEstimate);
        System.out.println("char value (Unicode \\u00A9):    " + copyrightSymbol);
    }
}