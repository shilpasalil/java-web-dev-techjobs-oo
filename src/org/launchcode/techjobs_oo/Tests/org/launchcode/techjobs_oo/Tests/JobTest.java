package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job jobOne;
    Job jobTwo;
    Job testJobFields;
    Job testJobForEquality;
    Job testBlank;
    Job testOnlyIdExist;

    @Before
    public void createTwoJobObjects(){
        jobOne = new Job();
        jobTwo = new Job();
        testJobFields = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJobForEquality = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testBlank = new Job("Product tester", new Employer(""), new Location(""), new PositionType("Quality control"), new CoreCompetency(""));
        testOnlyIdExist = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

    }

    @Test
    public void testSettingJobId(){
        assertEquals(1,jobTwo.getId()-jobOne.getId());
        System.out.println("test 1!");
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        //System.out.println(testJobFields);
        assertEquals("Product tester",testJobFields.getName());
        assertEquals("ACME", testJobFields.getEmployer().getValue());
        assertEquals("Desert", testJobFields.getLocation().getValue());
        assertEquals("Quality control", testJobFields.getPositionType().getValue());
        assertEquals("Persistence", testJobFields.getCoreCompetency().getValue());
        assertTrue(testJobFields instanceof Job);
        System.out.println("Test 2!");
    }

    @Test
    public void testJobsForEquality(){
        //System.out.println(testJobFields.getId()-testJobForEquality.getId());
        //assertEquals(0, testJobFields.getId()-testJobForEquality.getId());
        //assertFalse(testJobFields.equals(testJobForEquality));
        assertNotEquals(testJobFields, testJobForEquality);
        System.out.println("Test 3!");
    }

    @Test
    public void testContainsBlankLineBeforeAndAfterToStringJobInfo(){
        assertTrue(testJobFields.toString().startsWith("\n"));
        assertTrue(testJobFields.toString().endsWith("\n"));
    }

    @Test
    public void testJobFieldsWithLabelsAndData(){
        //System.out.println(testJobFields.toString());
        assertTrue(testJobFields.toString().contains("\nID:"));
        assertTrue(testJobFields.toString().contains("\nName:"));
        assertTrue(testJobFields.toString().contains("\nEmployer:"));
        assertTrue(testJobFields.toString().contains("\nLocation:"));
        assertTrue(testJobFields.toString().contains("\nPosition Type:"));
        assertTrue(testJobFields.toString().contains("\nCore Competency:"));
    }

    @Test
    public void testFieldEmpty(){
        //System.out.println(testBlank);
        assertTrue(testBlank.toString().contains("Data not available"));
    }

    @Test
    public void testIfJobContainsOnlyID(){
        assertEquals("OOPS! This job does not seem to exist.", testOnlyIdExist.toString());
        //assertTrue(testOnlyIdExist.toString().contains("OOPS! This job does not seem to exist."));
    }


}
