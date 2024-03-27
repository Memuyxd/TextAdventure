import java.util.Scanner;

public class GameLogic {
    static Scanner scanner = new Scanner(System.in);


        //clear lines
        public static void clearConsole(){
            for(int i = 0; i <100; i++);
            System.out.println();
        }
        //separators
        public static void printSeperator(int n){
            for(int i = 0; i < n; i++);
            System.out.println("-");
            System.out.println();
        }
        //heading
        public static void printHeading(String title){
        printSeperator(30);
            System.out.println(title);
            printSeperator(30);
        }
    public static void AnythingToContinue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter anything to continue...");
        scanner.next();
    }

    }
