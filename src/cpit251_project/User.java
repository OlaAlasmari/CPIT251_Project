package cpit251_project;

import java.util.ArrayList;

public class User {

    String name;
    String Email;
    String Adress;
    String Gender;
    String Pass;
    String userType;

    public User(String name, String Email, String Adress, String Gender, String Pass, String userType) {
        this.name = name;
        this.Email = Email;
        this.Adress = Adress;
        this.Gender = Gender;
        this.Pass = Pass;
        this.userType = userType;
    }
    public User(String Email, String Pass) {
        this.Email = Email;
        this.Pass = Pass;
    }

    public static User login(ArrayList<User> user, String Email, String pass) {
        User userInof = IsUserExit(user, Email, pass);
        if (userInof != null) {
            return userInof;
        }

        return null;
    }
    
    public User(){
        
    }
    
    public User(String name){
       this.name = name; 
    }

    public boolean login(String Email, String pass) {
        return false;
    }

    public boolean login(String Name, String Email, String Adress, String Gender, String pass, String userType) {
        return false;
    }

    public boolean signup(String Name, String Email, String Adress, String Gender, String pass, String userType) {
        return false;
    }

    public static User IsUserExit(ArrayList<User> user, String Email, String Password) {

        for (User u : user) {
            if (u.getEmail().equalsIgnoreCase(Email) && u.getPass().equals(Password)) { // check if user exit 
                return u;

            }
        }

        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

}
