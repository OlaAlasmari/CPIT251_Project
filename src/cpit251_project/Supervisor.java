
package cpit251_project;

import java.util.ArrayList;


public class Supervisor extends User{

    Place place;
    int sID;
    ArrayList<Supervisor> supervisors = new ArrayList<>();
    ArrayList<Place> Places = new ArrayList<>();

    public Supervisor(Place place, int sID) {
        this.place = place;
        this.sID = sID;
    }
    
    public Supervisor(int sID) {
        this.sID = sID;
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
    
    public void AddSupervisor(){
        supervisors.add(new Supervisor(sID));
        System.out.println("\nSupervisor Added Sucessfuly");
    }
    
    public static boolean isSupervisorIdPresent(ArrayList<Supervisor> supervisors, int sID) {
        for (Supervisor supervisor : supervisors) {
            if (supervisor.getsID() == sID) {
                return true; // Return true if the ID is found
            }
        }
        return false; // Return false if the ID is not found
    }
    
    public void AddPlace(Place place){
        Places.add(place);
        System.out.println("\nPlace Added Sucessfuly");
    }

}
