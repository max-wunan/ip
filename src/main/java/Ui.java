import java.util.Scanner;

public class Ui {

    public Ui() {

    }

    public void printGreeting() {
        String greeting = "____________________________________________________________\n"
                + "Hello! I'm Duke\n"
                + "What can I do for you?\n"
                + "____________________________________________________________\n"
                + "\n";

        System.out.println(greeting);
    }

    public void printBye() {
        String bye = "____________________________________________________________\n"
                + "Bye. Hope to see you again soon!\n"
                + "____________________________________________________________\n";
        System.out.println(bye);
    }

    public void printLine() {
        System.out.println("____________________________________________________________\n");
    }

    public String readCommand() {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        return line;
    }
}
