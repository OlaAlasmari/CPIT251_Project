package cpit251_project;

import java.util.Scanner;
import java.util.ArrayList;

public class CPIT251_Project {

    public static void main(String[] args) {
        System.out.println("Ola Alasmari");
        System.out.println("Hanin Aldosary");
        System.out.println("Shouq Alsubaie");
        System.out.println("Ghala Alshareef");
        System.out.println("Elaf Basmair:))))");

        Scanner s = new Scanner(System.in);

        Supervisor supervisors = new Supervisor();
        supervisors.AddSupervisor(new Supervisor(1));
        supervisors.AddSupervisor(new Supervisor(1));
        supervisors.AddSupervisor(new Supervisor(2));

        //array  list for search 
        Tourist tourist = new Tourist();
        ArrayList<Place> places = new ArrayList<>();
        // name,id,  category, classification, rate, evaluation, description, hour, city, location 
        places.add(new Place("1/2 milion", 2, "vist", "family", "****", "A", "description", "9pm", "london", "jack"));
        places.add(new Place("labeeb", 3, "resturant", "C", "***", "C", "description", "10am", "jeddah", "sari"));
        places.add(new Place("zara", 5, "shop", "C", "*", "A", "description", "9am", "newyork", "mainStreet"));

        Place p = new Place("labeeb", 3, "resturant", "C", "***", "C", "description", "10am", "jeddah", "sari");
        Place p2 = new Place("zara", 5, "shop", "C", "*", "A", "description", "9am", "newyork", "mainStreet");
        Place pg = new Place("1/2 milion", 2, "vist", "family", "****", "A", "description", "9pm", "london", "jack");

        supervisors.AddPlace(p, 1);
        supervisors.AddPlace(pg, 1);

        //''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
        ArrayList<TourGuide> TourGuides = new ArrayList<>();
        //TourGuide(String name,int GID, String GPhone, String GEmail, String GHours, String GRate, String GPlaces,String city)
        TourGuide T1 = new TourGuide("Ahmad", 1111, "0511111111", "A@gmail.com", "2:00PM to 12:00AM", "***", "1/2 milion", "Jeddah");
        TourGuide T2 = new TourGuide("Ali", 2222, "0511222222", "B@gmail.com", "2:00PM to 12:00AM", "*****", "labeeb", "Jeddah");
        TourGuide T3 = new TourGuide("Omar", 3333, "0511333333", "C@gmail.com", "2:00PM to 12:00AM", "**", "zara", "Jeddah");

        TourGuides.add(T1);
        TourGuides.add(T2);
        TourGuides.add(T3);
        
        //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
        
        System.out.println("Are you: a supervisor, a tour guide, a tourist?");
        String Type = s.nextLine();

        if ("Tourist".equalsIgnoreCase(Type)) {
            System.out.println("Choose from the following list the desired service number:\n"
                    + "1- Find a place.\n"
                    + "2- Filtering places.\n"
                    + "3- Evaluate a place.\n"
                    + "4- Find a tour guide.");
            int numSer = s.nextInt();
            if (numSer == 1) {
                System.out.println("Enter name of place");
                String name = s.next();
                String result = tourist.searchPlace(places, name);
                System.out.println(result);
            }

            if (numSer == 2) {
                System.out.println("Enter category: ");
                String category = s.next();
                System.out.println("Enter classification: ");
                String classification = s.next();
                System.out.println("Enter city: ");
                String city = s.next();
                System.out.println("Enter location: ");
                String location = s.next();

                String openHour = s.next();

                tourist.Filter(places, category, classification, city, location, openHour);
            }

            if (numSer == 3) {

                System.out.println("Enter the name of the place you visited:");
                String placeName = s.next();

                System.out.println("Rate the place (from 1 to 5 stars): ");
                String starsRate = s.next();

                System.out.println("Add a comment (optional): ");
                String comment = s.next();

                tourist.evaluPlace(comment, starsRate, placeName);
            }

            if (numSer == 4) {
                int count=0;
                System.out.println("Enter the city: ");
                String city = s.next();
                for (int i = 0; i < TourGuides.size(); i++) {
                    if(city.equalsIgnoreCase(TourGuides.get(i).city))
                        System.out.println((++count)+"- Name of TourGuide: " +TourGuides.get(i).name  + "\nPhone number: " + TourGuides.get(i).GPhone + "\nEmail: "
                        + TourGuides.get(i).GEmail + "\nWork hours: " + TourGuides.get(i).GHours + "\nRate: " + TourGuides.get(i).GRate
                        + "\nPlace: " + TourGuides.get(i).GPlaces +"\nCity: "+ TourGuides.get(i).city +"\n" );
                    
                }
               
            }

        }

    }

}
