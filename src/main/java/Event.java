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
