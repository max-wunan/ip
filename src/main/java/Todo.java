/*
* Represents a type of task with description only
* without any date/time
* status is undone by default unless user marks it as done
* */
public class Todo extends Task {
    protected String symbol = "[T]";

    public Todo(String content) {
        super(content);
    }

    /*
    * Function to make it easier to print information
    *
    * @return String symbol "[T]"
    * */
    @Override
    public String getSymbol() {
        return symbol;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
