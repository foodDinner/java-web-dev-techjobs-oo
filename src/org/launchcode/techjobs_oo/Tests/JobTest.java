package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {
    Job test_Job1;
    Job test_Job2;
    Job test_Job3;
    Job test_Job4;

    @Before
    public void createTestJobs() {
        test_Job1 = new Job();
        test_Job2 = new Job();
        test_Job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_Job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        assertFalse(test_Job1.equals(test_Job2));
        System.out.println(test_Job1.getId());
        System.out.println(test_Job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals(3,test_Job3.getId(), 001);
        assertEquals("Product tester",test_Job3.getName());
        assertEquals("ACME",test_Job3.getEmployer().getValue());
        assertTrue(test_Job3.getEmployer() instanceof Employer);
        assertEquals("Desert",test_Job3.getLocation().getValue());
        assertTrue(test_Job3.getLocation() instanceof Location);
        assertEquals("Quality control",test_Job3.getPositionType().getValue());
        assertTrue(test_Job3.getPositionType() instanceof PositionType);
        assertEquals("Persistence",test_Job3.getCoreCompetency().getValue());
        assertTrue(test_Job3.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(test_Job3.equals(test_Job4));
    }

    @Test
    public void testToString() {
        "\n".equals(test_Job3.toString().charAt(0));
        "ID: 3".equals(test_Job3.jobID);
        "Name: Product tester".equals(test_Job3.jobName);
        "Employer: ACME".equals(test_Job3.jobEmployer);
        "Location: Desert".equals(test_Job3.jobLocation);
        "Position Type: Quality control".equals(test_Job3.jobPosition);
        "Core Competency: Persistence".equals(test_Job3.jobCoreComp);
    }
}
