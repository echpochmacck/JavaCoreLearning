import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class CompareTask {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("NXSAXSDASDda", 123));
        users.add(new User("fa", 2));
        users.add(new User("MNasd", 1));
      users.sort(new UserComporator().thenComparing(new UserAgeComporator()));
      System.out.println(users);
    }

    static class User {
        private String name;
        private Integer age;

        public User(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "{"+this.getName() + "," + this.getAge()+"}";
        }
    }

    static class UserComporator implements Comparator<User> {
        @Override
        public int compare(User u1, User u2) {
            if (u1.getName().length() > u2.getName().length()) {
                return 1;
            } else if (u1.getName().length() == u2.getName().length()) {
                return 0;
            } else {
                return -1;
            }
        }
    }  static class UserAgeComporator implements Comparator<User> {
        @Override
        public int compare(User u1, User u2) {
            if (u1.getAge() > u2.getAge()) {
                return 1;
            } else if (u1.getAge() == u2.getAge()) {
                return 0;
            } else {
                return -1;
            }
        }
    }

}
