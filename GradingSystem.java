import java.util.Scanner;

public class GradingSystem {
  
    public static void main (String args[]){
        Scanner scanner = new Scanner (System.in);
        boolean cont = true;
        while(cont){
            System.out.println("Enter a grade:");
        
            
            String input = scanner.nextLine();
            if(input.equals("exit")){
                cont = false;
            }else{
        
        
                int grade = 0;
                try {
                
                    grade = Integer.parseInt(input);
                    if(grade<=100){
                        switch(grade/10){

                            case 10:
                            case 9:
                                    System.out.println("Your grade is A");
                                    break;
                            case 8:
                                    System.out.println("Your grade is B");
                                    break;
                            case 7:
                                    System.out.println("Your grade is C");
                                    break;
                            case 6:
                                    System.out.println("Your grade is D");
                                    break;
                            
                            case 5:
                                    System.out.println("Your grade is F");
                                    break;
                            default:
                                    System.out.println("Your grade is G");
            
                        }
                     }
                    else{
                        System.out.println("Invalid input! Please enter an integer grade between 0 and 100.");
                    }
                
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter an integer grade between 0 and 100.");
                
                }
         }
        
    }
    scanner.close();
    }
}
