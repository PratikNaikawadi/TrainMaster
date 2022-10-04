package com.TrainMaster.main;
import java.util.UUID;
import com.TrainMaster.DB.DBconnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	static Scanner s = new Scanner(System.in);
	 String from, To,str;
	 
	 InputStreamReader is = new InputStreamReader(System.in);
	 BufferedReader br = new BufferedReader(is);
	 
	//Methods to be called in main method
	 UUID UID = UUID.randomUUID();
	 private static void initialMessage() {
		    System.out.println("Enter what would you like to do?");
			System.out.println("1. View Destinations"); // 	
			System.out.println("2. Book a Ticket"); //case 2
			System.out.println("3. Exit"); 		
	 }
	
	 private static void bookTicket(int choice) {
		 UUID UID = UUID.randomUUID();
		switch (choice) {
		case 1: 
			 System.out.println("Select the destination you are looking to travel?");
	         System.out.print("\n"+"From -" );
	         String from = s.next();
	         System.out.print("To -");
	         String To = s.next();
	         System.out.println("\n"+"You've selected = " + from + "\n" + "You've selected = " + To );
		     System.out.println("\n"+"Would you like to proceed?");
		     System.out.println("1.Yes");
		     System.out.println("2.No");
		     choice = s.nextInt();
		     if(choice !=1 || choice !=2) {
					for(int i =1; i<=choice; i++) {
			    		System.out.println("Invalid Choice -please check again");
						System.out.println("1.Yes");
					    System.out.println("2.No");
					    choice = s.nextInt(); 
					    switch (choice) {
		                 case 1: if(choice ==1)
				            System.out.println("Congratulations! - Ticket booked succcessfully" + "\n" + "FROM = " + from + 
							"\n" + "TO = " + To );
					        System.out.println("Your transaction ID: "+UID);
			                    break;
			      
		                 case 2: if(choice ==2)
			                    System.out.println("No worries - Thank you!");
			                    break;
		                     } 	
			    	}
			    } 
		break;	
		default: 
			 System.out.println("No worries - Thank you!");
			}
		} 	 
	 
	
//----------------------------------------------------------------------------------------------------------------------------------------//

	
	public static void main(String[] args) {
		
		System.out.println("\n"+ "                                   " +
				"*******************   WELCOME TO TRAINMASTER   *******************" + 
						"\n"+"\n");
		initialMessage();
		int choice = s.nextInt();
		switch (choice) {
		case 1:  // main case 1 - show destination
			
		DBconnection db = new DBconnection();
		try {
			System.out.println("\n"+"AVAILABLE DESTINATIONS:"  );
			DBconnection.main(args);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\n"+"Would you like to book a ticket?");
		System.out.println("1.Yes");
	    System.out.println("2.No");
	    choice = s.nextInt();
	    bookTicket(choice);
			
			
		break;
//----------------------------------------------------------------------------------------------------------------------------------------//
		
		case 2:  // main case 2 - book ticket
			UUID UID = UUID.randomUUID();
			DBconnection db1 = new DBconnection();
			try {
				System.out.println("\n"+"AVAILABLE DESTINATIONS:"  );
				DBconnection.main(args);
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			     System.out.println("\n"+"Thank you for choosing TRAINMASTER for booking.");
		         System.out.println("Select the destination you are looking to travel?");
		      	 System.out.print("\n"+"From -");
		         String from = s.next();
		         System.out.print("To -");
		         String To = s.next();
			     System.out.println("\n"+"You've selected = " + from + "\n" + "You've selected = " + To );
			     System.out.println("\n"+"Would you like to proceed?");
			     System.out.println("1.Yes");
			     System.out.println("2.No");
			     choice = s.nextInt();
			     
			     if(choice !=1 || choice !=2) {
			    	 
				    	for(int i =1; i<=choice; i++) {
				    		System.out.println("Invalid Choice -please check again");
				    		System.out.println("1.Yes");
						    System.out.println("2.No");
						    choice = s.nextInt();   
				    	}
				    	 switch (choice) {
					       case 1:if(choice ==1)
						   System.out.println("Congratulations! - Ticket booked succcessfully" + "\n" + "FROM = " + from + 
								"\n" + "TO = " + To );
						   System.out.println("Your transaction ID: "+UID);
						   break;
					       case 2:if(choice ==2)
					    	   System.out.println("No worries - Thank you");
					       break;
					     }	
				    }
			      	
	    break;

//----------------------------------------------------------------------------------------------------------------------------------------//
	    
		default: // Main default case 
			if(choice == 3)
			break;
			
		}
	}
}


