import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int choice;
        int option;
        do{
            Printable.startingInstruction();
            Printable.selectingInstruction();
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            Printable.printChoice(choice);
            if(choice <= 4 && choice > 0) Printable.inputInstruction();
            switch (choice){
                case 1:
                    long num = sc.nextLong();
                    MathFunctions.isPalindrome(num);
                    break;
                case 2:
                    int number = sc.nextInt();
                    do{
                        Printable.starAlignmentInstruction();
                        option = sc.nextInt();
                        Printable.starAlignmentChoice(option);
                        if(option >= 1 && option <= 3) PrintStarPattern.printStar(number, option);
                        else Printable.printChoice(choice);
                    }while (option < 1 || option > 3);
                    break;
                case 3:
                    long l = sc.nextLong();
                    MathFunctions.isPrime(l);
                    break;
                case 4:
                    int n = sc.nextInt();
                    MathFunctions.printFibonacciSeries(n);
                    break;
                case 5:
                    Printable.startingInstruction();
                    break;
                default:
                    break;
            }
        }while(choice != 6);
    }
}
