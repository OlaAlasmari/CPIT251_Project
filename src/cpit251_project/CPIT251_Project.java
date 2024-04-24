
package cpit251_project;


import java.util.Scanner;


public class CPIT251_Project {

    
    public static void main(String[] args) {
        System.out.println("Ola Alasmari");
        System.out.println("Hanin Aldosary");
        System.out.println("Shouq Alsubaie");
        System.out.println("Ghala Alshareef");
        System.out.println("Elaf Basmair:))))");
        
        
        
        Scanner s=new Scanner(System.in);
        
        Supervisor supervisors = new Supervisor();
        supervisors.AddSupervisor(new Supervisor(1));
        supervisors.AddSupervisor(new Supervisor(1));
        supervisors.AddSupervisor(new Supervisor(2));

        Tourist tourist= new Tourist();
        
        
        Place p = new Place("London", 2 ,"Vist" , "C" , "****" ,"A","B","9");
        Place p2 = new Place("London", 2 ,"Vist" , "C" , "****" ,"A","B","9");
Place pg = new Place("Ghala", 2 ,"Vist" , "C" , "****" ,"A","B","9");
        

       supervisors.AddPlace(p,1);
       supervisors.AddPlace(pg,1);
       
       
       
        System.out.println("Are you: a supervisor, a tour guide, a tourist?");
        String Type=s.nextLine();
        
        if("Tourist".equalsIgnoreCase(Type)){
            System.out.println("Choose from the following list the desired service number:\n" +
                               "1- Find a place.\n" +
                               "2- Filtering places.\n" +
                               "3- Evaluate a place.\n" +
                               "4- Find a tour guide.");
            int numSer=s.nextInt();
            
            if(numSer==3) {
                
                
                System.out.println("Enter the name of the place you visited:");
                String placeName=s.next();
                
                System.out.println("Rate the place (from 1 to 5 stars): ");
                String starsRate=s.next();
                
                System.out.println("Add a comment (optional): ");
                String comment=s.next();
                
                tourist.evaluPlace(comment, starsRate, placeName);
            }
           
       
            
        }
       
       
      
       
       
       
    }
    
}
