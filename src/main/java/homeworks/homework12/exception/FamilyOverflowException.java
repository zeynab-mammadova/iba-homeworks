package homeworks.homework12.exception;

public class FamilyOverflowException extends RuntimeException {
    public FamilyOverflowException(String s) {
        super(s);
        System.out.println(s);
    }
}
