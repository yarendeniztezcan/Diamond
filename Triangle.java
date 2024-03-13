import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int scanner = scan.nextInt();

for (int i = 0; i  <scanner; i++) {
    for (int j = scanner ; j  >  i; j--) {
        System.out.print(" "); }
    for (int k = 0; k  <= i; k++) {
        System.out.print("* ");
    }
    System.out.println();
}
}
}