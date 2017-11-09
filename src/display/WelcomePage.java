package display;

public class WelcomePage {

    public static void sayHello(){
        System.out.println("********************Welcome to Student Diary********************");
    }

    public static void selectDiaryTypeMessage(){
        System.out.println("\n---------------------> Select a suitable task <---------------------\n");
        System.out.println("******************** CREATE NEW STUDENT DIARY [1] ********************");
        System.out.println("**********************************************************************");
        System.out.println("**********************************************************************");
        System.out.println("******************** MODIFY AN EXISTING DIARY [2] ********************");
        System.out.println("**********************************************************************");
        System.out.println("**********************************************************************");
        System.out.println("**********************  VIEW STUDENT LIST [3]  ***********************");
        System.out.println("**********************************************************************");
        System.out.println("**********************************************************************");
        System.out.println("********************  DELETE EXISTING STUDENT [4] ********************");
    }
}
