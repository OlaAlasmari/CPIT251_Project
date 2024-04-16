
package cpit251_project;


public class Supervisor {

    Place place;
    int sID;

    public Supervisor(Place place, int sID) {
        this.place = place;
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

}
