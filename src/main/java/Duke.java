import java.util.Scanner;

public class Duke {
    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
        printGreeting();
        storeTasks();
    }

    public static void printGreeting() {
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
        while (true) {
            if (line.equals("list")) {
                printList(tasks, taskIndex);
            } else if (line.startsWith("done")) {
                int taskNo = Integer.parseInt(line.substring(5));
                tasks[taskNo-1].isDone = true;
                System.out.println("____________________________________________________________\n");
                System.out.println("Nice! I've marked this task as done:\n");
                System.out.println("[" + tasks[taskNo-1].getStatusIcon() + "]" + tasks[taskNo-1].description + "\n");
                System.out.println("____________________________________________________________\n");
            } else if (line.startsWith("todo")) {
                /*tasks[taskIndex] = new Task(line);
                taskIndex++;
                String fromDuke = "____________________________________________________________\n"
                        + "added: " + line + "\n"
                        + "____________________________________________________________\n";
                System.out.println(fromDuke);*/
                try {
                    String content = line.substring(5);
                    Todo newTodo = new Todo(content);
                    tasks[taskIndex] = newTodo;
                    taskIndex++;
                    printTodo(newTodo, taskIndex);
                } catch (StringIndexOutOfBoundsException e) {
                    System.out.println("____________________________________________________________\n");
                    System.out.println("☹ OOPS!!! The description of a todo cannot be empty.");
                    System.out.println("____________________________________________________________\n");
                }

            } else if (line.startsWith("deadline")) {
                try {
                    String content = line.substring(9, line.indexOf("/"));
                    String deadline = line.substring(line.indexOf("/") + 4);
                    Deadline newDeadline = new Deadline(content, deadline);
                    tasks[taskIndex] = newDeadline;
                    taskIndex++;
                    printDeadline(newDeadline, taskIndex);
                } catch (StringIndexOutOfBoundsException e) {
                    System.out.println("____________________________________________________________\n");
                    System.out.println("☹ OOPS!!! The description of a deadline cannot be empty.");
                    System.out.println("____________________________________________________________\n");
                }

            } else if (line.startsWith("event")) {
                try {
                    String content = line.substring(6, line.indexOf("/"));
                    String startTime = line.substring(line.indexOf("/") + 4);
                    Event newEvent = new Event(content, startTime);
                    tasks[taskIndex] = newEvent;
                    taskIndex++;
                    printEvent(newEvent, taskIndex);
                } catch (StringIndexOutOfBoundsException e) {
                    System.out.println("____________________________________________________________\n");
                    System.out.println("☹ OOPS!!! The description of an event cannot be empty.");
                    System.out.println("____________________________________________________________\n");
                }

            } else if (line.equals("bye")) {
                printBye();
                break;
            } else {
                System.out.println("____________________________________________________________\n");
                System.out.println("☹ OOPS!!! I'm sorry, but I don't know what that means :-(");
                System.out.println("____________________________________________________________\n");
            }
            System.out.println("\n");
            line = in.nextLine();
        }

    }

    public static void printBye() {
        String bye = "____________________________________________________________\n"
                + "Bye. Hope to see you again soon!\n"
                + "____________________________________________________________\n";
        System.out.println(bye);
    }

    public static void printList(Task[] tasks, int taskIndex) {
        System.out.println("____________________________________________________________\n");
        System.out.println("Here are the tasks in your list:\n");
        for (int i = 1; i <= taskIndex; i++) {
            System.out.println(i + "." + tasks[i-1].getSymbol() + tasks[i-1].getStatusIcon() + tasks[i-1].getDescription() + "\n");
        }
        System.out.println("____________________________________________________________\n");
    }

    public static void printTodo(Todo newTodo, int taskIndex) {
        /*String content = line.substring(5);
        Todo newTodo = new Todo(content);
        tasks[taskIndex] = newTodo;
        taskIndex++;*/
        System.out.println("____________________________________________________________\n");
        System.out.println("Got it. I've added this task: ");
        System.out.println(newTodo.symbol + newTodo.getStatusIcon() + " " + newTodo.description);
        System.out.println("Now you have " + taskIndex + " tasks in the list.");
        System.out.println("____________________________________________________________\n");
    }

    public static void printDeadline(Deadline newDeadline, int taskIndex) {
        /*String content = line.substring(9, line.indexOf("/"));
        String deadline = line.substring(line.indexOf("/") + 4);
        Deadline newDeadline = new Deadline(content, deadline);
        tasks[taskIndex] = newDeadline;
        taskIndex++;*/
        System.out.println("____________________________________________________________\n");
        System.out.println("Got it. I've added this task: ");
        System.out.println(newDeadline.symbol + newDeadline.getStatusIcon() + " " + newDeadline.description + "(by: " + newDeadline.deadline + ")");
        System.out.println("Now you have " + taskIndex + " tasks in the list.");
        System.out.println("____________________________________________________________\n");
    }

    public static void printEvent(Event newEvent, int taskIndex) {
        /*String content = line.substring(6, line.indexOf("/"));
        String startTime = line.substring(line.indexOf("/") + 4);
        Event newEvent = new Event(content, startTime);
        tasks[taskIndex] = newEvent;
        taskIndex++;*/
        System.out.println("____________________________________________________________\n");
        System.out.println("Got it. I've added this task: ");
        System.out.println(newEvent.symbol + newEvent.getStatusIcon() + " " + newEvent.description + "(at: " + newEvent.startTime + ")");
        System.out.println("Now you have " + taskIndex + " tasks in the list.");
        System.out.println("____________________________________________________________\n");
    }
}
