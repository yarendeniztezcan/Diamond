import java.util.Scanner;

public class Xmas_Tree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int scanner = scan.nextInt();

        if (scanner % 2 == 0) {
            System.out.println("Invalid Input! Please enter an odd number.");}
        else {
            for (int i = 0; i < scanner; i++) {
                for (int j = i; j < scanner - 1; j++) {
                    System.out.print(" "); }

                for (int k = 0; k < 2 * i + 1; k++) {
                    System.out.print("*");}
                
                System.out.println();     }

            int trunkWidth = scanner / 3;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < scanner - trunkWidth; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < trunkWidth; k++) {
                    System.out.print("|");
                }
                System.out.println();
            }
        }
    }
}
