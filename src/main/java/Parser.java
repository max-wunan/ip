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
