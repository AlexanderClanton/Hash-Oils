
package hash;
import org.apache.log4j.*;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;


import org.apache.log4j.*;

/**
 * Log4j logger
 */
class Key { 
    String key; 
    Key(String key) 
    { 
        this.key = key; 
    } 
  
    @Override
    public int hashCode() 
    { 
        int hash = (int)key.charAt(0); 
        System.out.println("hashCode for key: "
                           + key + " = " + hash); 
        return hash; 
    } 
  
    @Override
    public boolean equals(Object obj) 
    { 
        return key.equals(((Key)obj).key); 
    } 
} 
  

public class info 
{ 
	 static Logger log4j = Logger.getLogger(info.class);
	
	
	
	
	public static void main(String[] args) 
    { 
		//logger.log(Level.INFO, "Drone");
		//Handler ch = new ConsoleHandler();
		
		//Logger.getLogger("").addHandler(ch);
		log4j.debug("small issue");
		log4j.error("big issue");
		log4j.fatal("something happened");
		
        
		HashMap map = new HashMap(); 
        map.put(new Key("Alex"), 1); 
        map.put(new Key("Fox"), 2); 
        map.put(new Key("Mithil"), 3); 
        
        //System.out.println("Value for key Alex: " +map.get(new Key("Alex"))); 
        
        System.out.println("Value for key Fox: " + map.get(new Key("Fox"))); 
        
        System.out.println("Value for key Mithi;: " + map.get(new Key("Mithil"))); 
    
    
    
    
    
    
    } 
} 