import java.security.SecureRandom;
//import java.util.Random;
import java.util.Scanner;

public class carrier_p1 {

    public static int method(int num1, int num2, int problemType){
       Scanner scnr = new Scanner(System.in);
       SecureRandom rand = new SecureRandom(); int i=0;

       double userAns = 0.0;
       double rightAns = 0.0;
       int numberRight = 0;

       switch (problemType){
            case 1: //addition
                System.out.println(num1 + " + " + num2 + " = ");
                userAns = scnr.nextInt();
                rightAns = num1 + num2;
                if (userAns == rightAns){
                    numberRight++;
                }
                break;
            case 2: //subtraction
                System.out.println(num1 + " - " + num2 + " = ");
                userAns = scnr.nextInt();
                rightAns = num1 - num2;
                if (userAns == rightAns){
                    numberRight++;
                }
                break;
            case 3: //multiplication
                System.out.println(num1 + " * " + num2 + " = ");
                userAns = scnr.nextInt();
                rightAns = num1 * num2;
                if (userAns == rightAns){
                    numberRight++;
                }
                break;
            case 4: //division
                System.out.println(num1 + " / " + num2 + " = ");
                userAns = scnr.nextInt();
                rightAns = num1 / num2;
                if (userAns == rightAns){
                    numberRight++;
                }
                break;
            case 5:
                int newProblemType;
                newProblemType = rand.nextInt(3)+1;
                switch (newProblemType){
                    case 1: //addition
                        System.out.println(num1 + " + " + num2 + " = ");
                        userAns = scnr.nextInt();
                        rightAns = num1 + num2;
                        if (userAns == rightAns){
                            numberRight++;
                        }
                        break;
                    case 2: //subtraction
                        System.out.println(num1 + " - " + num2 + " = ");
                        userAns = scnr.nextInt();
                        rightAns = num1 - num2;
                        if (userAns == rightAns){
                            numberRight++;
                        }
                        break;
                    case 3: //multiplication
                        System.out.println(num1 + " * " + num2 + " = ");
                        userAns = scnr.nextInt();
                        rightAns = num1 * num2;
                        if (userAns == rightAns){
                            numberRight++;
                        }
                        break;
                    case 4: //division
                        System.out.println(num1 + " / " + num2 + " = ");
                        userAns = scnr.nextInt();
                        rightAns = num1 / num2;
                        if (userAns == rightAns){
                            numberRight++;
                        }
                        break;
                }
                break;
        }
        return numberRight;
    }


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();

        String userChoice = "y";
        while (!userChoice.equals("n")) {
            System.out.println("Welcome to the World of Math!!");

            System.out.println("Please select a difficulty level, 1-4");     //SELECTING DIFFICULTY
            System.out.println("\t1 - Single Digits\n\t2 - Double Digits\n\t3 - Triple Digits\n\t4 - Four Digits");
            int difficulty = scnr.nextInt();
            int num1=0, num2 = 0;

            System.out.println("Now, please select a problem type:");  //SELECTING PROBLEM TYPE
            System.out.println("\t1 - Addition\n\t2 - Subtraction \n\t3 - Multiplication \n\t4 - Division \n\t5 - Random Mixture");
            int problemType = scnr.nextInt();
            int numberRight=0;

            int i=0;
            while(i<10){
                if (difficulty == 1) {
                    num1 = rand.nextInt(9) + 1;
                    num2 = rand.nextInt(9) + 1;
                }
                if (difficulty == 2) {
                    num1 = rand.nextInt(89) + 10;
                    num2 = rand.nextInt(89) + 10;
                }
                if (difficulty == 3) {
                    num1 = rand.nextInt(899) + 100;
                    num2 = rand.nextInt(899) + 100;
                }
                if (difficulty == 4) {
                    num1 = rand.nextInt(8999) + 1000;
                    num2 = rand.nextInt(8999) + 1000;
                }
                int methodOutput = method(num1, num2, problemType);
                numberRight += methodOutput;

                if (methodOutput == 1){
                   int responseNum = rand.nextInt(3)+1;
                   switch (responseNum){
                       case 1:
                           System.out.println("Very good!");
                           break;
                       case 2:
                            System.out.println("Excellent!");
                            break;
                       case 3:
                           System.out.println("Nice work!");
                           break;
                       case 4:
                           System.out.println("Keep up the good work!");
                           break;
                   }
                }
                else {
                    int responseNum = rand.nextInt(3)+1;
                    switch (responseNum){
                        case 1:
                            System.out.println("No. Please try again.");
                            break;
                        case 2:
                            System.out.println("Wrong. Try once more.");
                            break;
                        case 3:
                            System.out.println("Don’t give up!");
                            break;
                        case 4:
                            System.out.println("No. Keep trying.");
                            break;
                    }
                }
            i++;
            }

            double percentRight = (numberRight/10.0)*100;
            System.out.println("Percent correct: " + percentRight + "%");

            if (percentRight >= 75){
                System.out.println("Congratulations, you are ready to go to the next level");
                System.out.println("If you would like to exit instead, enter\"n\"");
                userChoice = scnr.next();

            }
            else{
                System.out.println("Please ask your teacher for extra help");
                System.out.println("please press \"n\" to exit");
                userChoice = scnr.next();
            }

        }
    }//end main
}//end of class