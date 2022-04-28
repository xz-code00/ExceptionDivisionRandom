public class DivisionByZero extends Exception {
    private String msg;

    public DivisionByZero() {
        msg = "Can't divide by zero.";
     }

    public String toString() {
        return msg;
    }
}
