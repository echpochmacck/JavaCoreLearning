import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how OpenIDE suggests fixing it.
        System.out.print("Hello and welcome!");
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
        System.out.println(userInput);

    }
}