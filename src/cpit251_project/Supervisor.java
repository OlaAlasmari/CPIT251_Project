package cpit251_project;

import java.util.ArrayList;

public class Supervisor extends User {

    public Place place;
    int sID;
    static ArrayList<Supervisor> supervisors;
    public static ArrayList<Place> Places = new ArrayList<>();

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

    public boolean deleteTourGuide(int GID) {
        return false;
    }

    public boolean updatePlaceInfo(Place place) {
        return false;
    }

    public boolean deleteEvaluation(Place place) {
        return false;
    }

    public void AddSupervisor(Supervisor newSupervisor) {
        if (isSupervisorIdPresent(newSupervisor.getsID())) { //if ID is found (already exist)
            System.out.println("\nSupervisor with the same ID already exists\n");
        } else { //if ID is not found 
            supervisors.add(newSupervisor); //Add the new supervisor
            System.out.println("\nSupervisor added successfully\n");
        }
    }

    public void printSupervisorInfo() {
        for (Supervisor supervisor : supervisors) {
            System.out.println("\nID: " + supervisor.getsID() + "\t\t Name: " + supervisor.getName()); //Print id and name for each supervisor
        }
    }

    
    public static boolean isSupervisorIdPresent(int sID) {
        for (Supervisor supervisor : supervisors) {
            if (supervisor.getsID() == sID) {
                return true; // Return true if the ID is found
            }
        }

        return false; // Return false if the ID is not found
    }

    private static boolean IsPlaceExit(ArrayList<Place> Places, String PlaceName) {
        for (Place place : Places) {
            if (place.getplaceName().equalsIgnoreCase(PlaceName)) { 
                return true; //Return true if the place is exist
            }
        }
        return false; //Return false if the place is not exist
    }

    public static boolean IsPlaceExits(ArrayList<Place> Places, String PlaceName) {
        return IsPlaceExit(Places, PlaceName);
    }

    public void AddPlace(Place place, int sID) {
        if (isSupervisorIdPresent(sID)) { // check if the user is supervisor or not
            if (!IsPlaceExit(Places, place.placeName)) {  // check if the place is found or not
                Places.add(place);
                System.out.println("\n Place Added Sucessfuly"); //if the place is not exist , add it

            } else {
                System.out.println("\n Place already exist"); //if the place is already exist 
            }
        } else {
            System.out.println("\n You don't have permission to add "); //if the user is not supervisor
        }
    }

    public void printPlaceInfo() { 
        for (Place place : Places) {
            System.out.println("name: " + place.getplaceName() + "\nID: " + place.pID + "\nCateogry: " + place.getpCategory() + "\nClassification: " + place.getclassification()
                    + "\nrate: " + place.getpRate() + "\nevalution: " + place.getpEva() + "\ndescribe: " + place.getpDesc() + "\nhourse: " + place.getpHours() + "\ncity: " + place.getcity()
                    + "\nlocation: " + place.getlocation() + "\n------------------\n");
        }
    }

    public ArrayList<Place> Places() {
        return Places;
    }

    void add(String albalad, int i, String historical, String family, String string, String great_place, String old_jeddah, String pm, String jeddah, String centre_of_jeddah) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 
