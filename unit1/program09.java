//Write a java program to find out students result/grade using IF condition.
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A+");
            System.out.println("Result: Pass");
        } 
        if (marks >= 80 && marks < 90) {
            System.out.println("Grade: A");
            System.out.println("Result: Pass");
        } 
        if (marks >= 70 && marks < 80) {
            System.out.println("Grade: B");
            System.out.println("Result: Pass");
        } 
        if (marks >= 60 && marks < 70) {
            System.out.println("Grade: C");
            System.out.println("Result: Pass");
        } 
        if (marks >= 40 && marks < 60) {
            System.out.println("Grade: D");
            System.out.println("Result: Pass");
        } 
        if (marks < 40 && marks >= 0) {
            System.out.println("Grade: F");
            System.out.println("Result: Fail");
        } 
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks!");
        }

        sc.close();
    }
}