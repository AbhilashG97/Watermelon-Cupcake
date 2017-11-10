package util;

import student.*;

public class DisplayContents {

    private Student student;

    public DisplayContents(Student student){
        this.student = student;
    }

    public void displayAllArrearContents(){
        NonAcademics nonAcademics = student.getNonAcademics();
        Arrears arrears = nonAcademics.getArrears();
        int counter = 1;
        System.out.println("Number of Arrears : "+arrears.getNumberOfArrears());

        for(String iterator : arrears.getArrearSubjects()){
            System.out.println(counter +" -> "+ iterator);
            counter++;
        }
    }

    public void displayAllSuspensionsContents(){
        NonAcademics nonAcademics = student.getNonAcademics();
        Suspensions suspensions = nonAcademics.getSuspensions();
        int counter = 1;
        System.out.println("Number of times the student got suspended : "+suspensions.getSuspensionCount());

        for(String iterator : suspensions.getReasonOfSuspensionList()){
            System.out.println(counter +" -> "+iterator);
            counter++;
        }
    }

    public void displayAllInternshipContents(){
        NonAcademics nonAcademics = student.getNonAcademics();
        Internships internships = nonAcademics.getInternships();
        int counter = 1;
        System.out.println("Number of internships attended by the student : "+internships.getNumberOfInternships());

        for(String iterator : internships.getListOfInternships()){
            System.out.println(counter + " -> "+iterator);
            counter++;
        }
    }

    public void displayAllProjects(){
        NonAcademics nonAcademics = student.getNonAcademics();
        Projects projects = nonAcademics.getProject();
        int counter = 1;
        System.out.println("Number of projects on which the student worked on : "+projects.getNumberOfProjects());

        for(String iterator : projects.getProjectNames()){
            System.out.println(counter + " -> "+iterator);
            counter++;
        }
    }

    public void displayAllSeminarContents(){
        NonAcademics nonAcademics = student.getNonAcademics();
        Seminars seminars = nonAcademics.getSeminar();
        System.out.println("Number of seminars attended : "+seminars.getNumberOfSeminarsAttended());
        System.out.println("Number of seminars taken : "+seminars.getNumberOfSeminarsTaken());
    }

    public void displayAllSportsContent(){
        NonAcademics nonAcademics = student.getNonAcademics();
        Sports sports = nonAcademics.getSports();
        int counter = 1;
        System.out.println("Total number of events in which the student participated : "+sports.getNumberOfEventsParticipated());

        for(String iterator : sports.getEventNames()){
            System.out.println(counter +" -> "+iterator);
            counter++;
        }

        System.out.println("\n--------------------------------------------\n");
        System.out.println("Gold medals won : "+sports.getNumberOfGoldMedalsWon());
        System.out.println("Silver medals won : "+sports.getNumberOfSilverMedalsWon());
        System.out.println("Bronze medals won : "+sports.getNumberOfBronzeMedalsWon());
    }

    public void displayAllVolunteeringContents(){
        NonAcademics nonAcademics = student.getNonAcademics();
        Volunteering volunteering = nonAcademics.getVolunteering();
        int counter = 1;
        System.out.println("Number of events in which a student volunteered to be a part of : "+volunteering.getNumberOfEventsVolunteered());

        for(String iterator : volunteering.getVolunteeredEvents()){
            System.out.println(counter + " -> "+iterator);
            counter++;
        }
    }

    public void displayAllNonAcademicContents(){
        displayAllArrearContents();
        displayAllSuspensionsContents();
        displayAllInternshipContents();
        displayAllProjects();
        displayAllSeminarContents();
        displayAllSportsContent();
        displayAllVolunteeringContents();
    }

}
