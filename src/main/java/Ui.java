import java.util.Scanner;

/*
* Represents an object with the function of user interaction
* deals with the command text typed in by users
* as well as signals the start and end of the whole program
* */
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
import java.util.Scanner;

/*
* Represents an object with the function of user interaction
* deals with the command text typed in by users
* as well as signals the start and end of the whole program
* */
public class Ui {

    public Ui() {

    }

    /*
    * Function to print welcome texts every time this app is launched
    * no parameter, returns nothing
    * */
    public void printGreeting() {
        String greeting = "____________________________________________________________\n"
                + "Hello! I'm Duke\n"
                + "What can I do for you?\n"
                + "____________________________________________________________\n"
                + "\n";

        System.out.println(greeting);
    }

    /*
    * Function to print the ending message for users
    * no parameter, returns nothing
    * */
    public void printBye() {
        String bye = "____________________________________________________________\n"
                + "Bye. Hope to see you again soon!\n"
                + "____________________________________________________________\n";
        System.out.println(bye);
    }

    public void printLine() {
        System.out.println("____________________________________________________________\n");
    }

    /*
    * Function to read the command input by users and store them as Strings
    * make it easy to pass the command text of users to other functions
    * for command analyzing and executing purposes
    * no parameters
    *
    * @return String object the command text input by user
    * */
    public String readCommand() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
import java.util.Scanner;

/*
* Represents an object with the function of user interaction
* deals with the command text typed in by users
* as well as signals the start and end of the whole program
* */
public class Ui {

    public Ui() {

    }

    /*
    * Function to print welcome texts every time this app is launched
    * no parameter, returns nothing
    * */
    public void printGreeting() {
        String greeting = "____________________________________________________________\n"
                + "Hello! I'm Duke\n"
                + "What can I do for you?\n"
                + "____________________________________________________________\n"
                + "\n";

        System.out.println(greeting);
    }

    /*
    * Function to print the ending message for users
    * no parameter, returns nothing
    * */
    public void printBye() {
        String bye = "____________________________________________________________\n"
                + "Bye. Hope to see you again soon!\n"
                + "____________________________________________________________\n";
        System.out.println(bye);
    }

    public void printLine() {
        System.out.println("____________________________________________________________\n");
    }

    /*
    * Function to read the command input by users and store them as Strings
    * make it easy to pass the command text of users to other functions
    * for command analyzing and executing purposes
    * no parameters
    *
    * @return String object the command text input by user
    * */
    public String readCommand() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
