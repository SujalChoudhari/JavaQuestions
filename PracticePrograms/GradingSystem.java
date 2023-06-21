package PracticePrograms;

/**
 * Build a student grading System sing user defined Exception
 */

class PromotionException extends Exception {
    PromotionException(String message) {
        super(message);
    }
}

class Student {
    public String name;
    public int[] grades;
    public int average;

    Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
        
    }

    public void calculateAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        int average = sum / grades.length;
        this.average = average;
    
        System.out.println("Average grade: " + average);
    }

    public void checkPromotion() throws PromotionException {
        if (average < 40) {
            throw new PromotionException("You have failed");
        } else {
            System.out.println("You have passed");
        }
    }


}

public class GradingSystem {
    public static void main(String[] args) {
        // Demonstrate inheritance using HR system
        int[] grades = { 90, 20, 30, 40, 90 };
        Student student = new Student("John", grades);
        student.calculateAverageGrade();
        try {
            student.checkPromotion();
        } catch (PromotionException e) {
            System.out.println(e.getMessage());
        }
    }
}
