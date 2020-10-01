public class DukeException extends Exception {
    protected String type;

    public DukeException() {
        this("invalid description");
    }

    public DukeException(String type) {
        this.type = type;
    }
}
