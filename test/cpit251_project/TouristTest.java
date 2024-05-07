/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit251_project;

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
    
    
}
