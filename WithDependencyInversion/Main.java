package WithDependencyInversion;

public class Main {
    public static void main(String[] args) {
        
        GradingSystem percentageGrading = new PercentageGrading();
        Teacher teacher1 = new Teacher(percentageGrading);
        teacher1.giveGrade(85); 

        
        GradingSystem letterGrading = new LetterGrading();
        Teacher teacher2 = new Teacher(letterGrading);
        teacher2.giveGrade(85); 

        /*GradingSystem gpaGrading = new GPAGrading();
        Teacher teacher = new Teacher(gpaGrading);
        teacher.giveGrade(85); // Output: The grade is: 3.5*/
    }
}