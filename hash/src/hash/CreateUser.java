package hash;

import java.util.*; 

public class CreateUser
{
    public static List<String> run(){
        Scanner input= new Scanner(System.in);
        
        //create a list to store values for a New User
        List<String> NewUser= new ArrayList<String>();
        String name= null;
        String email = null;
        String password = null;
        
        System.out.println("What is the user's name?");
        name= input.nextLine();
    		    	   
    	System.out.println("What is the user's email?");
    	email= input.nextLine();
    		    	   
    	System.out.println("What is the user's password?");
    	password= input.nextLine();
    	
    	NewUser.add(name);
        NewUser.add(email);
        NewUser.add(password);
        
    	System.out.println("Thank you! The user has been added");
    	
    	return NewUser;
}
}
