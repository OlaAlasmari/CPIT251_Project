package cpit251_project;

public class TourGuide extends User {

    String name;
    int GID;
    String GPhone;
    String GEmail;
    String GHours;
    String GRate;
    String GPlaces;
    String city;

    public TourGuide(String name, int GID, String GPhone, String GEmail, String GHours, String GRate, String GPlaces, String city) {
        this.name = name;
        this.GID = GID;
        this.GPhone = GPhone;
        this.GEmail = GEmail;
        this.GHours = GHours;
        this.GRate = GRate;
        this.GPlaces = GPlaces;
        this.city = city;
    }

    public TourGuide(String name, String GPhone, String GEmail, String GHours, String city) {
        this.name = name;
        this.GPhone = GPhone;
        this.GEmail = GEmail;
        this.GHours = GHours;
        this.city = city;
    }

    public TourGuide(String name, String GPhone, String GEmail, String GHours, String GRate, String GPlayces, String city) {
        this.name = name;
        this.GPhone = GPhone;
        this.GEmail = GEmail;
        this.GHours = GHours;
        this.GRate = GRate;
        this.GPlaces = GPlaces;
        this.city = city;
    }

    public TourGuide(String GPhone, String GHours, String GPlaces, String name, String Email, String Adress, String Gender, String Pass, String userType) {
        super(name, Email, Adress, Gender, Pass, userType);
        this.GPhone = GPhone;
        this.GHours = GHours;
        this.GPlaces = GPlaces;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGID() {
        return GID;
    }

    public void setGID(int GID) {
        this.GID = GID;
    }

    public String getGPhone() {
        return GPhone;
    }

    public void setGPhone(String GPhone) {
        this.GPhone = GPhone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGEmail() {
        return GEmail;

    }

    public void setGEmail(String email) {
        this.GEmail = GEmail;
    }

    public String getGHours() {
        return GHours;

    }

    public void setGHours(String hours) {
        this.GHours = GHours;
    }

    public String getGRate() {
        return GRate;

    }

    public void setGRate(String GRate) {
        this.GRate = GRate;
    }

    public String getGPlaces() {
        return GPlaces;

    }

    public void setGPlaces(String placeName) {
        this.GPlaces = GPlaces;
    }

}
