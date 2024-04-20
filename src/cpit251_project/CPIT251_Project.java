
package cpit251_project;

import java.util.ArrayList;


public class CPIT251_Project {

    
    public static void main(String[] args) {
        System.out.println("Ola Alasmari");
        System.out.println("Hanin Aldosary");
        System.out.println("Shouq Alsubaie");
        System.out.println("Ghala Alshareef");
        System.out.println("Elaf Basmair");
        
        Supervisor supervisors = new Supervisor();
        supervisors.AddSupervisor(new Supervisor(1));
        supervisors.AddSupervisor(new Supervisor(1));
        supervisors.AddSupervisor(new Supervisor(2));


        
        
        Place p = new Place("London", 2 ,"Vist" , "C" , 4 ,"A","B","9");
        Place p2 = new Place("London", 2 ,"Vist" , "C" , 4 ,"A","B","9");

        

       supervisors.AddPlace(p,1);
       supervisors.AddPlace(p2,1);
       supervisors.AddPlace(p2,3);
       
      
       
       
       
    }
    
}
