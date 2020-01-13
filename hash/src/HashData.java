
import java.util.*; 
import java.util.logging.ConsoleHandler;


import java.util.logging.Level;

import java.util.logging.Logger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//Example of data retrieval with Hashing!
import java.util.logging.Level;

public class HashData
{
    public static void main(String args[]) 
    { 
    	//basic logger telling level
    	Logger logger = Logger.getLogger(LoggingExample.class.getName());
    	logger.log(Level.INFO, "Drone");
    	
    	//clears the screen
        System.out.print('\u000C');
        //logger.log(Level.SEVERE, "IRAN");
        //set integer exit equal to 0
        int exit=0;
        
        int add=0;
        //
        // Create a HashTable to store data about users
        // String values corresponding to string of arraylist
        LinkedHashMap<String, List<String>> UserInfo= new LinkedHashMap<>(); 
        
        //creates a list to store values for Fox Davenport
        List<String> FoxDavenport= new ArrayList<String>();
        FoxDavenport.add("UltimateLifeForm@gmail.com");
        FoxDavenport.add("Pineapple Pizza");
        
        //create a list to store values for Daniel Yang
        List<String> DanielYang= new ArrayList<String>();
        DanielYang.add("danielyang@yahoo.com");
        DanielYang.add("Tyler1");
        
        //create a list to store values for Mithil Pujar
        List<String> MithilPujar= new ArrayList<String>();
        MithilPujar.add("HugeMuscleMithil@muscle.com");
        MithilPujar.add("MUSCLE!");
        
        //create a list to store values for Mr. John
        List<String> MrJohn= new ArrayList<String>();
        MrJohn.add("OurLordAndSavior@holy.com");
        MrJohn.add("CodePower");
        
        //create a list to store values for Alex Clanton
        List<String> AlexClanton= new ArrayList<String>();
        AlexClanton.add("BadCoder@terrible.com");
        AlexClanton.add("CacaPooPoo");
        
        //create a list to store values for a New User
        List<String> NewUser= new ArrayList<String>();
        String name = null;
        String email = null;
        String password = null;
        NewUser.add(email);
        NewUser.add(password);
        
        //create a list to store values for order 
        List<String> CT = new ArrayList<String>();
        CT.add("Email: ");
        CT.add("Password: ");
        
        //creates a scanner object for input from user
        Scanner input= new Scanner(System.in);
        
        //Input some user info into the map
        UserInfo.put("Fox Davenport", FoxDavenport);
        UserInfo.put("Mithil Pujar", MithilPujar);
        UserInfo.put("Daniel Yang", DanielYang);
        UserInfo.put("Mr. John", MrJohn);
        UserInfo.put("Alex Clanton", AlexClanton);
        UserInfo.put(name, NewUser);
        
        System.out.println("Hi! Welcome to our mini databse! Please input a user you would like to learn about");
        System.out.println("If you would like to add a user, please press +");
        System.out.println("Press 0 when you want to exit");
        
        // HashMap's key set
        Set<String> Username = UserInfo.keySet();
        System.out.println("Users: " + Username);
        
        	//loops till user wants to exit
       while (exit==0){
    	   
    	   //adding part doesn't work yet. need to fix
      
    	   /* while (add==0) {
    		System.out.println("Press + to add a user or - to not");
    		char user = input.next().charAt(0);
    			if(user=='+') {
    				
    		    	   System.out.println("What is the user's name?");
    		    	   name= input.nextLine();
    		    	   
    		    	   System.out.println("What is the user's email?");
    		    	   email= input.nextLine();
    		    	   
    		    	   System.out.println("What is the user's password?");
    		    	   password= input.nextLine();
    		    	   
    		    	   List<String> Newuser= UserInfo.get(name);
    		           NewUser.add(email);
    		           NewUser.add(password);
    		    	   
    		           UserInfo.put(name, NewUser);
    		           
    		           System.out.println("Thank you! The user has been added");
    		           
    		           List<String> NewUserInfo=UserInfo.get(name);
    		           System.out.println(name + "'s info: ");
    		           System.out.println(CT.get(0)+NewUserInfo.get(0));
    		           System.out.println(CT.get(1)+NewUserInfo.get(1)+ "\n");
    		           
    		       }
    			
    			*/
    	   
        System.out.println("Which one do you want to get info on?");
        System.out.println("Please input the number of the user. Ex: Fox is 1, Mithil 2, etc...");
        char user = input.next().charAt(0);
        
       if (user=='0') {
            exit=1;
        }
        
        if(user=='1') {
            List<String> FoxInfo= UserInfo.get("Fox Davenport");
            System.out.println("Fox's info: ");
            System.out.println(CT.get(0)+ FoxInfo.get(0)); 
            System.out.println(CT.get(1)+ FoxInfo.get(1) + "\n");
       } 
    
       if(user=='2') {
    	List<String> MithilInfo= UserInfo.get("Mithil Pujar");
        System.out.println("Mithil's info: ");
        System.out.println(CT.get(0) + MithilInfo.get(0));
        System.out.println(CT.get(1)+ MithilInfo.get(1) + "\n");
       } 

       if(user=='3') {
    	    List<String> DanielInfo= UserInfo.get("Daniel Yang");
            System.out.println("Daniel's info: ");
            System.out.println(CT.get(0) + DanielInfo.get(0));
            System.out.println(CT.get(1)+ DanielInfo.get(1)+ "\n");
            
       }
    
       if(user=='4') {
    	   List<String> JohnInfo= UserInfo.get("Mr. John");
        System.out.println("Mr John's info: ");
        System.out.println(CT.get(0)+JohnInfo.get(0));
        System.out.println(CT.get(1)+JohnInfo.get(1)+ "\n");
       } 
    
       if(user=='5') {
    	   List<String> AlexInfo=UserInfo.get("Alex Clanton");
        System.out.println("Alex's info: ");
        System.out.println(CT.get(0)+AlexInfo.get(0));
        System.out.println(CT.get(1)+AlexInfo.get(1)+ "\n");
    } 
       
       if(user=='6') {
    	   List<String> NewUserInfo=UserInfo.get(name);
    	   System.out.println(name);
           System.out.println(CT.get(0)+NewUserInfo.get(0));
           System.out.println(CT.get(1)+NewUserInfo.get(1)+ "\n");
       }
       
}
}
}



