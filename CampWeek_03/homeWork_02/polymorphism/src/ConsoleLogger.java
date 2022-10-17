public class ConsoleLogger extends BaseLogger {
    public void Log(String message) {
        System.out.println("ConsoleLogger message : " + message );
    }
}