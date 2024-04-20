
package cpit251_project;

import static cpit251_project.Supervisor.IsPlaceExit;
import static cpit251_project.Supervisor.Places;
//import java.util.ArrayList;

public class Tourist extends User {

    int TID;
    String Plan;
    //ArrayList<Place> Places = new ArrayList<>();

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

    public boolean searchPlace(String pName) {
        return false;
    }

    public String Filter(String classification, double pRate, String pHours) {
        return null;
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
