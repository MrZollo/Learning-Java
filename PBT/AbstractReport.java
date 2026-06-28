abstract class AbstractReport {
    abstract void calculateTotalMarks();
    abstract void calculateAverageMarks();
    abstract void determineGrade();
}

class MarksException extends Exception {
    public MarksException(String message) {
        super(message);
    }
}
