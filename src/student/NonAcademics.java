package student;

import java.io.Serializable;

public class NonAcademics implements Serializable {

    private Sports sports;
    private Volunteering volunteering;
    private Seminars seminar;
    private Projects project;
    private Internships internships;
    private Arrears arrears;
    private Suspensions suspensions;

    public Arrears getArrears() {
        return arrears;
    }

    public void setArrears(Arrears arrears) {
        this.arrears = arrears;
    }

    public Suspensions getSuspensions() {
        return suspensions;
    }

    public void setSuspensions(Suspensions suspensions) {
        this.suspensions = suspensions;
    }

    public Sports getSports() {
        return sports;
    }

    public void setSports(Sports sports) {
        this.sports = sports;
    }

    public Volunteering getVolunteering() {
        return volunteering;
    }

    public void setVolunteering(Volunteering volunteering) {
        this.volunteering = volunteering;
    }

    public Seminars getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminars seminar) {
        this.seminar = seminar;
    }

    public Projects getProject() {
        return project;
    }

    public void setProject(Projects project) {
        this.project = project;
    }

    public Internships getInternships() {
        return internships;
    }

    public void setInternships(Internships internships) {
        this.internships = internships;
    }


}
