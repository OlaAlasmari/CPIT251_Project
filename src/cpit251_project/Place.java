package cpit251_project;


public class Place {

    String placeName;
    int pID;
    String pCategory;
    String classification;
    String pRate;
    String pEva;
    String pDesc;
    String pHours;
    String city; 
    String location; 

    
   
    
    public Place(String placeName, int pID, String pCategory, String classification,
            String pRate, String pEva, String pDesc, String pHours, String city, String location) {
        
        this.placeName = placeName;
        this.pID = pID;
        this.pCategory = pCategory;
        this.classification = classification;
        this.pRate = pRate;
        this.pEva = pEva;  //evaluation by tourist
        this.pDesc = pDesc;  //place description 
        this.pHours = pHours;
        this.city=city; 
        this.location=location; 
    }


    public String getplaceName() {
        return placeName;
    }

    public void setplaceName(String placeName) {
        this.placeName = placeName;
    }

    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }

    public String getpCategory() {
        return pCategory;
    }

    public void setpCategory(String pCategory) {
        this.pCategory = pCategory;
    }

    public String getclassification() {
        return classification;
    }

    public void setclassification(String classification) {
        this.classification = classification;
    }

    public String getpRate() {
        return pRate;
    }

    public void setpRate(String pRate) {
        this.pRate = pRate;
    }

    public String getpEva() {
        return pEva;
    }

    public void setpEva(String pEva) {
        this.pEva = pEva;
    }

    public String getpDesc() {
        return pDesc;
    }

    public void setpDesc(String pDesc) {
        this.pDesc = pDesc;
    }

    public String getpHours() {
        return pHours;
    }

    public void setpHours(String pHours) {
        this.pHours = pHours;
    }
    
    public String getlocation() {
        return location;
    }
    
    public void setlocation(String location) {
        this.location = location;
    }
    
      public String getcity() {
        return city;
    }
    
    public void setcity(String city) {
        this.city = city;
    }

}
