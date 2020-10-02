import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Storage {

    protected String filePath;

    public Storage(String filePath) {
        this.filePath = filePath;
    }

    public void writeToFile(ArrayList<Task> tasks) throws IOException {
        FileWriter dukeText = new FileWriter(this.filePath);
        for (Task task : tasks) {
            dukeText.write(task.getSymbol() + " | " + task.getStatusIcon() + " | " + task.getDescription());
        }
        dukeText.close();
    }

    public ArrayList<Task> load() throws FileNotFoundException {
        File dukeText = new File(this.filePath);
        Scanner in = new Scanner(dukeText);
        ArrayList<Task> tasks = new ArrayList<>();
        while (in.hasNext()) {
            String line = in.nextLine();
            String[] taskInfo = line.split("|");
            if (taskInfo[0].contains("[T]")) {
                Task newTask = new Todo(taskInfo[2].trim());
                if (taskInfo[1].contains("[\u2713]")) {
                    newTask.isDone = true;
                } else {
                    newTask.isDone = false;
                }
                tasks.add(newTask);
            } else if (taskInfo[0].contains("[D]")) {
                String description = line.substring(0,line.indexOf("(by: "));
                String deadline = line.substring(line.indexOf("(by: " + 5), line.indexOf(")"));
                Task newTask = new Deadline(description.trim(), deadline);
                if (taskInfo[1].contains("[\u2713]")) {
                    newTask.isDone = true;
                } else {import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
* Represents an object that deals with loading information from a file
* as well as writing information into it
* A Storage(filepath) object corresponds to an object that can read and write
* into the file at the path given by filepath
* */
public class Storage {

    protected String filePath;

    public Storage(String filePath) {
        this.filePath = filePath;
    }

    /*
    * Function to write task information into the txt file at given path
    * returns nothing
    * if the ArrayList is empty, nothing will be written
    *
    * @param task the ArrayList whose data will be stored into the file
    * @throws IOEException when file writing encounters issues
    * */
    public void writeToFile(ArrayList<Task> tasks) throws IOException {
        FileWriter dukeText = new FileWriter(this.filePath);
        for (Task task : tasks) {
            dukeText.write(task.getSymbol() + " | " + task.getStatusIcon() + " | " + task.getDescription() + "\n");
        }
        dukeText.close();
    }

    /*
    * Function to read from a file and store all the data into an ArrayList
    * returns the ArrayList storing all data read from the file
    * if the file is empty, the ArrayList will be instantiated as an empty new ArrayList
    * no parameters
    *
    * @return ArrayList<Task> tasks that stores all task information read from the file
    * @throws FileNotFoundException when no file is found at the path given
    * */
    public ArrayList<Task> load() throws FileNotFoundException {
        File dukeText = new File(this.filePath);
        Scanner in = new Scanner(dukeText);
        ArrayList<Task> tasks = new ArrayList<>();
        while (in.hasNext()) {
            String line = in.nextLine();
            //String[] taskInfo = line.split("|");
            if (line.substring(0,3).equals("[T]")) {
                Task newTask = new Todo(line.substring(12));
                newTask.isDone = line.substring(6,9).equals("[\u2713]");
                tasks.add(newTask);
            } else if (line.substring(0,3).equals("[D]")) {
                String description = line.substring(12,line.indexOf("(by: "));
                String deadline = line.substring(line.indexOf("(by: " + 5), line.indexOf(")"));
                Task newTask = new Deadline(description, deadline);
                newTask.isDone = line.substring(6,9).equals("[\u2713]");
                tasks.add(newTask);
            } else if (line.substring(0,3).equals("[E]")) {
                String description = line.substring(12,line.indexOf("(at: "));
                String eventTime = line.substring(line.indexOf("(at : " + 5), line.indexOf(")"));
                Task newTask = new Event(description, eventTime);
                newTask.isDone = line.substring(6,9).equals("[\u2713]");
                tasks.add(newTask);
            }
        }
        return tasks;
    }
}

                    newTask.isDone = false;
                }
                tasks.add(newTask);
            } else if (taskInfo[0].contains("[E]")) {
                String description = line.substring(0,line.indexOf("(at: "));
                String eventTime = line.substring(line.indexOf("(at : " + 5), line.indexOf(")"));
                Task newTask = new Event(description.trim(), eventTime);
                if (taskInfo[1].contains("[\u2713]")) {
                    newTask.isDone = true;
                } else {
                    newTask.isDone = false;
                }
                tasks.add(newTask);
            }
        }
        return tasks;
    }
}
