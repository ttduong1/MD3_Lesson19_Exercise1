package rikkei.academy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidator {
    public static boolean validate(String className) {
        String regex = "^[CAP][0-9]{4}[GHIKLM]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(className);
        return matcher.matches();
    }
    public static void main(String[] args) {
        // Ví dụ các tên lớp hợp lệ
        System.out.println(ClassNameValidator.validate("C0318G")); // true
        System.out.println(ClassNameValidator.validate("A1234H")); // true
        System.out.println(ClassNameValidator.validate("P5678L")); // true

        // Ví dụ các tên lớp không hợp lệ
        System.out.println(ClassNameValidator.validate("M0318G")); // false
        System.out.println(ClassNameValidator.validate("P0323A")); // false
        System.out.println(ClassNameValidator.validate("C03183")); // false (không kết thúc bằng chữ cái)
        System.out.println(ClassNameValidator.validate("C0318!")); // false (chứa ký tự đặc biệt)
    }

}

