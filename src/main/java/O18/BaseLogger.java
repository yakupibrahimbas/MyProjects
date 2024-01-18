package O18;

public class BaseLogger {
    public void Log(String message){
BaseLogger[] Loggers=new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabaseLogger()};


    }
}
