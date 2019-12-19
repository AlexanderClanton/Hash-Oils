import java.util.HashMap; 
  
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
    public static void main(String[] args) 
    { 
       
        HashMap map = new HashMap(); 
        map.put(new Key("Alex"), 1); 
        map.put(new Key("Fox"), 2); 
        map.put(new Key("Mithil"), 3); 
  
        System.out.println("Value for key Alex: " +map.get(new Key("Alex"))); 
        
        System.out.println("Value for key Fox: " + map.get(new Key("Fox"))); 
        
        System.out.println("Value for key Mithi;: " + map.get(new Key("Mithil"))); 
    
    
    
    
    
    
    } 
} 