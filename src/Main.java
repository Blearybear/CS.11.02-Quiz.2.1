import java.util.Scanner;
/* I have neither given nor received any unauthorised aid on this piece of work*/

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two integers (one integer in one line): ");
        int resultOne = add(scanner.nextInt(), scanner.nextInt());
        System.out.println(resultOne);
        scanner.nextLine();

        System.out.println("Enter your name: ");
        String resultTwo = greeting(scanner.nextLine());
        System.out.println(resultTwo);

        System.out.println("Enter four integers (one integer in one line): ");
        int resultThree = add(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(resultThree);
        scanner.nextLine();

        System.out.println("Enter something you want printed: ");
        printMe(scanner.nextLine());
    }
    public static int add(int numOne, int numTwo){
        return numOne + numTwo;
    }

    public static String greeting(String name){
        return "Bonjour, " + name + "!";
    }

    public static int add(int numOne, int numTwo, int numThree, int numFour){
        return add(numOne, add(numTwo, add(numThree, numFour)));
    }

    public static void printMe(String toBePrinted){
        System.out.println(toBePrinted);
    }

}
