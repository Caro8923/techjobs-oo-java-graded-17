package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job typeOne = new Job();
        Job typeTwo = new Job();
        assertNotEquals(typeOne.getId(), typeTwo.getId());
    }

//    //Need to complete
//    //How to access value for an object parameter to assertEquals
//    //What is name class for assertTrue?
//    @Test
//    public void JobConstructorSetsAllFields() {
//        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        assertTrue();
//        assertEquals("Product tester", job.getName());
//    }

    @Test
    public void testJobsForEquality() {
        Job typeOne = new Job("Yoga Teacher", new Employer("Sumits Yoga"), new Location("Chesterfield"), new PositionType("teacher"), new CoreCompetency("Scheduling"));
        Job typeTwo = new Job("Yoga Teacher", new Employer("Sumits Yoga"), new Location("Chesterfield"), new PositionType("teacher"), new CoreCompetency("Scheduling"));
        assertFalse(typeOne.equals(typeTwo));
    }
}
