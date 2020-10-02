import java.util.ArrayList;

public class TaskList {

    protected ArrayList<Task> tasks;

    public TaskList(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public void printList() {
        System.out.println("____________________________________________________________\n");
        System.out.println("Here are the tasks in your list:\n");
        for (int i = 1; i <= this.tasks.size(); i++) {
            System.out.println(i + "." + this.tasks.get(i-1).getSymbol() + this.tasks.get(i-1).getStatusIcon() + this.tasks.get(i-1).getDescription() + "\n");
        }
        System.out.println("____________________________________________________________\n");
    }

    public void deleteTask(int taskIndex) {
        String description = this.tasks.get(taskIndex-1).getSymbol() + this.tasks.get(taskIndex-1).getStatusIcon() + this.tasks.get(taskIndex-1).getDescription();
        this.tasks.remove(taskIndex-1);
        System.out.println("____________________________________________________________\n");
        System.out.println("Noted. I've removed this task: ");
        System.out.println(description);
        System.out.println("Now you have " + tasks.size() + " tasks in the list.");
        System.out.println("____________________________________________________________\n");
    }

    public void findTask(String keyWord) {
        ArrayList<Task> tasksWithKey = new ArrayList<>();
        for (Task task : tasks) {
            if (task.description.contains(keyWord)) {
                tasksWithKey.add(task);
            }
        }
        System.out.println("____________________________________________________________\n");
        System.out.println("Here are the matching tasks in your list:");
        for (int i  = 1; i <= tasksWithKey.size(); i++) {
            System.out.println(i + "." + tasksWithKey.get(i-1).getSymbol() + tasksWithKey.get(i-1).getStatusIcon() + tasksWithKey.get(i-1).getDescription());
        }
        System.out.println("____________________________________________________________\n");
    }

    public void markAsDone(int taskNo) {
        tasks.get(taskNo-1).isDone = true;
        System.out.println("____________________________________________________________\n");
        System.out.println("Nice! I've marked this task as done:\n");
        System.out.println(tasks.get(taskNo-1).getSymbol() + tasks.get(taskNo-1).getStatusIcon() + tasks.get(taskNo-1).description + "\n");
        System.out.println("____________________________________________________________\n");
    }
}
