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
        storeTasks();
    }

    public static void printGreetings() {
        String greeting = "____________________________________________________________\n"
                + "Hello! I'm Duke\n"
                + "What can I do for you?\n"
                + "____________________________________________________________\n"
                + "\n";

        System.out.println(greeting);
    }

    public static void storeTasks() {
        String line;
        Task[] tasks = new Task[100];
        Scanner in = new Scanner(System.in);
        line  = in.nextLine();
        int taskIndex = 0;
        while (!line.equals("bye")) {
            if (line.equals("list")) {
                System.out.println("____________________________________________________________\n");
                System.out.println("Here are the tasks in your list:\n");
                for (int i = 1; i <= taskIndex; i++) {
                    System.out.println(i + "." + "["+ tasks[i-1].getStatusIcon() + "] " + tasks[i-1].description + "\n");
                }
                System.out.println("____________________________________________________________\n");
            } else if (line.startsWith("done")) {
                int taskNo = Integer.parseInt(line.substring(5));
                tasks[taskNo-1].isDone = true;
                System.out.println("____________________________________________________________\n");
                System.out.println("Nice! I've marked this task as done:\n");
                System.out.println("[" + tasks[taskNo-1].getStatusIcon() + "]" + tasks[taskNo-1].description + "\n");
                System.out.println("____________________________________________________________\n");
            } else {
                tasks[taskIndex] = new Task(line);
                taskIndex++;
                String fromDuke = "____________________________________________________________\n"
                        + "added: " + line + "\n"
                        + "____________________________________________________________\n";
                System.out.println(fromDuke);
            }
            System.out.println("\n");
            line = in.nextLine();
        }
        String bye = "____________________________________________________________\n"
                + "Bye. Hope to see you again soon!\n"
                + "____________________________________________________________\n";
        System.out.println(bye);
    }
}
