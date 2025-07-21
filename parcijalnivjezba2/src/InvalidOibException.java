public class InvalidOibException extends Exception {
    public InvalidOibException() {
      super("OIB već postoji!");
    }
}
