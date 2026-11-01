package ExceptionsAndErrors.Practice;

public class Practice {
    public void validateRegistration(String login, String password, String confirmPassword) {
        validateEmpty(login, "login");
        validateEmpty(password, "password");
        validateEmpty(confirmPassword, "confirmPassword");
        validateLength(login, "login");
        validateLength(password, "password");
        validateLength(confirmPassword, "confirmPassword");
        validatePassowrdConfirm(password, confirmPassword);
        validateReg(login, "login");
        validateReg(password, "password");
        validateReg(confirmPassword, "confirmPassword");
    }

    private static void validateEmpty(String item, String fieldName) {
        if (item.isBlank()) {
            throw new EmptyFields(fieldName);
        }
    }

    private static void validateLength(String item, String fieldName) {
        if (item.length() > 20) {
            throw new TooLongString(fieldName);
        }
    }

    private static void validatePassowrdConfirm(String pswd, String confirm) {
        if (!pswd.equals(confirm)) {
            throw new Confirm();
        }
    }
    private static void validateReg(String item, String fieldName) {
      String reg = "^[a-zA-Z0-9]+$";
      if (!item.matches(reg)) {
          throw new RegError(fieldName);
      }
    }

    public static void main(String[] args) {
        Practice practice = new Practice();

        // ✅ Должны пройти
        test(practice, "Валидные данные", "user", "pass123", "pass123");
        test(practice, "Подчёркивание", "user_name", "pass_123", "pass_123");
        test(practice, "Пароли разными объектами", "user", "pass123", new String("pass123"));
        test(practice, "Ровно 20 символов", "a".repeat(20), "pass", "pass");

        // ❌ Должны упасть
        test(practice, "null логин", null, "pass", "pass");
        test(practice, "Пустой логин", "", "pass", "pass");
        test(practice, "Пустой пароль", "user", "", "");
        test(practice, "21 символ", "a".repeat(21), "pass", "pass");
        test(practice, "Недопустимый символ", "user@name", "pass", "pass");
        test(practice, "Кириллица", "юзер", "pass", "pass");
        test(practice, "Пароли не совпадают", "user", "pass123", "pass124");
    }

    private static void test(Practice practice, String caseName,
                             String login, String password, String confirm) {
        try {
            practice.validateRegistration(login, password, confirm);
            System.out.println("✅ " + caseName + ": OK");
        } catch (Exception e) {
            System.out.println("❌ " + caseName + ": "
                    + e.getClass().getSimpleName() + " — " + e.getMessage());
        }
    }

}
