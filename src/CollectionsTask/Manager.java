package CollectionsTask;

import java.util.ArrayList;
import java.util.HashMap;

public class Manager {
    private HashMap<String,User> userCol;
    public Manager() {
        this.userCol = new HashMap<>();
    }
    public boolean login (String login, String password) {
        User obj = this.userCol.get(login);
        if (obj != null) {
            System.out.println("Login is " + obj.getPassword() == password ? true :false);
          return obj.getPassword() == password ? true :false;
        }else {
            return false;
        }
    }

    public boolean addNewUser(User user) {
        if (this.userCol.containsKey(user.getLogin())) {
            System.out.println("User already exists");
            return false;
        }else {
            this.userCol.put(user.getLogin(), user);
            System.out.println("sucess add ");

            return true;
        }

    }

    public boolean deleteUser(User user) {
        if (user != null) {
           return this.userCol.remove(user.getLogin(), user);
        }else {
            return false;
        }
    }
}
