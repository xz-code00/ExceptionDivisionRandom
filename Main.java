/*
Scrivi un programma che inserito un numero intero da tastiera stampi a video il
risultato della divisione di tale numero per un altro numero generato casualmente,
compreso fra 0 e 3, intercettando l'eventuale eccezione della divisione per 0.
 */
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(divisione());
        }
        catch (DivisionByZero e) {
            System.out.println("Error: " + e);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        }
        finally {
            System.out.println("La sala giochi sta chiudendo.");
        }
    }

    public static int getN() {
        System.out.print("Enter Input: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();

        return a;
    }

    public static int random() {
        Random generator = new Random();
        int n = generator.nextInt(4);
        return n;
    }

    public static int divisione() throws DivisionByZero {
        int num = getN();
        int randomNum = random();
        System.out.println("Random num is " + randomNum);
        if (randomNum == 0)
            throw new DivisionByZero();
        else
            return num / randomNum;
    }
}