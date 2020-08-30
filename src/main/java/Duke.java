import java.util.Scanner;

public class Duke {
    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
        printGreetings();
        analyzeCommand();
    }
    
    public static void printGreetings() {
        String greeting = "____________________________________________________________\n"
                + "Hello! I'm Duke\n"
                + "What can I do for you?\n"
                + "____________________________________________________________\n";

        System.out.println(greeting);
    }
    
    public static void analyzeCommand() {
        String line;
        Scanner in = new Scanner(System.in);
        line  = in.nextLine();
        while (!line.equals("bye")) {
            String fromDuke = "____________________________________________________________\n"
                    + line + "\n"
                    + "____________________________________________________________\n"
                    + "\n";
            System.out.println(fromDuke);
            line = in.nextLine();
        }
        String bye = "____________________________________________________________\n"
                + "Bye. Hope to see you again soon!\n"
                + "____________________________________________________________\n";
        System.out.println(bye);
    }
}
