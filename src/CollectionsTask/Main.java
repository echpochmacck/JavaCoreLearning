package CollectionsTask;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        // --- Добавление ---
        User tom = new User("tom", "qwerty", "2026-10-01");
        User anna = new User("anna", "12345", "2026-10-15");
        User max = new User("max", "pass", "2026-10-28");
        System.out.println(manager.addNewUser(tom));   // true
        System.out.println(manager.addNewUser(anna));  // true
        System.out.println(manager.addNewUser(max));   // true
        System.out.println(manager.addNewUser(new User("tom", "other", "2026-10-28"))); // false, логин занят
    }
}
