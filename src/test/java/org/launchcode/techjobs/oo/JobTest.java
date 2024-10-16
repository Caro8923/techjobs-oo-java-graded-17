package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    //Test Empty Constructor
    @Test
    public void testSettingJobId() {
        Job typeOne = new Job();
        Job typeTwo = new Job();
        assertNotEquals(typeOne.getId(), typeTwo.getId());
    }


    //Test full constructor
    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", job.getName());
        assertTrue("Sets Employer type parameter", job.getEmployer() instanceof Employer);
        assertTrue("Sets Location type parameter", job.getLocation() instanceof Location);
        assertTrue("Sets PositionType type parameter", job.getPositionType() instanceof PositionType);
        assertTrue("Sets CoreCompentancy type parameter", job.getCoreCompetency() instanceof CoreCompetency);
    }

    //Test equals method
    @Test
    public void testJobsForEquality() {
        Job typeOne = new Job("Yoga Teacher", new Employer("Sumits Yoga"), new Location("Chesterfield"), new PositionType("teacher"), new CoreCompetency("Scheduling"));
        Job typeTwo = new Job("Yoga Teacher", new Employer("Sumits Yoga"), new Location("Chesterfield"), new PositionType("teacher"), new CoreCompetency("Scheduling"));
        assertNotEquals(typeOne, typeTwo);
    }

    //Test toString method
    // 1. Starts and ends with new line
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job = new Job();
        String string = job.toString();
        String line = System.lineSeparator();
        assertTrue("Starts with new line", string.startsWith(line));
        assertTrue("String ends with new line", string.endsWith(line));
    }

    //2. Contains correct labels and data
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String string = job.toString();
        String line = System.lineSeparator();
        String testFormat = line + "ID: " + job.getId() + line + "Name: " + job.getName() + line + "Employer: " + job.getEmployer() + line + "Location: " + job.getLocation() + line + "Position Type: " + job.getPositionType() + line + "Core Competency: " + job.getCoreCompetency() + line;
        assertEquals(testFormat, string);
    }

    //3. Returns 'Data not Available' if field is empty
    @Test
    public void testToStringHandlesEmptyField(){
        Job job = new Job();
        String string = job.toString();
        String line = System.lineSeparator();
        String testFormat = line + "ID: " + job.getId() + line + "Name: Data not available" + line + "Employer: Data not available" +  line + "Location: Data not available" + line + "Position Type: Data not available" + line + "Core Competency: Data not available" + line;
        assertEquals(testFormat, string);
    }
}
