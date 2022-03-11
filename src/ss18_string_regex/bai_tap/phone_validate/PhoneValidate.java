package ss18_string_regex.bai_tap.phone_validate;

import java.util.regex.Pattern;

public class PhoneValidate {
    public static void main(String[] args) {
        String regEx = "^\\((\\d{2})\\)\\-\\((0\\d{7})\\)$";
        String num = "(84)-(02222222)";

        String num2 = "(a8)-(22222222)";
        boolean check = Pattern.matches(regEx,num);
        boolean check2 = Pattern.matches(regEx,num2);
        System.out.println(check);
        System.out.println(check2);
    }
}
