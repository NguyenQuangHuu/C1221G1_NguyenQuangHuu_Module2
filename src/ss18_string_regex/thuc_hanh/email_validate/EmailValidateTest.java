package ss18_string_regex.thuc_hanh.email_validate;

public class EmailValidateTest {
    private static EmailValidate emailValidate;
    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String args[]) {
        emailValidate = new EmailValidate();
        for (String email : validEmail) {
            boolean isValid = emailValidate.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isValid);
        }
        for (String email : invalidEmail) {
            boolean isValid = emailValidate.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isValid);
        }
    }
}
