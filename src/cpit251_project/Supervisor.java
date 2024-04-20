
package cpit251_project;

import java.util.ArrayList;


public class Supervisor extends User{
    
    Place place;
    int sID;
    static ArrayList<Supervisor> supervisors;
    ArrayList<Place> Places = new ArrayList<>();

    public Supervisor(Place place, int sID) {
        this.place = place;
        this.sID = sID;
    }
    
    public Supervisor(int sID) {
        this.sID = sID;
    }

    public Supervisor() {
        supervisors = new ArrayList<>();
    }

    
    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public int getsID() {
        return sID;
    }

    public void setsID(int sID) {
        this.sID = sID;
    }

    public boolean deletePlace(int pID) {
        return false;
    }

    public boolean addPlace(int pID, String pName, String pCategory, String pDesc, String pHours) {
        return false;
    }

    public boolean deleteTourGuide(int GID) {
        return false;
    }

    public boolean updatePlaceInfo(Place place) {
        return false;
    }

    public boolean deleteEvaluation(Place place) {
        return false;
    }
    
    
    public void AddSupervisor(Supervisor newSuperID){
     
      boolean found = false;
      for(Supervisor s : supervisors){
          if(s.getsID()== newSuperID.getsID()){ // check if supervisorID are exit or no
          found = true;
       }          
      }
      
      if (found == false){ // supervisorID is new supervisor
        supervisors.add(newSuperID);
        System.out.println("Supervisor added successfully");
        }
      
        else{
        System.out.println("Supervisor with the same ID already exists"); // found == true supervisorID is exit
        
     }
    }
    
        
      
    
    /*public void printSupervisorID() {
        for (Supervisor s : supervisors) {
            System.out.println("ID: " + s.getsID());
        }
    }
    */
    
    
    
    public static boolean isSupervisorIdPresent(int sID) {
        for (Supervisor s : supervisors) {
            if (s.getsID() == sID) {
                return true; // Return true if the ID is found
            }
        }
        
        return false; // Return false if the ID is not found
    }
    
    
    
    
    public static boolean IsPlaceExit(ArrayList<Place> Places, String PlaceName){
          boolean isExit = false; 
          for (Place p : Places){ 
            if(p.getplaceName().equalsIgnoreCase(PlaceName)){ // check if place found 
                return isExit; 
           
            }
        }
           isExit = true;
           return isExit;
    }
        
    
    
    
        public void AddPlace(Place place , int sID){
        if(isSupervisorIdPresent(sID))  { // check if the user is supervisor or not
            if(IsPlaceExit(Places,place.placeName)){  // check if the place is found or not
                Places.add(place);
                System.out.println("\n Place Added Sucessfuly");
            
            }
            else{
                System.out.println("\n Place already exist");
            }
        } 
        else{
            System.out.println("\n You don't have permission to add ");
        }
      }
        
        
        
       /* public void printPlaceInfo() {
        for (Place p : Places) {
            System.out.println("ID: " + "name : "+p.placeName + "ID:"+ p.pID + "Cateogry :"+p.pCategory + "Classification:"+p.classification
            +"rate:"+p.getpRate()+"evalution:" +p.pEva + "describe:"+p.pDesc + "hourse:"+p.pHours);
        }
      }
     */
    }
