public class Todo extends Task {
    protected String symbol = "[T]";

    public Todo(String content) {
        super(content);
    }

    @Override
    public String getSymbol() {
        return symbol;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
