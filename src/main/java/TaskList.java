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
        }import java.util.ArrayList;

/*
* Represents a collection of all tasks
* all tasks are stored in ArrayList
* include methods to add/delete/find tasks and to print all tasks
* */
public class TaskList {

    protected ArrayList<Task> tasks;

    public TaskList(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    /*
    * Function to print all tasks and relevant information
    * returns nothing, no parameter
    * if the ArrayList is empty, there will be nothing shown below "Here are the tasks in your list:"
    * */
    public void printList() {
        System.out.println("____________________________________________________________\n");
        System.out.println("Here are the tasks in your list:");
        for (int i = 1; i <= this.tasks.size(); i++) {
            System.out.println(i + "." + this.tasks.get(i-1).getSymbol() + this.tasks.get(i-1).getStatusIcon() + this.tasks.get(i-1).getDescription() + "\n");
        }
        System.out.println("____________________________________________________________\n");
    }

    /*
    * Function to delete a certain task based on its index
    * returns nothing
    *
    * @param taskIndex the index of the task that the user wants to delete
    * @throws DukeException when user tries to delete tasks that does not exist
    * */
    public void deleteTask(int taskIndex) throws DukeException {
        if (taskIndex > this.tasks.size()) {
            throw new DukeException("delete non-existing task");
        }
        String description = this.tasks.get(taskIndex-1).getSymbol() + this.tasks.get(taskIndex-1).getStatusIcon() + this.tasks.get(taskIndex-1).getDescription();
        this.tasks.remove(taskIndex-1);
        System.out.println("____________________________________________________________\n");
        System.out.println("Noted. I've removed this task: ");
        System.out.println(description);
        System.out.println("Now you have " + tasks.size() + " tasks in the list.");
        System.out.println("____________________________________________________________\n");
    }

    /*
    * Function to find tasks whose description contains the keyword given by users
    * returns nothing
    * if no task is found, nothing will be printed below "Here are the matching tasks in your list:"
    *
    * @param keyWord the keyword given by the user
    * */
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

    /*
    * Function to change the status of a task from undone to done
    * returns nothing
    *
    * @param taskNo the index of task which user wants to mark as done
    * @throws DukeException when user tries to mark done a non-existent task
    * or tries to mark done a task that is already done
    * */
    public void markAsDone(int taskNo) throws DukeException {
        if (taskNo > tasks.size()) {
            throw new DukeException("mark non-existent task as done");
        } else if (tasks.get(taskNo - 1).isDone) {
            throw new DukeException("already done");
        }
        tasks.get(taskNo-1).isDone = true;
        System.out.println("____________________________________________________________\n");
        System.out.println("Nice! I've marked this task as done:\n");
        System.out.println(tasks.get(taskNo-1).getSymbol() + tasks.get(taskNo-1).getStatusIcon() + tasks.get(taskNo-1).description + "\n");
        System.out.println("____________________________________________________________\n");
    }
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
