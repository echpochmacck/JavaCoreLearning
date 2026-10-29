package CollectionsTask;

import java.util.Objects;

public class User {
    private String login;
    private String password;
    private String createdDate;

    public User(String login, String password, String createdDate) {
        this.login = login;
        this.password = password;
        this.createdDate = createdDate;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password) && Objects.equals(createdDate, user.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, createdDate);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", createdDate='" + createdDate + '\'' +
                '}';
    }
}
