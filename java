public class StudentRecord {
    public static void main(String[] args) {
        // Real-world student data
        byte studentClass = 12;                    // Class (1-12)
        short studentRollNo = 456;                 // Roll number (1-9999)
        int totalMarks = 875;                      // Total marks out of 1000
        long studentId = 202500123456789L;         // Unique 12-digit student ID
        
        float physicsMarks = 89.5f;                // Physics score
        double averagePercentage = 87.50;          // Overall percentage (precise)
        
        char grade = 'A';                          // Final grade
        boolean passedExam = true;                 // Exam result
        
        // Display student record
        System.out.println("=== Student Academic Record ===");
        System.out.println("Class: " + studentClass + "th");
        System.out.println("Roll No: " + studentRollNo);
        System.out.println("Student ID: " + studentId);
        System.out.println("Total Marks: " + totalMarks + "/1000");
        System.out.println("Physics: " + physicsMarks);
        System.out.println("Average: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + passedExam);
        
        // Practical calculation
        double finalScore = (totalMarks / 10.0);
        System.out.println("\nFinal Percentage: " + finalScore + "%");
        
        // Grade check logic
        if (averagePercentage >= 90) grade = 'A+';
        else if (averagePercentage >= 80) grade = 'A';
        else if (averagePercentage >= 70) grade = 'B';
        System.out.println("Updated Grade: " + grade);
    }
}
