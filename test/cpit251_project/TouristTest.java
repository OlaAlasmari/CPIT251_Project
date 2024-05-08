/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit251_project;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static cpit251_project.CPIT251_Project.SID;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hanee
 */
public class TouristTest {
    
    public TouristTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Test of searchTourGuide method, of class Tourist.
     */
    @Test
    public void testSearchTourGuideExists() {
        System.out.println("searchTourGuide");
        ArrayList<TourGuide> TourGuides = new ArrayList <> ();
        TourGuide T1 = new TourGuide("Ahmad", 1111, "0511111111", "A@gmail.com", "2:00PM to 12:00AM", "***", "1/2 million", "Jeddah");
        TourGuides.add(T1);
        
        String city = "Jeddah";
        String place ="1/2 million";
        String time ="3:30PM";
        Tourist instance = new Tourist();
        String expResult = "1- Name of TourGuide: Ahmad\nPhone number: 0511111111\nEmail: A@gmail.com\nWork hours: 2:00PM to 12:00AM\nRate: ***\nPlace: 1/2 million\nCity: Jeddah\n\n";
        String result = instance.searchTourGuide(TourGuides, city,place,time);
        assertEquals(expResult, result);
       
    }
    @Test
    public void testSearchTourGuideNotExists() {
        System.out.println("searchTourGuide");
        ArrayList<TourGuide> TourGuides = new ArrayList <> ();
        TourGuide T1 = new TourGuide("Ahmad", 1111, "0511111111", "A@gmail.com", "2:00PM to 12:00AM", "***", "1/2 million", "Jeddah");
        TourGuides.add(T1);
        
        String city = "Riyadh";
        String place ="1/2 million";
        String time ="1:00AM";
        Tourist instance = new Tourist();
        String expResult = "No result found";
        String result = instance.searchTourGuide(TourGuides, city,place,time);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getTID method, of class Tourist.
     */
    @Test
    public void testGetTID() {
        System.out.println("getTID");
        Tourist instance = new Tourist();
        int expResult = 0;
        int result = instance.getTID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTID method, of class Tourist.
     */
    @Test
    public void testSetTID() {
        System.out.println("setTID");
        int TID = 0;
        Tourist instance = new Tourist();
        instance.setTID(TID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlan method, of class Tourist.
     */
    @Test
    public void testGetPlan() {
        System.out.println("getPlan");
        Tourist instance = new Tourist();
        String expResult = "";
        String result = instance.getPlan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlan method, of class Tourist.
     */
    @Test
    public void testSetPlan() {
        System.out.println("setPlan");
        String plan = "";
        Tourist instance = new Tourist();
        instance.setPlan(plan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePlan method, of class Tourist.
     */
    @Test
    public void testUpdatePlan() {
        System.out.println("updatePlan");
        String Plan = "";
        Tourist instance = new Tourist();
        String expResult = "";
        String result = instance.updatePlan(Plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DeletePlan method, of class Tourist.
     */
    @Test
    public void testDeletePlan() {
        System.out.println("DeletePlan");
        String Plan = "";
        Tourist instance = new Tourist();
        boolean expResult = false;
        boolean result = instance.DeletePlan(Plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchPlace method, of class Tourist.
     */
    @Test
    public void testSearchPlace() {
        System.out.println("searchPlace");
        ArrayList<Place> Places =new ArrayList<>();
        String name="Albalad"; 
        String description="historical";
        String city="jeddah"; 
        String category="family"; 
        String classification="historical"; 
        String pHours="1pm";
        String rate="*****";
        
        
        Places.add(new Place(name, 3, category, classification ,rate, "great place", description, pHours, city, "centre of jeddah"));
       
      
        Tourist instance = new Tourist();
        String expResult ="Name of Place: " + name + "\nDescription: " + description + "\nCity: "
                        + city + "\nCategory: " + category + "\nClassification: " + classification
                        + "\nOpening Hour: " + pHours + "\nRate: " + rate;
        
        String result = instance.searchPlace(Places, name);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of Filter method, of class Tourist.
     */
    @Test
    public void testFilter() {
        System.out.println("Filter");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        ArrayList<Place> Places = new ArrayList<>();
        Places.add(new Place("albalad", 3, "historical", "family" ,"****", "great place", "old jeddah", "5pm", "jeddah", "centre of jeddah"));
        
        
        String pCategory = "historical";
        String classification = "family";
        String city = "jeddah";
        String location = "centre of jeddah";
        String pHours = "5pm";
        Tourist instance = new Tourist();
        instance.Filter(Places, pCategory, classification, city, location, pHours);
        
        String expectedResult = "searchResult " + 1 +System.getProperty("line.separator"); 
        expectedResult += "place Name: " + "albalad" + "    Rate: " + "****" + System.getProperty("line.separator");
         assertEquals(expectedResult, out.toString());
    }

    /**
     * Test of evaluPlace method, of class Tourist.
     */
    @Test
    public void testEvaluPlace() {
        System.out.println("evaluPlace");
        ArrayList<Place> Places = null;
        String comment = "";
        String rate = "";
        String pName = "";
        Tourist instance = new Tourist();
        instance.evaluPlace(Places, comment, rate, pName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEvaToPlaceDB method, of class Tourist.
     */
    @Test
    public void testAddEvaToPlaceDB() {
        System.out.println("addEvaToPlaceDB");
        String comment = "";
        String rate = "";
        String pName = "";
        Tourist instance = new Tourist();
        instance.addEvaToPlaceDB(comment, rate, pName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of evaluTourGuide method, of class Tourist.
     */
    @Test
    public void testEvaluTourGuide() {
        System.out.println("evaluTourGuide");
        double rate = 0.0;
        int GID = 0;
        Tourist instance = new Tourist();
        instance.evaluTourGuide(rate, GID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makePlan method, of class Tourist.
     */
    @Test
    public void testMakePlan() {
        System.out.println("makePlan");
        String Plan = "";
        Tourist instance = new Tourist();
        String expResult = "";
        String result = instance.makePlan(Plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sharePlan method, of class Tourist.
     */
    @Test
    public void testSharePlan() {
        System.out.println("sharePlan");
        String Plan = "";
        Tourist instance = new Tourist();
        boolean expResult = false;
        boolean result = instance.sharePlan(Plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isWithinWorkHours method, of class Tourist.
     */
    @Test
    public void testIsWithinWorkHours() {
        System.out.println("isWithinWorkHours");
        String guideHours = "";
        String selectedHour = "";
        Tourist instance = new Tourist();
        boolean expResult = false;
        boolean result = instance.isWithinWorkHours(guideHours, selectedHour);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTourGuide method, of class Tourist.
     */
    @Test
    public void testSearchTourGuide() {
        System.out.println("searchTourGuide");
        ArrayList<TourGuide> TourGuides = null;
        String city = "";
        String place = "";
        String time = "";
        Tourist instance = new Tourist();
        String expResult = "";
        String result = instance.searchTourGuide(TourGuides, city, place, time);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
    
}
