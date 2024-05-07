package cpit251_project;

import java.util.Scanner;
import java.util.ArrayList;

public class CPIT251_Project {

    static Scanner s;
    static Scanner sLine;
    static int SID;
    static Supervisor supervisors;

    public static void main(String[] args) {
        int numSer = 0; // for number services in menu

        // Array list 
        ArrayList<User> user = new ArrayList<>();
        ArrayList<TourGuide> TourGuides = new ArrayList<>();

        // object 
        supervisors = new Supervisor();
        Tourist Tour = new Tourist();

        // Adding a tour guide 
        addTourGuides(TourGuides);
       

        //''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
        //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
        s = new Scanner(System.in);
        sLine = new Scanner(System.in);
        System.out.println("\n\n********************************************************************");
        System.out.println("****************************** Tajawl ******************************");
        System.out.println("********************************************************************\n\n");

        //''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
        //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
        System.out.println("Log in / Sign up?");
        String Register = s.nextLine();
        String type = null;
        Tourist tourist = null;
        TourGuide tourGuide = null;

        if ("Log in".equalsIgnoreCase(Register)) {
            System.out.print("Enter Email: ");
            String Email = s.nextLine();
            System.out.print("Enter Password : ");
            String Password = s.nextLine();

            User UserNow = User.login(user, Email, Password);

            if (UserNow != null) {
                type = UserNow.getUserType();
            } else {
                System.out.println("This user is not exists, please sign up.");
                System.exit(0);

            }
        } else if ("Sign up".equalsIgnoreCase(Register)) {
            System.out.print("Register as: Tourist / Tour Guide? ");
            type = s.nextLine();
            System.out.print("Enter Email: ");
            String Email = s.nextLine();
            System.out.print("Enter Password : ");
            String Password = s.nextLine();
            System.out.print("Enter Name : ");
            String Name = s.nextLine();
            System.out.print("Enter Adress : ");
            String Adress = s.nextLine();
            System.out.print("Enter Gender : ");
            String Gender = s.nextLine();

            if ("Tourist".equalsIgnoreCase(type)) {

                tourist = new Tourist(Name, Email, Adress, Gender, Password, type);
                type = tourist.getUserType();
            } else if ("Tour Guide".equalsIgnoreCase(type)) {

                System.out.print("Enter Phone : ");
                String phone = s.nextLine();
                System.out.print("Enter Places : ");
                String places = s.nextLine();
                System.out.print("Enter Hours: ");
                String Hours = s.nextLine();

                tourGuide = new TourGuide(phone, Hours, places, Name, Email, Adress, Gender, Password, type);
                type = tourGuide.getUserType();
            } else {
                System.out.print("Error ! You Should Enter Correct Type \n");
                System.exit(0);
            }

        } else {
            System.out.print("Sorry ! You can't access \n");
            System.exit(0);
        }
        System.out.println("\nWellcome in Tajawl App!!! \n\n");
        //''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
        //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
        System.out.println("Are you: a supervisor, a tour guide, a tourist?");
        String Type = s.nextLine();
        do {
            if ("Tourist".equalsIgnoreCase(Type)) {
                menuTour();
                numSer = s.nextInt();

                if (numSer == 1) {
                    System.out.println("Enter name of place");
                    String name = s.next();
                    String result = Tour.searchPlace(supervisors.Places(), name);
                    System.out.println(result);

                } else if (numSer == 2) {
                    System.out.print("Enter category: ");
                    String category = s.next();
                    System.out.print("Enter classification: ");
                    String classification = s.next();
                    System.out.print("Enter city: ");
                    String city = s.next();
                    System.out.print("Enter location: ");
                    String location = s.next();
                    System.out.print("Enter opening hours: ");
                    String openHour = s.next();

                    Tour.Filter(supervisors.Places(), category, classification, city, location, openHour);
                } else if (numSer == 3) {

                    System.out.println("Enter the name of the place you visited:");
                    String placeName = s.next();
                    System.out.println("Rate the place (from 1 to 5 stars): ");
                    String starsRate = s.next();
                    System.out.println("Add a comment (optional): ");
                    String comment = s.next();
                    Tour.evaluPlace(supervisors.Places(), comment, starsRate, placeName);

                } else if (numSer == 4) {
                    int count = 0;
                    System.out.println("Enter the city: ");
                    String city = s.next();
                    System.out.println("Enter the place: ");
                    String place = sLine.nextLine();
                    System.out.println("Enter the time: ");
                    String time = s.next();
                    
                    String results = Tour.searchTourGuide(TourGuides, city,place,time);
                    System.out.println("\n" + results);

                } else if (numSer == 5) {

                    break;
                }
            } //''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
            //'''''''''''''' SUPERVISOR ''''''''''''''''''''''''''''''''''
            //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
            else if ("supervisor".equalsIgnoreCase(Type)) {
                menuSupervisior(); // menu for supervisor choice
                numSer = s.nextInt(); // number of service

                if (numSer == 1) {
                    AddSupervisor();
                } else if (numSer == 2) {
                    AddPlace();

                } else if (numSer == 3) {
                    supervisors.printPlaceInfo();

                } else if (numSer == 4) {
                    supervisors.printSupervisorInfo();

                } else if (numSer == 5) {
                    break;
                }

            } else {
                System.out.println("Please Enter a Correct Type"); // if user choose someting else tourist and supervisor
                break;
            }

        } while (numSer != 5);
        System.out.println("\nGood Bye");

    }

    // menu supervisor
    public static void menuSupervisior() {
        System.out.println("\n\nChoose from the following list the desired service number:\n"
                + "1- Add new supervisor.\n"
                + "2- Add new places.\n"
                + "3- View places.\n"
                + "4- View supervisors.\n"
                + "5- Quit.\n");

    }

    // menu supervisor
    public static void menuTour() {
        System.out.println("\n\nChoose from the following list the desired service number:\n"
                + "1- Find a place.\n"
                + "2- Filtering places.\n"
                + "3- Evaluate a place.\n"
                + "4- Find a tour guide.\n"
                + "5- Quit.\n");

    }

    public static void AddPlace() {
        // method add new place 
        System.out.print("Enter your supervisior ID : ");
        SID = s.nextInt();
        System.out.print("Enter placeName : ");
        String pname = s.next();
        System.out.print("Enter placeID : ");
        int ID = s.nextInt();
        System.out.print("Enter place Category : ");
        String Category = s.next();
        System.out.print("Enter classification : ");
        String classification = s.next();
        System.out.print("Enter place Rate : ");
        String placeRate = s.next();
        System.out.print("Enter Evaluation : ");
        String Evalution = s.next();
        System.out.print("Enter Description : ");
        String Description = s.next();
        System.out.print("Enter place Hours : ");
        String placeHours = s.next();
        System.out.print("Enter city : ");
        String city = s.next();
        System.out.print("Enter location : ");
        String location = s.next();
        supervisors.AddPlace(new Place(pname, ID, Category, classification, placeRate, Evalution, Description, placeHours, city, location), SID); // call method with new object of places to added

    }

    public static void addTourGuides(ArrayList<TourGuide> TourGuides) {
        //TourGuide(String name,int GID, String GPhone, String GEmail, String GHours, String GRate, String GPlaces,String city)
        TourGuide T1 = new TourGuide("Ahmad", 1111, "0511111111", "A@gmail.com", "2:00PM to 12:00AM", "***", "1/2 million", "Jeddah");
        TourGuide T2 = new TourGuide("Ali", 2222, "0511222222", "B@gmail.com", "2:00PM to 12:00AM", "*****", "labeeb", "Jeddah");
        TourGuide T3 = new TourGuide("Omar", 3333, "0511333333", "C@gmail.com", "2:00PM to 12:00AM", "**", "zara", "Jeddah");
        
        // Adding the default tour guides to the provided ArrayList
        TourGuides.add(T1);
        TourGuides.add(T2);
        TourGuides.add(T3);
    }

    public static void AddSupervisor() {
        System.out.print("Enter ID of supervisior: ");
        SID = s.nextInt();
        System.out.print("Enter name of supervisior: ");
        String name = s.next();
        supervisors.AddSupervisor(new Supervisor(SID, name)); // call method with new Supervisor parameter to added
    }

}
