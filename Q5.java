import java.util.Scanner;

class Q5 {
    // A) Write a menu driven java program using command
    // line arguments for the following:
    // 1. Addition 2. Subtraction 3. Multiplication 4. Division.class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the chose opration :");
        int opration = input.nextInt();
        System.out.println("Enter the value of A");
        int a;
        a = input.nextInt();
        System.out.println("Enter the value of B");
        int b;
        b = input.nextInt();
        switch (opration) {
            case 1:
                int Addtion = a + b;
                System.out.println("Addtion :-" + Addtion);
                break;
            case 2:
                int Multiplication = a * b;
                System.out.println("Multiplication :-" + Multiplication);
                break;
            case 3:
                int Subtraction = a - b;
                System.out.println("Subtraction :-" + Subtraction);
                break;
            case 4:
                int Division = a / b;
                System.out.println("Division :-" + Division);
                break;
        }
    }
}
