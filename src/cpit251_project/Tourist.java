
package cpit251_project;
import java.util.ArrayList;

public class Tourist extends User {

    int TID;
    String Plan;
    Supervisor supervis;

    
    
    
    public Tourist( String name, String Email, String Adress, String Gender, String Pass, String userType) {
        super(name, Email, Adress, Gender, Pass, userType);

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

    public String searchPlace(ArrayList<Place> Places,String pName) {
        boolean flag=false;
          for(int i=0; i<Places.size(); i++){
              String name=Places.get(i).placeName; 
              String category=Places.get(i).getpCategory(); 
              String classification=Places.get(i).getclassification();
              String pHours=Places.get(i).getpHours();
              String city=Places.get(i).getcity();
              String rate=Places.get(i).pRate;
              String description=Places.get(i).pDesc; 
              
            if(name.equalsIgnoreCase(pName)){
            return "Name of Place: "+name+"\nDescription: "+description+"\nCity: "
                    +city+"\nCategory: "+category+"\nClassification: "+classification+
                    "\nOpening Hour: "+pHours+"\nRate: "+rate; 
            
            }
          }
        return "No result found";
    }
       
        
        
        
    public void Filter(ArrayList<Place> Places, String pCategory, String classification,String city, String location,String pHours) {
         int searchResult=0; //count number of result  
         
        for(int i=0; i<Places.size(); i++){
            
        String category2=Places.get(i).getpCategory();
        String classification2=Places.get(i).getclassification();
        String pHours2=Places.get(i).getpHours();
        String city2=Places.get(i).getcity();
        String location2=Places.get(i).getlocation(); 
         
          
          //check tourist specification
        if(pCategory.equalsIgnoreCase(category2)&& classification.equalsIgnoreCase(classification2)
         && pHours.equalsIgnoreCase(pHours2) && city.equalsIgnoreCase(city2) && location.equalsIgnoreCase(location2)){
            
            searchResult=searchResult+1; 
            System.out.println("searchResult "+searchResult);
             System.out.println("place Name: "+Places.get(i).placeName+"    Rate: "+Places.get(i).getpRate()); }
        
         }// end of loop    
        
        // place not found
        if(searchResult==0){
         System.out.println("\n\nNo result found");  }
        
        
    }
    
    
    public void evaluPlace(ArrayList<Place> Places,String comment, String rate, String pName) {
        
        if(supervis.IsPlaceExits(Places,pName) == false) {
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
