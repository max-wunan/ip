/*
* Represents a type of task with description and a deadline (date or time)
* status is undone unless marked done by the user
* */
public class Deadline extends Task {
    protected String symbol = "[D]";
    protected String deadline;

    public Deadline(String content, String deadline) {
        super(content);
        this.deadline = deadline;
    }

    /*
     * Function to make it easier to print information
     *
     * @return String symbol "[D]"
     * */
    @Override
    public String getSymbol() {
        return symbol;
    }

    /*
     * Function to make it easier to print information
     *
     * @return String description e.g. "assignmen (by: today)"
     * */
    @Override
    public String getDescription() {
        return this.description + "(by: " + this.deadline + ")";
    }
}
