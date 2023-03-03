import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your grade: ");
            String input = scanner.nextLine();
        
            if (input.equals("exit")) {
                break;
            }
        
            int num;
            try {
                num = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer grade between 0 and 100.");
                continue;
            }
        
            if (num < 0 || num > 100) {
                System.out.println("Invalid input! Please enter an integer grade between 0 and 100.");
                continue;
            }
        
            if (num >= 95 && num <= 100) {
                System.out.println("Your grade is: A");
            } else if (num >= 85 && num <= 90) {
                System.out.println("Your grade is: B");
            } else if (num >= 75 && num <= 80) {
                System.out.println("Your grade is: C");
            } else if (num >= 65 && num <= 70) {
                System.out.println("Your grade is: D");
            } else {
                System.out.println("Your grade is: F");
            }
        }
        scanner.close(); 
    }
}