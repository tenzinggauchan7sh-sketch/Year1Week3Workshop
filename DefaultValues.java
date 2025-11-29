public class DefaultValues {

    // automatically assigned default values by the Java Virtual Machine (JVM).
    byte defaultByte;
    short defaultShort;
    int defaultInt;
    long defaultLong;
    float defaultFloat;
    double defaultDouble;
    char defaultChar;
    boolean defaultBoolean;

    public static void main(String[] args) {
        
        // object to access instance variables
        DefaultValues inspector = new DefaultValues();

        System.out.println("--- Default Values of Uninitialized Member Variables ---");
        System.out.println("byte:    " + inspector.defaultByte);
        System.out.println("short:   " + inspector.defaultShort);
        System.out.println("int:     " + inspector.defaultInt);
        System.out.println("long:    " + inspector.defaultLong);
        System.out.println("float:   " + inspector.defaultFloat);
        System.out.println("double:  " + inspector.defaultDouble);
        System.out.println("char:    '" + inspector.defaultChar + "' (Unicode value 0)");
        System.out.println("boolean: " + inspector.defaultBoolean);

        /*
        * Local variables (variables declared inside a method like main) 
        * MUST be explicitly initialized before use.
        * Java does not assign default values to local variables to prevent
        * uninitialized data from being used, which could lead to unpredictable results.
        * Compiling code that uses an uninitialized local variable results in a compiler error.
        * * Example of what WON'T compile:
        * int uninitializedLocal;
        * System.out.println(uninitializedLocal); // Compiler Error!
        */
    }
}