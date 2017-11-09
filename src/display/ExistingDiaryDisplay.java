package display;

public class ExistingDiaryDisplay {

    public static void noDiariesToDisplay() {
        System.err.println("********************Sorry, there are no diaries to display********************");
    }

    public static void selectStudentRollNumber(){
        System.out.println("************************ SELECT THE ROLL NUMBER ************************");
    }

    public static void displayModificationPage(){
        System.out.println("************************* MODIFICATION PAGE *************************");
    }


    public static void displayDeleteStudentMessage(){
        System.out.println("Enter the index of the student that you want to delete");
    }

}
