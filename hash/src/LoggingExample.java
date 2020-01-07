import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggingExample {

    static Logger logger = Logger.getLogger(LoggingExample.class.getName());
    
    public static void main(String[] args) 
    {
        //alex c
        
        logger.setLevel(Level.FINE);
        logger.addHandler(new ConsoleHandler());
        for(int i=0; i<10; i++){
            //logging messages
            logger.log(Level.INFO, "Msg"+i);
        }
        
       
    }

}
