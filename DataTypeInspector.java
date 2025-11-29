
public class DataTypeInspector
{
    

    public static void main(String[] args) {
        
        // --- 1. Integer Types ---
        byte myByte = 127; 
        short myShort = 32000;
        int myInt = 2147483647; // Underscores for readability (since Java 7)
        long myLong = 9000000000L; 
        float myFloat = 3.14159f; 
        double myDouble = 1.23456789012345; 

        // --- 3. Character Type ---
        char myChar = 'A'; 

        // --- 4. Boolean Type --
        boolean myBoolean = true; 

        System.out.println("--- Java Primitive Data Types Inspector ---");
        System.out.println("byte (8-bit integer):    " + myByte);
        System.out.println("short (16-bit integer):  " + myShort);
        System.out.println("int (32-bit integer):    " + myInt);
        System.out.println("long (64-bit integer):   " + myLong);
        System.out.println("float (32-bit decimal):  " + myFloat);
        System.out.println("double (64-bit decimal): " + myDouble);
        System.out.println("char (16-bit Unicode):   " + myChar);
        System.out.println("boolean (truth value):   " + myBoolean);
    
}
}