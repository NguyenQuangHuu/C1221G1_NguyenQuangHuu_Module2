package ss18_string_regex.bai_tap.class_name_validate;

import java.util.regex.Pattern;

public class NameClassValidate {
    public static void main(String[] args) {
        String str = "M0318G";
        String regex = "^[ACP]\\d{4}[GHIKLM]$";

        boolean check = Pattern.matches(regex,str);
        System.out.println(check);

    }
}
