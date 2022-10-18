package logging;

public class MailLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("Mail Logger olarak loglandı: " + message);

    }
}