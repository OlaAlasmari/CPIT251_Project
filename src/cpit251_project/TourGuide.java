
package cpit251_project;

public class TourGuide extends User{
    int GID;
    int GPhone;
    String GEmail;
    String GHours;
    String GRate;
    String GPlaces;
    
    public TourGuide(int GID, int GPhone, String GEmail, String GHours, String GRate, String GPlaces){
       this.GID = GID;
       this.GPhone = GPhone;
       this.GEmail = GEmail;
       this.GHours = GHours;
       this.GRate = GRate;
       this.GPlaces = GPlaces;
    }
    
    public int getGPhone (){
        return GPhone;
        
    }
    
    public void setGPhone(int phoneNum){
        this.GPhone = GPhone;
    }
    
    public String getGEmail(){
        return GEmail;
        
    }
    
    public void setGEmail(String email){
       this.GEmail = GEmail; 
    }
    
    public String getGHours(){
        return GHours;
        
    }
    
    public void setGHours(String hours){
        this.GHours = GHours;
    }
    
    public String getGRate(){
        return GRate;
        
    }
    
    public void setGRate(String GRate){
       this.GRate = GRate; 
    }
    
    public String getGPlaces(){
        return GPlaces;
        
    }  
    
    public void setGPlaces(String placeName){
       this.GPlaces = GPlaces; 
    }
    
}

