public class Task {
    protected String description;
    protected boolean isDone;
    //protected String symbol = "[N]";

    public Task() {
        new Task("No description given");
    }

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "[\u2713]" : "[\u2718]"); //return [tick] or [X] symbols
    }

    public String getSymbol() {
        return null;
    }

    public String getDescription() {
        return description;
    }

}
/*
* Represents all types of tasks
* parent class of Todo/Deadline/Event
* includes description only
* status is undone by default unless marked done by user
* */
public class Task {
    protected String description;
    protected boolean isDone;
    //protected String symbol = "[N]";

    public Task() {
        new Task("No description given");
    }

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    /*
     * Function to make it easier to print information
     *
     * @return String status icon "[tick]" or "[X]"
     * */
    public String getStatusIcon() {
        return (isDone ? "[\u2713]" : "[\u2718]"); //return [tick] or [X] symbols
    }

    public String getSymbol() {
        return null;
    }

    public String getDescription() {
        return description;
    }

}
