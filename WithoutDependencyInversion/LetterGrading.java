class LetterGrading {
    String calculateGrade(int score) {
        if (score >= 90) return "Excellent";
        else if (score >= 80) return "Very Good";
        else if (score >= 70) return "Good";
        else return "Poor";
    }
}