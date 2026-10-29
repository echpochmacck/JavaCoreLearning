import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileGenerator {
    public static void main(String[] args) throws IOException {
//        new directory
        File dir = new File("c:/test");
//        new directory
        dir.mkdir();

        for (int i = 0; i < 20; i++) {
            File f = new File(dir, "test_" + i + ".txt");
            f.createNewFile();

//          practice 2
            try (OutputStream os = new FileOutputStream(f);
            BufferedOutputStream bos = new BufferedOutputStream(os);
            ) {
                bos.write(("Java" + i).getBytes(StandardCharsets.UTF_8));
            }catch(IOException e ) {
                System.out.println(e);
            }
        }
        for (File file: dir.listFiles()) {
            try(FileReader fr = new FileReader(file) ) {
                Scanner sc = new Scanner(fr);
                while(sc.hasNextLine()) {
                    if (sc.nextLine().equals("Java7")) {
                        System.out.println("Я нашел этот файл");
                        System.out.println(file.getName());

                    }
                }
            }
        }
    }
}
