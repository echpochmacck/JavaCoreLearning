import java.io.*;

public class UserTest {
    public static void main(String[] args) throws IOException {
        User user = new User();
        user.setName("Maxim");
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\test\\user.dat"))) {
            oos.writeObject(user);
        } catch (IOException e) {
            System.out.println(e);
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\test\\user.dat"))) {
            User user2 = (User) ois.readObject();
            System.out.println(user.equals(user2));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
