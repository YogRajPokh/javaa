import java.util.Scanner;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String username = "yog";
        String password = "98455";
        String user_name;
        System.out.println("Enter your username : ");
        user_name  = scanner.nextLine();
        String pass_word;
        System.out.println("Enter your password : ");
        pass_word = scanner.nextLine();
        int choice = 0;
        int loop = 100;
        if (user_name.equals(username) && pass_word.equals(password)){
            System.out.println("You have logged in");
            while (loop < 200){
                loop++;
                System.out.println("------------------------");
                System.out.println("1. Greater number between 3 number");
                System.out.println("2. Calculator");
                System.out.println("3. Result Calculator with 3 grades");
                System.out.println("4. Guessing Game");
                System.out.println("--------------------------------");
                System.out.println("Enter number to calculate following : ");
                choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        float num1;
                        float num2;
                        float num3;
                        System.out.println("Enter number 1, number2, number 3 : ");
                        num1 = scanner.nextFloat();
                        num2 = scanner.nextFloat();
                        num3 = scanner.nextFloat();
                        if (num1 > num2 && num1 > num3){
                            System.out.println("Number 1 is greater than number 2 and number 3");
                        }
                        else if(num2 > num1 && num2 > num3){
                            System.out.println("Number 2 is greater than number 1 and number 2");
                        }
                        else{
                            System.out.println("Number 3 is greater than number 1 and number 2");
                        }
                        break;
                    case 2 :
                        //
                        float firstNumber = 0;
                        System.out.print("Enter first number : ");
                        firstNumber = scanner.nextFloat();
                        float secondNumber = 0;
                        System.out.print("Enter second number : ");
                        secondNumber = scanner.nextFloat();
                        char operator = 0;
                        System.out.print("Enter operator for calculate : ");
                        operator = scanner.next().charAt(0);
                        double result = 0;
                        switch (operator){
                            case '+' :
                                result = firstNumber + secondNumber;
                                System.out.println("The sum of " + firstNumber + " "+ secondNumber + " is " + result);
                                break;
                            case '-' :
                                result = firstNumber - secondNumber;
                                System.out.println("The subtraction of " + firstNumber + " "+ secondNumber + " is " + result);
                                break;
                            case '*' :
                                result = firstNumber * secondNumber;
                                System.out.println("The product of " + firstNumber + " "+ secondNumber + " is " + result);
                                break;
                            case '/' :
                                result = firstNumber / secondNumber;
                                System.out.println("The division of " + firstNumber + " "+ secondNumber + " is " + result);
                                break;
                        }
                        break;
                    case 3:
                        float mathMark,scienceMark,englishMark;
                        float percentage;
                        System.out.println("Enter Mathmark, Sciencemark, Englishmark : ");
                        mathMark = scanner.nextFloat();
                        scienceMark = scanner.nextFloat();
                        englishMark = scanner.nextFloat();
                        percentage = ((mathMark+scienceMark+englishMark)/300) * 100;
                        if(percentage < 100){
                            if(percentage >= 90 && percentage <= 100){
                                System.out.println("You have got A+");
                            }
                            else if(percentage >= 80 && percentage < 90){
                                System.out.println("You have got A");
                            }
                            else if(percentage >= 70 && percentage < 80){
                                System.out.println("You have got B+");
                            }
                            else if(percentage >= 60 && percentage < 70){
                                System.out.println("You have got B");
                            }
                            else if(percentage >= 50 && percentage < 60){
                                System.out.println("You have got C+");
                            }
                            else if(percentage >= 40 && percentage < 50){
                                System.out.println("You have got C");
                            }
                            else{
                                System.out.println("You have fail the exam !!!");
                            }
                        }
                        else {
                            System.out.println("Invalid marks given");
                        }
                        break;
                    case 4:
                        int rand_int1 = random.nextInt(10);
                        int inputNumber = 0;
                        System.out.println("Enter number from 0 to 10 : ");
                        inputNumber = scanner.nextInt();
                        if (inputNumber == rand_int1){
                            System.out.println("You have won this game by guessing numbers");
                        }
                        else{
                            System.out.println("Sorry try again later !!!");
                        }
                }
            }
        }
        else {
            System.out.println("Invalid login and password");
        }
    }
}

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String username = "yog";
        String password = "98455";
        String user_name;
        System.out.println("Enter your username : ");
        user_name  = scanner.nextLine();
        String pass_word;
        System.out.println("Enter your password : ");
        pass_word = scanner.nextLine();
        int choice = 0;
        int loop = 100;
        if (user_name.equals(username) && pass_word.equals(password)){
            System.out.println("You have logged in");
            while (loop < 200){
                loop++;
                System.out.println("------------------------");
                System.out.println("1. Greater number between 3 number");
                System.out.println("2. Calculator");
                System.out.println("3. Result Calculator with 3 grades");
                System.out.println("4. Guessing Game");
                System.out.println("--------------------------------");
                System.out.println("Enter number to calculate following : ");
                choice = scanner.nextInt();
                switch (choice){
                    import java.util.Scanner;

                    public class GreatestNumberWithIfElse {
                        public static void main(String[] args) {
                            Scanner scanner = new Scanner(System.in);

                            System.out.println("Enter three numbers: ");
                            double num1 = scanner.nextDouble();
                            double num2 = scanner.nextDouble();
                            double num3 = scanner.nextDouble();

                            double greatest = num1;

                            if (num2 > greatest) {
                                greatest = num2;
                            }
                            if (num3 > greatest) {
                                greatest = num3;
                            }

                            System.out.println("The greatest number is: " + greatest);
                        }
                    }
                    import java.util.Scanner;

                    public class GreatestNumberWithTernaryOperator {
                        public static void main(String[] args) {
                            Scanner scanner = new Scanner(System.in);

                            System.out.println("Enter three numbers: ");
                            double num1 = scanner.nextDouble();
                            double num2 = scanner.nextDouble();
                            double num3 = scanner.nextDouble();

                            double greatest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);

                            System.out.println("The greatest number is: " + greatest);
                        }
                    }
                    import java.util.Scanner;

                    public class CalculatorWithSwitch {
                        public static void main(String[] args) {
                            Scanner scanner = new Scanner(System.in);

                            System.out.println("Enter two numbers: ");
                            double num1 = scanner.nextDouble();
                            double num2 = scanner.nextDouble();

                            System.out.println("Select an operation (+, -, *, /): ");
                            char operator = scanner.next().charAt(0);

                            double result = 0;

                            switch (operator) {
                                case '+':
                                    result = num1 + num2;
                                    break;
                                case '-':
                                    result = num1 - num2;
                                    break;
                                case '*':
                                    result = num1 * num2;
                                    break;
                                case '/':
                                    if (num2 != 0) {
                                        result = num1 / num2;
                                    } else {
                                        System.out.println("Cannot divide by zero.");
                                        return;
                                    }
                                    break;
                                default:
                                    System.out.println("Invalid operator.");
                                    return;
                            }

                            System.out.println("Result: " + result);
                        }
                    }
                    import java.util.Scanner;

                    public class CalculatorWithIfElse {
                        public static void main(String[] args) {
                            Scanner scanner = new Scanner(System.in);

                            System.out.println("Enter two numbers: ");
                            double num1 = scanner.nextDouble();
                            double num2 = scanner.nextDouble();

                            System.out.println("Select an operation (+, -, *, /): ");
                            char operator = scanner.next().charAt(0);

                            double result = 0;

                            if (operator == '+') {
                                result = num1 + num2;
                            } else if (operator == '-') {
                                result = num1 - num2;
                            } else if (operator == '*') {
                                result = num1 * num2;
                            } else if (operator == '/') {
                                if (num2 != 0) {
                                    result = num1 / num2;
                                } else {
                                    System.out.println("Cannot divide by zero.");
                                    return;
                                }
                            } else {
                                System.out.println("Invalid operator.");
                                return;
                            }

                            System.out.println("Result: " + result);
                        }
                    }
                    import java.util.Scanner;

                    public class GradeCalculatorWithIfElse {
                        public static void main(String[] args) {
                            Scanner scanner = new Scanner(System.in);

                            System.out.println("Enter Math grade: ");
                            float mathGrade = scanner.nextFloat();

                            System.out.println("Enter Science grade: ");
                            float scienceGrade = scanner.nextFloat();

                            System.out.println("Enter English grade: ");
                            float englishGrade = scanner.nextFloat();

                            float average = (mathGrade + scienceGrade + englishGrade) / 3;
                            char finalGrade;

                            if (average >= 90) {
                                finalGrade = 'A';
                            } else if (average >= 80) {
                                finalGrade = 'B';
                            } else if (average >= 70) {
                                finalGrade = 'C';
                            } else if (average >= 60) {
                                finalGrade = 'D';
                            } else {
                                finalGrade = 'F';
                            }

                            System.out.println("Your final grade is: " + finalGrade);
                        }
                    }
                    import java.util.Scanner;

                    public class GradeCalculatorWithIfElse {
                        public static void main(String[] args) {
                            Scanner scanner = new Scanner(System.in);

                            System.out.println("Enter Math grade: ");
                            float mathGrade = scanner.nextFloat();

                            System.out.println("Enter Science grade: ");
                            float scienceGrade = scanner.nextFloat();

                            System.out.println("Enter English grade: ");
                            float englishGrade = scanner.nextFloat();

                            float average = (mathGrade + scienceGrade + englishGrade) / 3;
                            char finalGrade;

                            if (average >= 90) {
                                finalGrade = 'A';
                            } else if (average >= 80) {
                                finalGrade = 'B';
                            } else if (average >= 70) {
                                finalGrade = 'C';
                            } else if (average >= 60) {
                                finalGrade = 'D';
                            } else {
                                finalGrade = 'F';
                            }

                            System.out.println("Your final grade is: " + finalGrade);
                        }
                    }
                    import java.util.Random;
import java.util.Scanner;

                    public class GuessingGameWithWhileLoop {
                        public static void main(String[] args) {
                            Scanner scanner = new Scanner(System.in);
                            Random random = new Random();

                            int lowerBound = 1;
                            int upperBound = 100;
                            int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
                            int attempts = 0;

                            System.out.println("Welcome to the Guessing Game!");
                            System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound);

                            while (true) {
                                System.out.print("Enter your guess: ");
                                int guess = scanner.nextInt();
                                attempts++;

                                if (guess == randomNumber) {
                                    System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + attempts + " attempts.");
                                    break;
                                } else if (guess < randomNumber) {
                                    System.out.println("Try a higher number.");
                                } else {
                                    System.out.println("Try a lower number.");
                                }
                            }
                        }
                    }
                    import java.util.Random;
import java.util.Scanner;

                    public class GuessingGameWithForLoop {
                        public static void main(String[] args) {
                            Scanner scanner = new Scanner(System.in);
                            Random random = new Random();

                            int lowerBound = 1;
                            int upperBound = 100;
                            int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
                            int maxAttempts = 10; // Maximum number of attempts allowed
                            int attempts = 0;

                            System.out.println("Welcome to the Guessing Game!");
                            System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound);

                            for (attempts = 1; attempts <= maxAttempts; attempts++) {
                                System.out.print("Attempt " + attempts + ": Enter your guess: ");
                                int guess = scanner.nextInt();

                                if (guess == randomNumber) {
                                    System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + attempts + " attempts.");
                                    break;
                                } else if (guess < randomNumber) {
                                    System.out.println("Try a higher number.");
                                } else {
                                    System.out.println("Try a lower number.");
                                }
                            }

                            if (attempts > maxAttempts) {
                                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + randomNumber + ".");
                            }
                        }
                    }




                }