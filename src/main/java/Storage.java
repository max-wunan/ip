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
                } else {
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
