package poo.static_package;

public class Validation {

    private String email;

    public Validation(String email) {
        this.email = email;
    }

    public Validation() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static boolean isValidEmail(String email) {
        return email != null && !email.contains("@");
    }
}
