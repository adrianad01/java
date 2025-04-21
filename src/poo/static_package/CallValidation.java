package poo.static_package;

public class CallValidation {
    public static int COUNT = 0;

    CallValidation() {
        COUNT++;
    }

    boolean result = Validation.isValidEmail("test@test.com");
}
