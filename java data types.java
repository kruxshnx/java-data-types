public class StudentRecord {
    public static void main(String[] args) {
        byte studentclass = 12;          
        short studentrollno = 456;                 
        int totalmarks = 875;                   
        long studentId = 202500123456789L;        
        float physicsmarks = 89.5f;         
        double averagepercentage = 87.50;         
        char grade = 'A';                       
        boolean passedexam = true;                 
        System.out.println("Class:" + studentclass);
        System.out.println("Roll No:" + studentrollno);
        System.out.println("Student ID:" + studentId);
        System.out.println("Total Marks:" + totalmarks + "/1000");
        System.out.println("Physics:" + physicsmarks);
        System.out.println("Average:" + averagepercentage + "%");
        System.out.println("Grade:" + grade);
        System.out.println("Passed:" + passedexam);
        double finalScore = (totalmarks / 10.0);
        System.out.println("\nFinal Percentage:" + finalScore + "%");
        if (averagepercentage >= 90) grade = 'S';
        else if (averagepercentage >= 80) grade = 'A';
        else if (averagepercentage >= 70) grade = 'B';
        System.out.println("Final Grade: " + grade);
    }
}
