/*
* Represents all possible commands including invalid commands
* types of commands are represented by integers as follows:
* 1 - add Todo
* 2 - add Deadline
* 3 - add Event
* 4 - print task list
* 5 - delete task
* 6 - find task
* 7 - mark a task as done
* 0 - exit
* -1 - invalid command
* */
public class Command {
    public int commandType;

    public Command(int typeInteger) {
        this.commandType = typeInteger;
    }

    public Command() {
        this(-1); // -1 represents invalid input
    }

    /*
    * Function to print information of newly created todo/deadline/event object
    * returns nothing
    *
    * @param tasklist the TaskList object where newly created todo/deadline/event objects are stored
    * @param newTask the newly created todo/deadline/event object
    * */
    public void printCommand(TaskList tasklist, Task newTask) {
        System.out.println("____________________________________________________________\n");
        System.out.println("Got it. I've added this task: ");
        System.out.println(newTask.getSymbol() + newTask.getStatusIcon() + newTask.getDescription());
        System.out.println("Now you have " + tasklist.tasks.size() + " tasks in the list.");
        System.out.println("____________________________________________________________\n");
    }

    /*
    * Function to execute various commands, including add, delete and find tasks, etc.
    * returns nothing
    *
    * @param tasklist the TaskList object where all task information is stored
    * @param fullCommand the command text input by users
    * @throws DukeException when detecting incomplete and incorrect commands
    * */
    public void executeCommand(TaskList tasklist, String fullCommand) throws DukeException {
        switch (this.commandType) {
            case 1: // when the command is to add a new Todo
                if (fullCommand.length() <= 5) {
                    throw new DukeException("todo");
                }
                String description = fullCommand.substring(5);
                Task newTodo = new Todo(description);
                tasklist.tasks.add(newTodo);
                printCommand(tasklist, newTodo);
                break;
            case 2: // when the command is to add a new Deadline
                if (fullCommand.length() <= 9) {
                    throw new DukeException("deadline");
                }
                String content = fullCommand.substring(9, fullCommand.indexOf("/"));
                String deadline = fullCommand.substring(fullCommand.indexOf("/") + 4);
                Deadline newDeadline = new Deadline(content, deadline);
                tasklist.tasks.add(newDeadline);
                printCommand(tasklist, newDeadline);
                break;
            case 3: // when the command is to add a new Event
                if (fullCommand.length() <= 6) {
                    throw new DukeException("event");
                }
                String eventContent = fullCommand.substring(6, fullCommand.indexOf("/"));
                String startTime = fullCommand.substring(fullCommand.indexOf("/") + 4);
                Event newEvent = new Event(eventContent, startTime);
                tasklist.tasks.add(newEvent);
                printCommand(tasklist, newEvent);
                break;
            case 4: // when the command is to print the task list
                tasklist.printList();
                break;
            case 5: // when the command is to delete a task
                if (fullCommand.length() <= 7) {
                    throw new DukeException("delete");
                }
                int taskNo = Integer.parseInt(fullCommand.substring(7));
                tasklist.deleteTask(taskNo);
                break;
            case 6: // when the command is to find tasks containing a keyword
                if (fullCommand.length() <= 5) {
                    throw new DukeException("find");
                }
                String keyWord = fullCommand.substring(5);
                tasklist.findTask(keyWord);
                break;
            case 7: // when the command is to mark a task as done
                if (fullCommand.length() <= 5) {
                    throw new DukeException("done");
                }
                int taskIndex = Integer.parseInt(fullCommand.substring(5));
                tasklist.markAsDone(taskIndex);
            case 0: // when the command is to exit the system
                break;
            default: // when the command is invalid
                throw new DukeException();
        }
    }
}
