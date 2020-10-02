/*
* Represents all possible exceptions when incomplete or incorrect command is typed in
* description gives details of exceptions
* for incomplete commands, the description of DukeException will be the prefix of the command
* e.g. DukeException("todo")
* for incorrect commands, the description will be "invalid description"
* */
public class DukeException extends Exception {
    protected String type;

    public DukeException() {
        this("invalid description");
    }

    public DukeException(String type) {
        this.type = type;
    }
}
