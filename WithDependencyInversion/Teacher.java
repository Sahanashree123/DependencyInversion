package WithDependencyInversion;

class Teacher {
    GradingSystem gradingSystem;

    // Constructor injection for dependency
    Teacher(GradingSystem gradingSystem) {
        this.gradingSystem = gradingSystem;
    }

    void giveGrade(int score) {
        System.out.println("The grade is: " + gradingSystem.calculateGrade(score));
    }
}