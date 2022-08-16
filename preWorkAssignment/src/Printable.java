public class Printable {
    static String separatingLine = "=".repeat(30) + " *".repeat(20) +" "+ "=".repeat(30);
    static String option1 = "Check for palindrome number.",
                  option2 = "Prints the pattern of stars.",
                  option3 = "Check for prime number.",
                  option4 = "Print Fibonacci series of size n.",
                  optionS1 = "Left-Aligned.",
                  optionS2 = "Center-Aligned.",
                  optionS3 = "Right-Aligned.";
    public static void startingInstruction(){
        System.out.println(separatingLine);
        System.out.println("Hello and welcome to this amazing interface where you will be able to the following:\n\t" +
                "1.\tChecking if a number that you enter is palindrome or not.\n\t" +
                "2.\tPrints the pattern of stars in decreasing order based on the input.\n\t" +
                "3.\tCheck whether the input number is a prime number.\n\t" +
                "4.\tPrint Fibonacci series of size n.\n\t" +
                "5.\tPrint this task list.\n\t" +
                "6.\tExit.");
        System.out.println(separatingLine);
        System.out.println("** users instructions: To perform any aforementioned task please use \"serial number\"\n\t\t" +
                "(e.g. to use option number 4 please press \"4\")");
        System.out.println(separatingLine);
    }
    public static void selectingInstruction(){
        System.out.println("Please enter the serial number of the task that you want to perform");
        System.out.print("your choice : ");
    }
    public static void inputInstruction(){
        System.out.print("Please enter the number of your choice : ");
    }
    public static void printChoice(int choice){
        String s = "You want to perform ";
        switch (choice){
            case 1:
                System.out.println(s+option1);
                break;
            case 2:
                System.out.println(s+option2);
                break;
            case 3:
                System.out.println(s+option3);
                break;
            case 4:
                System.out.println(s+option4);
                break;
            case 5:
                break;
            case 6:
                System.out.println("Exiting the program............");
                break;
            default:
                System.out.println("You have entered a wrong option. please try again.........");
                break;
        }
    }
    public static void starAlignmentInstruction(){
        System.out.println(separatingLine);
        System.out.println("You can print the stars in three ways:\n\t" +
                "1.\tLeft-Aligned.\n\t" +
                "2.\tCenter-Aligned\n\t" +
                "3.\tRight-Aligned");
        selectingInstruction();
    }
    public static void starAlignmentChoice(int choice){
        String s = "You want to print with ";
        switch (choice){
            case 1:
                System.out.println(s+optionS1);
                break;
            case 2:
                System.out.println(s+optionS2);
                break;
            case 3:
                System.out.println(s+optionS3);
                break;
            default:
                System.out.println("You have entered a wrong option. please try again.........");
                break;
        }
    }
}
