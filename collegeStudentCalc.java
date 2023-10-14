import java.util.*;

public class collegeStudentCalc {
    
    public static void StudentGradeCalculator(ArrayList<Integer> marks) {

        int sum = 0;

        for(int i=0;i<marks.size();i++) {
            sum+=marks.get(i);
        }

        System.out.println("Total marks obtained: " + sum);
        double percentage = sum == 0 ? 0 : (double)sum/marks.size();
        System.out.println("Total Average percentage obtained: " + percentage);

        if(percentage >= 0 && percentage < 30) {
            System.out.println("Grade:D");
        } else if(percentage >= 30 && percentage <40) {
            System.out.println("Grade:C");
        } else if(percentage >= 40 && percentage < 50) {
            System.out.println("Grade:C+");
        } else if(percentage >= 50 && percentage < 60) {
            System.out.println("Grade::B");
        } else if(percentage >= 60 && percentage < 70) {
            System.out.println("Grade:B+");
        } else if (percentage >= 70 && percentage < 80) {
            System.out.println("Grade:A");
        } else if(percentage >= 80 && percentage < 90) {
            System.out.println("Grade:A+");
        } else if(percentage >= 90 && percentage <= 100) {
            System.out.println("Grade:A++");
        } else {
            System.out.println("Invalid percentage");
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Write total number of subjects: ");
        int totSub = sc.nextInt();
        System.out.println();

        ArrayList<Integer> marks = new ArrayList<>();

        for(int i=0;i<totSub;i++) {
            
            System.out.print("Marks obtained in subject " +(i+1) + ": ");
            int mark = sc.nextInt();
            marks.add(mark);

            if(mark > 100 || mark < 0) {
                System.out.println("Invalid Number Input: \n input again:");
                marks.remove(i);
                i--;
            }
        }
        StudentGradeCalculator(marks);

        System.out.println();System.out.println();

        System.out.println("-----------------Grading---------------");
        System.out.println();
        System.out.println("    percentage       Grade");
        System.out.println();
        System.out.println("      0 - 29    :     D");
        System.out.println("      30 - 39   :     C");
        System.out.println("      40 - 49   :     C+");
        System.out.println("      50 - 59   :     B");
        System.out.println("      60 - 69   :     B+");
        System.out.println("      70 - 79   :     A");
        System.out.println("      80 - 89   :     A+");
        System.out.println("      90 - 100  :     A++");
    }
}
