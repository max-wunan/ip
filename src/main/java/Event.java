public class Event extends Task {
    protected String symbol = "[E]";
    protected String startTime;

    public Event(String content, String startTime) {
        super(content);
        this.startTime = startTime;
    }

    @Override
    public String getSymbol() {
        return symbol;
    }

    @Override
    public String getDescription() {
        return this.description + "(at: " + this.startTime + ")";
    }
}
/*
* Represents a type of task with description and a startTime (date or time)
* status is undone by default unless marked done by the user
* */
public class Event extends Task {
    protected String symbol = "[E]";
    protected String startTime;

    public Event(String content, String startTime) {
        super(content);
        this.startTime = startTime;
    }

    /*
     * Function to make it easier to print information
     *
     * @return String symbol "[E]"
     * */
    @Override
    public String getSymbol() {
        return symbol;
    }

    /*
     * Function to make it easier to print information
     *
     * @return String description e.g. "meeting (at: tomorrow 8pm)"
     * */
    @Override
    public String getDescription() {
        return this.description + "(at: " + this.startTime + ")";
    }
}
