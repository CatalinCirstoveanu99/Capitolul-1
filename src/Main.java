import java.util.Scanner;

class Main {

    // exercise 5
    static void MyVariables() {
        int nr = 1;
        String text = "ceva";
        boolean flag = false;
    }

    // exercise 6
    static void ReadNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the first number: ");
        int first_nr = scanner.nextInt();
        System.out.print("\nEnter the second number: ");
        int second_nr = scanner.nextInt();
        System.out.println("\n" + first_nr + " " + second_nr + "\n");
    }

    // exercise 7

    public static void suma() {
        Scanner test_nr = new Scanner(System.in);
        System.out.print("\nType a number for exercise 7: ");
        int my_nr = test_nr.nextInt();
        System.out.println("\n");
        System.out.println((double) my_nr + 5);
        System.out.println((double) my_nr - 12.3);
        System.out.println((double) my_nr * -3.2);
        System.out.println((double) my_nr / 4);
        System.out.println((double) my_nr % 6);
        System.out.println("\n");
    }

    public static void main(String[] args) {

        MyVariables();// calling method for exercise 5

        ReadNumbers();// calling method for exercise 6

        suma();// calling method for exercise 7

        // exercise 2
        for (int i = 0; i <= 5; i++) {
            System.out.println("Cursul acesta este foarte fain!");
        }
        // exercise 4
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the sentence: ");
        String my_str = input.nextLine();
        System.out.println("\n" + my_str + "\n");

        // exercise 8
        int x = 2;
        int y = 12;

        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}