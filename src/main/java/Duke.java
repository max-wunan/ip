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
        storeText();
    }

    public static void printGreetings() {
        String greeting = "____________________________________________________________\n"
                + "Hello! I'm Duke\n"
                + "What can I do for you?\n"
                + "____________________________________________________________\n"
                + "\n";

        System.out.println(greeting);
    }

    public static void storeText() {
        String line;
        String[] texts = new String[100];
        Scanner in = new Scanner(System.in);
        line  = in.nextLine();
        int textIndex = 0;
        while (!line.equals("bye")) {
            if (line.equals("list")) {
                System.out.println("____________________________________________________________\n");
                for (int i = 1; i <= textIndex; i++) {
                    System.out.println(i + "." + texts[i-1]);
                }
                System.out.println("____________________________________________________________\n");
            } else {
                texts[textIndex] = line;
                textIndex++;
                String fromDuke = "____________________________________________________________\n"
                        + "added: " + line + "\n"
                        + "____________________________________________________________\n"
                        + "\n";
                System.out.println(fromDuke);
            }
            line = in.nextLine();
        }
        String bye = "____________________________________________________________\n"
                + "Bye. Hope to see you again soon!\n"
                + "____________________________________________________________\n";
        System.out.println(bye);
    }
}
