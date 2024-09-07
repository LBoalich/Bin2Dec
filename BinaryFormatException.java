/*Custom exception that extends Exception */
public class BinaryFormatException extends Exception {
    /** Construct an exception */
    public BinaryFormatException(String binaryString) {
        //Create exception message
        super("Invalid string " + binaryString + " is not a binary string");
    }
}
