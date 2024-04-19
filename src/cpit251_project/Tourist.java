
package cpit251_project;

public class Tourist extends User{

    int TID;
    String Plan;

    public Tourist(int TID, String plan) {
        this.TID = TID;
        this.Plan = plan;
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

    public String updatePlace(String Plan) {
        return null;
    }

    public boolean DeletePlace(String pName) {
        return false;
    }

    public boolean searchPlace(String pName) {
        return false;
    }

    public String Filter(String classification, double pRate, String pHours) {
        return null;
    }

    public void evaluPlace(String comment, double rate, int pID) {
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
