
package cpit251_project;

import static cpit251_project.Supervisor.IsPlaceExit;
import static cpit251_project.Supervisor.Places;
import java.util.ArrayList;

public class Tourist extends User {

    int TID;
    String Plan;
    //ArrayList<Place> places = new ArrayList<>();

    public Tourist(int TID, String plan) {
        this.TID = TID;
        this.Plan = plan;
    }

    public Tourist() {
    }



    public int getTID() {
        return TID;
    }

    public void setTID(int TID) {
        this.TID = TID;
    }

    public String getPlan() {
        return Plan;
    }

    public void setPlan(String plan) {
        this.Plan = Plan;
    }

    public String updatePlan(String Plan) {
        return null;
    }

    public boolean DeletePlan(String Plan) {
        return false;
    }

    public String searchPlace(ArrayList<Place> place,String pName) {
        boolean flag=false;
          for(int i=0; i<place.size(); i++){
              String name=place.get(i).placeName; 
              String category=place.get(i).getpCategory(); 
              String classification=place.get(i).getclassification();
              String pHours=place.get(i).getpHours();
              String city=place.get(i).getcity();
              String rate=place.get(i).pRate;
              String description=place.get(i).pDesc; 
              
            if(name.equalsIgnoreCase(pName)){
            return "Name of Place: "+name+"\nDescription: "+description+"\nCity: "
                    +city+"\nCategory: "+category+"\nClassification: "+classification+
                    "\nOpening Hour: "+pHours+"\nRate: "+rate; 
            
            }

          
          }
        return "No result found";
    }

    public void Filter(ArrayList<Place> place, String pCategory, String classification,String city, String location,String pHours) {
         int searchResult=0; //count number of result  
         
        for(int i=0; i<place.size(); i++){
            
        String category2=place.get(i).getpCategory();
        String classification2=place.get(i).getclassification();
        String pHours2=place.get(i).getpHours();
        String city2=place.get(i).getcity();
        String location2=place.get(i).getlocation(); 
         
          
          //check tourist specification
        if(pCategory.equalsIgnoreCase(category2)&& classification.equalsIgnoreCase(classification2)
         && pHours.equalsIgnoreCase(pHours2) && city.equalsIgnoreCase(city2) && location.equalsIgnoreCase(location2)){
            
            searchResult=searchResult+1; 
            System.out.println("searchResult "+searchResult);
             System.out.println("place Name: "+place.get(i).placeName+"    Rate: "+place.get(i).getpRate()); }
        
         }// end of loop    
        
        // place not found
        if(searchResult==0){
         System.out.println("No result found");  }
        
        
    }

    public void evaluPlace(String comment, String rate, String pName) {
        
        if(!(IsPlaceExit(Places, pName))) {
            
            if(rate.equals("*") || rate.equals("**") || rate.equals("***") || rate.equals("****") || rate.equals("*****")){
                
                System.out.println("Your rating has been successfully submitted! Thank you for sharing your opinion. ");
                addEvaToPlaceDB(comment, rate, pName); 
            }
            else {
                System.out.println("You rated incorrectly, please rate from one to five stars and no more.");
            }
           
        } 
        
        
        else {
            System.out.println("Error, the place does not exist."); 
        }
        
        
    }
    
    
    public void addEvaToPlaceDB(String comment, String rate, String pName) {
        
    }

    public void evaluTourGuide(double rate, int GID) {
    }

    public String makePlan(String Plan) {
        return null;
    }

    public boolean sharePlan(String Plan) {
        return false;
    }
    

}
