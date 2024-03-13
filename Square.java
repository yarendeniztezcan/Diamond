import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int scanner = scan.nextInt();

        for (int i = 0; i <scanner; i++) {
            for (int j = 0; j <scanner; j++) {
                System.out.print("*");}

            System.out.println(); }
            
    }}