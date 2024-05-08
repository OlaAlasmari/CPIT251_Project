package cpit251_project;

import java.util.ArrayList;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tourist extends User {

    int TID;
    String Plan;
    Supervisor supervis;
    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("h:mma", Locale.ENGLISH);

    public Tourist(String name, String Email, String Adress, String Gender, String Pass, String userType) {
        super(name, Email, Adress, Gender, Pass, userType);

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

    public String searchPlace(ArrayList<Place> Places, String pName) {
       
         //loop to find place 
        for (int i = 0; i < Places.size(); i++) {
            String name = Places.get(i).placeName;
            String category = Places.get(i).getpCategory();
            String classification = Places.get(i).getclassification();
            String pHours = Places.get(i).getpHours();
            String city = Places.get(i).getcity();
            String rate = Places.get(i).pRate;
            String description = Places.get(i).pDesc;
            //if name of place matches the place name entered by tourist print information 
            if (name.equalsIgnoreCase(pName)) {
                return "Name of Place: " + name + "\nDescription: " + description + "\nCity: "
                        + city + "\nCategory: " + category + "\nClassification: " + classification
                        + "\nOpening Hour: " + pHours + "\nRate: " + rate;

            }
        }
        // no place found 
        return "No result found";
    }

    public void Filter(ArrayList<Place> Places, String pCategory, String classification, String city, String location, String pHours) {
        int searchResult = 0; //count number of result  

         //loop to find places according to tourist specification 
        for (int i = 0; i < Places.size(); i++) {

            String category2 = Places.get(i).getpCategory();
            String classification2 = Places.get(i).getclassification();
            String pHours2 = Places.get(i).getpHours();
            String city2 = Places.get(i).getcity();
            String location2 = Places.get(i).getlocation();

            //check tourist specification
            if (pCategory.equalsIgnoreCase(category2) && classification.equalsIgnoreCase(classification2)
                    && pHours.equalsIgnoreCase(pHours2) && city.equalsIgnoreCase(city2) && location.equalsIgnoreCase(location2)) {
                   
                searchResult = searchResult + 1;
                
                System.out.println("searchResult " + searchResult);
                //print place name with rate 
                System.out.println("place Name: " + Places.get(i).placeName + "    Rate: " + Places.get(i).getpRate());
            }

        }// end of loop    

        // place not found
        if (searchResult == 0) {
            System.out.println("\n\nNo result found");
        }

    }

    public void evaluPlace(ArrayList<Place> Places, String comment, String rate, String pName) {

        if (supervis.IsPlaceExits(Places, pName) == true) {
            if (rate.equals("*") || rate.equals("**") || rate.equals("***") || rate.equals("****") || rate.equals("*****")) {
                System.out.println("Your rating has been successfully submitted! Thank you for sharing your opinion. ");
                addEvaToPlaceDB(comment, rate, pName);
            } else {
                System.out.println("You rated incorrectly, please rate from one to five stars and no more.");
            }
        } else {
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

    // Method to check if the selected hour is within the work hours of a tour guide
    public boolean isWithinWorkHours(String guideHours, String selectedHour) {

        // Split the guide hours into start and end times
        String[] parts = guideHours.split(" to ");
        // Parse the start and end work times
        LocalTime startWork = LocalTime.parse(parts[0], TIME_FORMATTER);
        LocalTime endWork = LocalTime.parse(parts[1], TIME_FORMATTER);

        // Parse the selected time
        LocalTime selectedTime = LocalTime.parse(selectedHour, TIME_FORMATTER);

        // Handle the case when end time is before start time (overnight shift)
        if (endWork.isBefore(startWork)) {
            // If the end time is before the start time, it's an overnight shift
            // Check if the selected time is not before the start time OR not after the end time
            return !selectedTime.isBefore(startWork) || !selectedTime.isAfter(endWork);
        } else {
            // If the end time is after the start time, it's a regular shift
            // Check if the selected time is not before the start time AND not after the end time
            return !selectedTime.isBefore(startWork) && !selectedTime.isAfter(endWork);
        }
    }

    // Method to search for tour guides based on city, place, and time
    public String searchTourGuide(ArrayList<TourGuide> TourGuides, String city, String place, String time) {
        // Counter for the number of tour guides found
        int count = 0;
        // StringBuilder to store the details of tour guides found
        StringBuilder result = new StringBuilder();

        // Loop through each tour guide in the ArrayList
        for (int i = 0; i < TourGuides.size(); i++) {
            // Check if the current tour guide's work hours match the selected time
            boolean isWorkHours = isWithinWorkHours(TourGuides.get(i).GHours, time);
            // Check if the current tour guide is in the specified city and place, and if their work hours match the selected time
            if (city.equalsIgnoreCase(TourGuides.get(i).city) && place.equalsIgnoreCase(TourGuides.get(i).GPlaces) && isWorkHours) {
                // Append the details of the tour guide to the result StringBuilder
                result.append((++count) + "- Name of TourGuide: " + TourGuides.get(i).name + "\nPhone number: " + TourGuides.get(i).GPhone + "\nEmail: "
                        + TourGuides.get(i).GEmail + "\nWork hours: " + TourGuides.get(i).GHours + "\nRate: " + TourGuides.get(i).GRate
                        + "\nPlace: " + TourGuides.get(i).GPlaces + "\nCity: " + TourGuides.get(i).city + "\n\n");
            }
        }
        // If no tour guides were found, return "No result found"
        if (count == 0) {
            return "No result found";
        } // Otherwise, return the details of tour guides found
        else {
            return result.toString();
        }
    }
}
