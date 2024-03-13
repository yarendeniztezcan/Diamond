import java.util.Scanner;

public class Hourglass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height:");
        int height = scanner.nextInt();

        hourglass(height);    }

    public static void hourglass(int height) {
        if (height % 2 == 0) {
            System.out.println("Invalid number!! Enter an odd number.");    }
        else {
            int space = 0;
            int star = height;

            for (int i = 0; i < height / 2 + 1; i++) {
                for (int j = 0; j < space; j++) {
                    System.out.print(" ");  }


                for (int j = 0; j < star; j++) {
                    System.out.print("*");  }

                System.out.println();
                space++;
                star -= 2; }

            space = height / 2 - 1;
            star = 3;

            for (int i = 0; i < height / 2; i++) {
                for (int j = 0; j < space; j++) {
                    System.out.print(" ");   }

                for (int j = 0; j < star; j++) {
                    System.out.print("*");  }

                System.out.println();
                space--;
                star += 2;    }

    } }   }
