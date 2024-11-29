package DependencyInversion.WithoutDependencyInversion;
class Teacher {
    PercentageGrading percentageGrading = new PercentageGrading(); // Hardcoded dependency
    LetterGrading letterGrading = new LetterGrading(); // Hardcoded dependency

    void givePercentageGrade(int score) {
        System.out.println("The percentage grade is: " + percentageGrading.calculateGrade(score));
    }

    void giveLetterGrade(int score) {
        System.out.println("The letter grade is: " + letterGrading.calculateGrade(score));
    }
}