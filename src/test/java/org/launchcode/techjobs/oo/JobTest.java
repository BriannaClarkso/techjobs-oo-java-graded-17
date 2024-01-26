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

//        assertTrue(jobTest.getName() instanceof String);
//        assertTrue(jobTest.getEmployer() instanceof Employer);
//        assertTrue(jobTest.getLocation() instanceof Location);
//        assertTrue(jobTest.getPositionType() instanceof PositionType);
//        assertTrue(jobTest.getCoreCompetency() instanceof CoreCompetency);

        assertTrue(jobTest.getName() != null);
        assertTrue(jobTest.getEmployer() != null);
        assertTrue(jobTest.getLocation() != null);
        assertTrue(jobTest.getPositionType() != null);
        assertNotNull(jobTest.getCoreCompetency());
//        assertTrue(jobTest.getCoreCompetency() != null);

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

//        assertEquals(jobTest.toString().charAt(0), System.lineSeparator());
        assertTrue(jobTest.toString().startsWith(System.lineSeparator()));
        assertTrue(jobTest.toString().endsWith(System.lineSeparator()));

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {

        Job jobTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String expectedJob =
//                "\n" +
//                        "ID: " + jobTest.getId() + System.lineSeparator() +
//                        "Name: " + "Product tester" + System.lineSeparator() +
//                        "Employer: " + "ACME" + System.lineSeparator() +
//                        "Location: " + "Desert" + System.lineSeparator() +
//                        "Position Type: " + "Quality control" + System.lineSeparator() +
//                        "Core Competency: " + "Persistence" + System.lineSeparator()
//                + "\n";


              String.format(System.lineSeparator() +
                        "ID: " + jobTest.getId()) + "\n" +
                        "Name: " + jobTest.getName() + "\n"  +
                        "Employer: " + jobTest.getEmployer() + "\n"  +
                        "Location: "  + jobTest.getLocation() + "\n"  +
                        "Position Type: "  + jobTest.getPositionType() + "\n" +
                        "Core Competency: "  + jobTest.getCoreCompetency()
                        + System.lineSeparator();


        assertEquals(expectedJob, jobTest.toString());

    }

    @Test
    public void testToStringHandlesEmptyField() {

//        Job jobTest = new Job();

        Job jobTest = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));

        String expectedJob = String.format(System.lineSeparator() +
//                        "\n" +
                        "ID: %d" , jobTest.getId()) + "\n" +
                        "Name: " + jobTest.getName() + "\n" +
                        "Employer: Data not available" +"\n" +
                        "Location: " + jobTest.getLocation() + "\n" +
                        "Position Type: Data not available" + "\n" +
                        "Core Competency: " + jobTest.getCoreCompetency()
                        + System.lineSeparator();

        assertEquals(expectedJob, jobTest.toString());

    }

}
