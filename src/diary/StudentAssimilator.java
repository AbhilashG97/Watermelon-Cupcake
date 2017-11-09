package diary;

import display.NewDiaryDisplay;
import student.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentAssimilator {

    private Student student;
    private Course course;
    private int numberOfCourses;
    private Arrears arrears;
    private Internships internships;
    private Projects projects;
    private Seminars seminars;
    private Sports sports;
    private Suspensions suspensions;
    private Volunteering volunteering;
    private Disciplinary disciplinary;
    private NonAcademics nonAcademics;


    private Marks marks;
    private BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

    public StudentAssimilator() {
        student = null;
        course = null;
        marks = null;
        numberOfCourses = 0;
    }

    public Student getStudent() {
        return student;
    }

    public Course setCourseToBeTaken() throws Exception {
        course = new Course();

        NewDiaryDisplay.displayCourseDetailsPage();

        NewDiaryDisplay.displaySetCourseNameMessage();
        course.setCourseName(bfr.readLine());

        NewDiaryDisplay.displaySetCourseCodeMessage();
        course.setCourseCode(bfr.readLine());

        NewDiaryDisplay.displaySetCreditsMessage();
        course.setCredits(Integer.parseInt(bfr.readLine()));

        course.setMarks(setAllMarksToZero());

        return course;
    }

    //IDEA : - Create an ENUM/HashMap for courses and then select the course[key] based on the
    // course code[value] entered by the user.


    public Marks setMarksOfCoursesTaken() throws Exception {
        marks = new Marks();

        NewDiaryDisplay.displayMarksPage();

        NewDiaryDisplay.displaySetFirstInternalsMarksMessage();
        marks.setFirstInternals(Double.parseDouble(bfr.readLine()));

        NewDiaryDisplay.displaySetSecondPeriodicalMarksMessage();
        marks.setSecondInternals(Double.parseDouble(bfr.readLine()));

        NewDiaryDisplay.displaySetEndSemesterExamMarksMessage();
        marks.setEndSem(Double.parseDouble(bfr.readLine()));

        NewDiaryDisplay.displaySetContinuousEvaluationMarksMessage();
        marks.setContinuousEvaluationMarks(Double.parseDouble(bfr.readLine()));

        NewDiaryDisplay.displaySetAttendanceMessage();
        marks.setAttendance(Double.parseDouble(bfr.readLine()));

        return marks;
    }

    public Marks setAllMarksToZero() {

        marks = new Marks();

        marks.setFirstInternals(0.0);
        marks.setSecondInternals(0.0);
        marks.setEndSem(0.0);
        marks.setContinuousEvaluationMarks(0.0);
        marks.setAttendance(0.0);

        return marks;
    }

    public Student setAllStudentDetails(Student student) throws Exception {
        NewDiaryDisplay.displayStudentDetailsPage();

        NewDiaryDisplay.displaySetNameMessage();
        student.setName(bfr.readLine());

        NewDiaryDisplay.displaySetRollNoMessage();
        student.setRollNumber(bfr.readLine());

        NewDiaryDisplay.displaySetBatchMessage();
        student.setBatch(bfr.readLine());

        NewDiaryDisplay.displaySetNumberOfCourses();
        numberOfCourses = Integer.parseInt(bfr.readLine().trim());

        while (numberOfCourses-- > 0) {
            student.addCourseToCourseList(setCourseToBeTaken());
        }

        return student;
    }

    public Student setAllStudentDetails() throws Exception {
        student = new Student();
        NewDiaryDisplay.displayStudentDetailsPage();

        NewDiaryDisplay.displaySetNameMessage();
        student.setName(bfr.readLine());

        NewDiaryDisplay.displaySetRollNoMessage();
        student.setRollNumber(bfr.readLine());

        NewDiaryDisplay.displaySetBatchMessage();
        student.setBatch(bfr.readLine());

        NewDiaryDisplay.displaySetNumberOfCourses();
        numberOfCourses = Integer.parseInt(bfr.readLine().trim());

        while (numberOfCourses-- > 0) {
            student.addCourseToCourseList(setCourseToBeTaken());
        }

        NewDiaryDisplay.displayNonAcademicsPage();
        setAllNonAcademicDetails();

        return student;
    }

    public void displayAllStudentDetails(Student student) {
        System.out.println(student.toString());
    }

    public Arrears setArrearDetails() throws Exception {
        arrears = new Arrears();

        NewDiaryDisplay.displayArrearsPage();

        NewDiaryDisplay.setNumberOfArrearsMessage();
        arrears.setNumberOfArrears(Integer.parseInt(bfr.readLine()));

        int numberOfArrears = arrears.getNumberOfArrears();

        NewDiaryDisplay.setArrearsSubjectMessage();

        while (numberOfArrears-- > 0) {
            arrears.setArrearSubjects(bfr.readLine());
        }

        return arrears;
    }

    public Internships setAllInternshipDetails() throws IOException {
        internships = new Internships();

        NewDiaryDisplay.displayInternshipPage();

        NewDiaryDisplay.setNumberOfInternshipsMessage();
        internships.setNumberOfInternships(Integer.parseInt(bfr.readLine()));

        int numberOfInternships = internships.getNumberOfInternships();

        NewDiaryDisplay.setNameOfInterningOrganizationMessage();
        while (numberOfInternships-- > 0) {
            internships.setListOfInternships(bfr.readLine());
        }

        return internships;
    }

    public Projects setAllProjecDetails() throws IOException {
        projects = new Projects();

        NewDiaryDisplay.displayProjectsPage();

        NewDiaryDisplay.setNumberOfProjectCompletedMessage();
        projects.setNumberOfProjects(Integer.parseInt(bfr.readLine()));

        int numberOfProjects = projects.getNumberOfProjects();

        NewDiaryDisplay.setProjectNameMessage();
        while (numberOfProjects-- > 0) {
            projects.setProjectNames(bfr.readLine());
        }
        return projects;
    }

    public Seminars setAllSeminarDetails() throws IOException {

        seminars = new Seminars();

        NewDiaryDisplay.displaySeminarsPage();

        NewDiaryDisplay.setNumberOfSeminarsAttededMessage();
        seminars.setNumberOfSeminarsAttended(Integer.parseInt(bfr.readLine()));

        NewDiaryDisplay.setNumberOfSeminarsTakenMessage();
        seminars.setNumberOfSeminarsTaken(Integer.parseInt(bfr.readLine()));

        return seminars;
    }

    public Sports setAllSportDetails() throws IOException {

        sports = new Sports();

        NewDiaryDisplay.displaySportsPage();

        NewDiaryDisplay.setNumberOfEventsParticiptedMessage();
        sports.setNumberOfEventsParticipated(Integer.parseInt(bfr.readLine()));

        int numberOfEventsParticipated = sports.getNumberOfEventsParticipated();

        NewDiaryDisplay.setEventNameMessage();
        while (numberOfEventsParticipated-- > 0) {
            sports.setEventNames(bfr.readLine());
        }

        NewDiaryDisplay.setNumberOfGoldMedalsWonMessage();
        sports.setNumberOfGoldMedalsWon(Integer.parseInt(bfr.readLine()));

        NewDiaryDisplay.setNumberOfSilverMedalsWonMessage();
        sports.setNumberOfSilverMedalsWon(Integer.parseInt(bfr.readLine()));

        NewDiaryDisplay.setNumberOfBronzeMedalsWonMessage();
        sports.setNumberOfBronzeMedalsWon(Integer.parseInt(bfr.readLine()));

        return sports;
    }

    public Suspensions setAllSuspensionDetails() throws IOException {
        suspensions = new Suspensions();

        NewDiaryDisplay.setSuspensionCountMessage();
        suspensions.setSuspensionCount(Integer.parseInt(bfr.readLine()));

        int suspensionCount = suspensions.getSuspensionCount();

        NewDiaryDisplay.setRearsonForSuspensionMessage();
        while (suspensionCount-- > 0) {
            suspensions.setReasonOfSuspensionList(bfr.readLine());
        }

        return suspensions;
    }

    public Volunteering setAllVolunteeringDetails() throws IOException {
        volunteering = new Volunteering();

        NewDiaryDisplay.displayVolunterringPage();
        
        NewDiaryDisplay.setNumberOfEventsVolunteeredMessage();
        volunteering.setNumberOfEventsVolunteered(Integer.parseInt(bfr.readLine()));

        int numberOfEventsVolunteered = volunteering.getNumberOfEventsVolunteered();

        NewDiaryDisplay.setNameOfEventVolunteeredMessage();
        while (numberOfEventsVolunteered-- > 0) {
            volunteering.setVolunteeredEvents(bfr.readLine());
        }
        return volunteering;
    }

    public Disciplinary setDisciplinaryDetails() throws Exception {
        disciplinary = new Disciplinary();
        NewDiaryDisplay.displayDisciplinaryPage();
        disciplinary.setArrears(setArrearDetails());
        disciplinary.setSuspensions(setAllSuspensionDetails());

        return disciplinary;
    }

    public NonAcademics setAllNonAcademicDetails() throws Exception {
        nonAcademics = new NonAcademics();

        nonAcademics.setDisciplinary(setDisciplinaryDetails());
        nonAcademics.setInternships(setAllInternshipDetails());
        nonAcademics.setProject(setAllProjecDetails());
        nonAcademics.setSeminar(setAllSeminarDetails());
        nonAcademics.setSports(setAllSportDetails());
        nonAcademics.setVolunteering(setAllVolunteeringDetails());

        return nonAcademics;
    }

}
