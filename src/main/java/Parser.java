public class Parser {

    public Parser() {

    }

    /*
     * 1 - add Todo
     * 2 - add Deadline
     * 3 - add Event
     * 4 - print task list
     * 5 - delete task
     * 6 - find task
     * 7 - mask as done
     * 0 - exit*/
    public Command analyzeCommand(String commandLine) {
        if (commandLine.startsWith("todo")) {
            return new Command(1);
        } else if (commandLine.startsWith("deadline")) {
            return new Command(2);
        } else if (commandLine.startsWith("event")) {
            return new Command(3);
        } else if (commandLine.equals("list")) {
            return new Command(4);
        } else if (commandLine.startsWith("delete")) {
            return new Command(5);
        } else if (commandLine.startsWith("find")) {
            return new Command(6);
        } else if (commandLine.startsWith("done")) {
            return new Command(7);
        } else if (commandLine.equals("bye")) {
            return new Command(0);
        } else {
            return new Command();
        }
    }
}
/*
* Represents an object that deals with user command input
* converts command texts to integers to represent different commands
* integers and their corresponding commands as follows:
* 1 - add Todo
* 2 - add Deadline
* 3 - add Event
* 4 - print task list
* 5 - delete task
* 6 - find task
* 7 - mask as done
* 0 - exit
* -1 - invalid command
* */
public class Parser {

    public Parser() {

    }

    /*
     * Function to analyze command texts typed in by users
     * by detecting the content or prefix or command text
     * this function determines the specific type of command
     * and convert commands into integers
     *
     * @param commandLine the command text input by users
     * @return Command object with different typeInteger to represent different types of commands
     * */
    public Command analyzeCommand(String commandLine) {
        if (commandLine.startsWith("todo")) {
            return new Command(1);
        } else if (commandLine.startsWith("deadline")) {
            return new Command(2);
        } else if (commandLine.startsWith("event")) {
            return new Command(3);
        } else if (commandLine.equals("list")) {
            return new Command(4);
        } else if (commandLine.startsWith("delete")) {
            return new Command(5);
        } else if (commandLine.startsWith("find")) {
            return new Command(6);
        } else if (commandLine.startsWith("done")) {
            return new Command(7);
        } else if (commandLine.equals("bye")) {
            return new Command(0);
        } else {
            return new Command();
        }
    }
}
