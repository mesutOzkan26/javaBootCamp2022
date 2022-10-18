package logging;

public class FileLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.println("File Logger olarak loglandı: "+ message);
    }
}