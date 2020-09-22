public class Deadline extends Task {
    protected String symbol = "[D]";
    protected String deadline;

    public Deadline(String content, String deadline) {
        super(content);
        this.deadline = deadline;
    }

    @Override
    public String getSymbol() {
        return symbol;
    }

    @Override
    public String getDescription() {
        return this.description + "(by: " + this.deadline + ")";
    }
}
