import java.io.FileNotFoundException;
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.io.File;
//import java.io.FileWriter;
import java.io.IOException;

/*
* Represents the whole Duke project
* a Duke(filepath) object represents a Duke project
* that store all task information in file at the path of filepath
* */
public class Duke {

    private Storage storage;
    private TaskList tasklist;
    private Ui ui;


    /*
    * The constructor for a Duke object, returns nothing
    * loading the task information that already exist in the file
    * which is written by previous runs before each run
    *
    * @param the path of the file on which the task information is written
    * @throws FileNotFoundException when the file is not found at the path given
    * */
    public Duke(String filePath) {
        ui = new Ui();
        storage = new Storage(filePath);
        try {
            tasklist = new TaskList(storage.load());
        } catch (FileNotFoundException e) {
            ui.printLine();
            System.out.println("☹ OOPS!!! There is something wrong with the file: ");
            System.out.println(e.getMessage());
            ui.printLine();
            tasklist = new TaskList();
        }
    }

    /*
    * Function that execute the functions of this app
    * no parameters, returns nothing
    * continues the running until command "bye" is typed in to break the loop
    * call functions to execute each specific functions
    *
    * @throws DukeException when the command typed in is incomplete or different from any existing commands
    * @throws IOEException when issues are detected during file writing
    * */
    public void run() {
        ui.printGreeting();
        boolean isExit = false;
        Parser parser = new Parser();
        while(!isExit) {
            try{
                String fullCommand = ui.readCommand();
                Command newCommand = parser.analyzeCommand(fullCommand);
                newCommand.executeCommand(tasklist, fullCommand);
                if (newCommand.commandType == 0) {
                    storage.writeToFile(tasklist.tasks);
                    ui.printBye();
                    isExit = true;
                }
            } catch (DukeException e) {
                switch (e.type) {
                    case "todo": // no description given after todo
                        ui.printLine();
                        System.out.println("☹ OOPS!!! The description of a todo cannot be empty.");
                        ui.printLine();
                        break;
                    case "deadline": // no description given after deadline
                        ui.printLine();
                        System.out.println("☹ OOPS!!! The description of a deadline cannot be empty.");
                        ui.printLine();
                        break;
                    case "event": // no description given after event
                        ui.printLine();
                        System.out.println("☹ OOPS!!! The description of an event cannot be empty.");
                        ui.printLine();
                        break;
                    case "delete": // no index given after delete
                        ui.printLine();
                        System.out.println("☹ OOPS!!! I don't understand what you want to delete :-(");
                        ui.printLine();
                        break;
                    case "find": // no index given after find
                        ui.printLine();
                        System.out.println("☹ OOPS!!! I don't understand what you want to find :-(");
                        ui.printLine();
                        break;
                    case "done": // no index given after done
                        ui.printLine();
                        System.out.println("☹ OOPS!!! I don't understand what you have done :-(");
                        ui.printLine();
                    case "invalid description": // invalid command input
                        ui.printLine();
                        System.out.println("☹ OOPS!!! I'm sorry, but I don't know what that means :-(");
                        ui.printLine();
                        break;
                    case "delete non-existing task": // trying to delete tasks that do not exist
                        ui.printLine();
                        System.out.println("☹ OOPS!!! You can't delete a task that doesn't exist :-(");
                        ui.printLine();
                    case "mark non-existent task as done": // trying to mark non-existing task as done
                        ui.printLine();
                        System.out.println("☹ OOPS!!! You can't mark a task that doesn't exist as done :-(");
                        ui.printLine();
                    case "already done": // trying to mark task that is already done as done
                        ui.printLine();
                        System.out.println("☹ OOPS!!! You can't mark a task that is already done as done :-(");
                        ui.printLine();

                }
            } catch (IOException e) {
                ui.printLine();
                System.out.println("☹ OOPS!!! There is something wrong with the file: ");
                System.out.println(e.getMessage());
                ui.printLine();
            }


        }
    }

    public static void main(String[] args) {
        new Duke("src/main/java/duke.txt").run();
    }
}
