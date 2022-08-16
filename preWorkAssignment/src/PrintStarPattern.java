public class PrintStarPattern {
    public static void printStar(int num, int option){
        for (int i=0; i<num; i++){
            if (option == 2) System.out.print(" ".repeat(i));
            else if (option == 3) System.out.print(" ".repeat(i+i));
            System.out.print(" *".repeat(num-i));
            System.out.println();
        }
    }
}
