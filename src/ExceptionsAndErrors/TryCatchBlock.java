package ExceptionsAndErrors;

import java.io.*;

public class TryCatchBlock {
    public static void main(String[] args) {
//        try {
//            FileInputStream fis = new FileInputStream("e:/test.txt");
//            System.out.println("I'm learning exception");
//            fis.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }finally {
//            System.out.println("Finally block");
//        }
        try {
            readFile();

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readFile() throws MyException {
        BufferedReader fin = null;
        String fileName = "e:/Main.java";
        try {
            fin = new BufferedReader(new FileReader(fileName));
        } catch (Exception e) {
            throw new MyException("Error with file", fileName);
        }
        String line;
        while(true) {
            try {
                if (!((line = fin.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(line);
        }
    }
}
