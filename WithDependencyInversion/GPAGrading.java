package WithDependencyInversion;

class GPAGrading implements GradingSystem {
    public String calculateGrade(int score) {
        if (score >= 90) return "4.0";
        else if (score >= 80) return "3.5";
        else if (score >= 70) return "3.0";
        else return "2.0";
    }
}