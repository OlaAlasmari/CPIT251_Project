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
 * @author olaal
 */
public class SupervisorTest {


    public SupervisorTest() {
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

    @Test
    public void testAddSupervisor() {
        System.out.println("AddSupervisor");
         ArrayList<Supervisor> Supervisors = new ArrayList<>();
         Supervisor Supervisor = new Supervisor(1);
         Supervisor instance = new Supervisor();
         instance.AddSupervisor(Supervisor);
         assertNotNull(instance);
    }

    @Test
    public void testIsSupervisorIdPresent() {
        Supervisor supervisor = new Supervisor(1);
        Supervisor instance = new Supervisor();
        System.out.println("isSupervisorIdPresent");
        instance.AddSupervisor(supervisor);
      
        ArrayList<Supervisor> supervisors = new ArrayList<> ();
        supervisors.add(instance);
        int sID = 1;
        boolean expResult = true;
        boolean result = Supervisor.isSupervisorIdPresent(sID);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testIsSupervisorIdNotPresent() {
        Supervisor supervisor = new Supervisor(1);
        Supervisor instance = new Supervisor();
        System.out.println("isSupervisorIdPresent");
        instance.AddSupervisor(supervisor);
      
        ArrayList<Supervisor> supervisors = new ArrayList<> ();
        supervisors.add(instance);
        int sID = 2;
        boolean expResult = false;
        boolean result = Supervisor.isSupervisorIdPresent(sID);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testIsPlaceExits() {
        Place Place = new Place("zara", 5, "shop", "C", "***", "Alo", "description", "9am", "newyork", "mainStreet");
        System.out.println("IsPlaceExits");
        ArrayList<Place> Places = new ArrayList<>();
        Places.add(Place);
        String PlaceName = "zara";
        boolean expResult = true;
        boolean result = Supervisor.IsPlaceExits(Places, PlaceName);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testIsPlaceNotExits() {
        Place Place = new Place("zara", 5, "shop", "C", "***", "Alo", "description", "9am", "newyork", "mainStreet");
        System.out.println("IsPlaceExits");
        ArrayList<Place> Places = new ArrayList<>();
        Places.add(Place);
        String PlaceName = "H&M";
        boolean expResult = false;
        boolean result = Supervisor.IsPlaceExits(Places, PlaceName);
        assertEquals(expResult, result);

    }

    @Test
    public void testAddPlace() {
        System.out.println("AddPlace");
        ArrayList<Place> places = new ArrayList<> ();
        Place place = new Place("zara", 5, "shop", "C", "*", "A", "description", "9am", "newyork", "mainStreet");
        places.add(place);
        
        int sID = 5;
        Supervisor instance1 = new Supervisor();
        instance1.AddPlace(place, sID);
        assertNotNull(instance1);

    }


}
