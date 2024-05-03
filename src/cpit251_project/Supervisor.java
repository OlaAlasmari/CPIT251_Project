package cpit251_project;

import java.util.ArrayList;

public class Supervisor extends User {
    
    
    public Place place;
    int sID;
    static ArrayList<Supervisor> supervisors;
    public static  ArrayList<Place> Places = new ArrayList<>();

    
    public Supervisor(Place place, int sID) {
        this.place = place;
        this.sID = sID;
    }

    public Supervisor(int sID) {
        this.sID = sID;
    }

    public Supervisor(int sID, String name) {
        super(name);
        this.sID = sID;
    }

    public Supervisor() {
        supervisors= new ArrayList<>();
        
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

    public void AddSupervisor(Supervisor newSuperID) {

        boolean found = false;
        for (Supervisor s : supervisors) {
            if (s.getsID() == newSuperID.getsID()) { // check if supervisorID are exit or no
                found = true;
            }
        }

        if (found == false) { // supervisorID is new supervisor
            supervisors.add(newSuperID);
            System.out.println("\nSupervisor added successfully\n");
        } else {
            System.out.println("\nSupervisor with the same ID already exists\n"); // found == true supervisorID is exit

        }
    }

    public void printSupervisorInfo() {
        for (Supervisor s : supervisors) {
            System.out.println("\nID: " + s.getsID() + "\t\t Name: " + s.getName());
        }
    }

    public static boolean isSupervisorIdPresent(int sID) {
        for (Supervisor s : supervisors) {
            if (s.getsID() == sID) {
                return true; // Return true if the ID is found
            }
        }

        return false; // Return false if the ID is not found
    }

    
    
    private static boolean IsPlaceExit(ArrayList<Place> Places,String PlaceName) {
        boolean isExit = false;
        for (Place p : Places) {
            if (p.getplaceName().equalsIgnoreCase(PlaceName)) { // check if place found 
                return isExit;
            }
        }
        isExit = true;
        return isExit;
    }
    
    
    public static boolean IsPlaceExits(ArrayList<Place> Places,String PlaceName) {
     return IsPlaceExit(Places, PlaceName);
    }
    
    
    
    
    public void AddPlace(Place place , int sID) {
        if (isSupervisorIdPresent(sID)) { // check if the user is supervisor or not
            if (IsPlaceExit(Places, place.placeName)) {  // check if the place is found or not
                Places.add(place);
                System.out.println("\n Place Added Sucessfuly");

            } else {
                System.out.println("\n Place already exist");
            }
        } else {
            System.out.println("\n You don't have permission to add ");
        }
    }

    
    
    public void printPlaceInfo() {
        for (Place p : Places){
            System.out.println("name: " + p.getplaceName()+ "\nID: " + p.pID + "\nCateogry: " + p.getpCategory() + "\nClassification: " + p.getclassification()
                    + "\nrate: " + p.getpRate() + "\nevalution: " + p.getpEva() + "\ndescribe: " + p.getpDesc()+ "\nhourse: " + p.getpHours()+ "\ncity: "+p.getcity()
                    + "\nlocation: "+p.getlocation()+"\n------------------\n");
        }
    }
    
   
    public ArrayList <Place> Places(){
        return Places;
    }
}
