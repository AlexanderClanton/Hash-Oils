import java.util.*; 
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//Example of data retrieval with Hashing!

public class HashData
{
    public static void main(String args[]) 
    { 
        //clears the screen
        System.out.print('\u000C');
        
        //set integer exit equal to 0
        int exit=0;
        
        // Create a HashTable to store data about users
        // String values corresponding to integer keys 
        Map<String, String> UserInfo= new Hashtable<>(); 
        
        //creates a scanner object for input from user
        Scanner input= new Scanner(System.in);
        
        //Input some user info
        //User named Fox Davenport and their email
        UserInfo.put("Fox Davenport", "UltimateLifeForm@gmail.com");
        UserInfo.put("Daniel Yang", "danielyang@yahoo.com");
        UserInfo.put("Mithil", "HugeMuscleMithil@muscle.com");
        UserInfo.put("Alex", "BadCoder@terrible.com");
        UserInfo.put("Mr. John", "OurLordandSavior@holy.com");
        
        System.out.println("Hi! Welcome to our mini databse! Please input a user you would like to learn about");
        System.out.println("Press 0 when you want to exit");
        
        // HashMap's key set
        Set<String> Username = UserInfo.keySet();
        System.out.println("Users: " + Username);
        
        //New Hashmap for email link to password
        Map<String, String> Password= new Hashtable<>();
        Password.put("UltimateLifeForm@gmail.com", "Password");
        Password.put("danielyang@yahoo.com", "Tyler1");
        
        //loops till user wants to exit
        while (exit==0){
        System.out.println("Which one do you want to get info on?");
        System.out.println("Please input the number of the user. Ex: Fox is 1, Mithil 2, etc...");
        int user= input.nextInt();
        
        if (user==0) {
            exit=1;
    }
        
        if(user==1) {
            System.out.println("Fox's info: ");
            System.out.println(UserInfo.get("Fox Davenport"));
            System.out.println("Their password is: " + Password.get("UltimateLifeForm@gmail.com") + "\n");
    } 
    
    if(user==2) {
        System.out.println("Mithil's info: ");
        System.out.println(UserInfo.get("Mithil") + "\n");
    } 

        if(user==3) {
            System.out.println("Daniel's info: ");
            System.out.println(UserInfo.get("Daniel Yang"));
            System.out.println("Their password is: " + Password.get("danielyang@yahoo.com") + "\n");
    }
    
    if(user==4) {
        System.out.println("Mr John's info: ");
        System.out.println(UserInfo.get("Mr. John") + "\n");
    } 
    
    if(user==5) {
        System.out.println("Alex's info: ");
        System.out.println(UserInfo.get("Alex") + "\n");
    } 
}
}
}

