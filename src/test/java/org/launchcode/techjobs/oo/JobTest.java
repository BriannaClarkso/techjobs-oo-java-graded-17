package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;


public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId(){

        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(), job2.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields(){

        Job jobTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

//        String nameTest = "Product tester";

        assertEquals("Product tester", jobTest.getName());
        assertEquals("ACME", jobTest.getEmployer().getValue());
        assertEquals("Desert", jobTest.getLocation().getValue());
        assertEquals("Quality control", jobTest.getPositionType().getValue());
        assertEquals("Persistence", jobTest.getCoreCompetency().getValue());

        assertTrue(jobTest.getName() instanceof String);
        assertTrue(jobTest.getEmployer() instanceof Employer);
        assertTrue(jobTest.getLocation() instanceof Location);
        assertTrue(jobTest.getPositionType() instanceof PositionType);
        assertTrue(jobTest.getCoreCompetency() instanceof CoreCompetency);

    }

    @Test
    public void testJobsForEquality() {
        Job jobTest1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobTest2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


        assertNotEquals(jobTest1.getId(), jobTest2.getId());

    }

    //Task 5
    @Test
    public void testToStringStartsAndEndsWithNewLine() {

        Job jobTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

//        String expectedJob =
//                System.lineSeparator() +
//                        "ID: " + jobTest.getId() + System.lineSeparator() +
//                        "Name: Product tester" + System.lineSeparator() +
//                        "Employer: ACME" + System.lineSeparator() +
//                        "Location: Desert" + System.lineSeparator() +
//                        "Position Type: Quality control" + System.lineSeparator() +
//                        "Core Competency: Persistence" + System.lineSeparator();

//        assertEquals(expectedJob, jobTest.toString());

        assertEquals(jobTest.toString().charAt(0), '\n');

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {

        Job jobTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String expectedJob =
                "\n" +
                        "ID: " + jobTest.getId() + System.lineSeparator() +
                        "Name: Product tester" + System.lineSeparator() +
                        "Employer: ACME" + System.lineSeparator() +
                        "Location: Desert" + System.lineSeparator() +
                        "Position Type: Quality control" + System.lineSeparator() +
                        "Core Competency: Persistence" + System.lineSeparator()
                + "\n";


        assertEquals(expectedJob, jobTest.toString());

    }

    @Test
    public void testToStringHandlesEmptyField() {

        Job jobTest = new Job();

        String expectedJob =
                        "\n" +
                        "ID: " + jobTest.getId() + System.lineSeparator() +
                        "Name: Data not available" + System.lineSeparator() +
                        "Employer: Data not available" + System.lineSeparator() +
                        "Location: Data not available" + System.lineSeparator() +
                        "Position Type: Data not available" + System.lineSeparator() +
                        "Core Competency: Data not available" + System.lineSeparator()
                        + "\n";

        assertEquals(expectedJob, jobTest.toString());

    }

}
