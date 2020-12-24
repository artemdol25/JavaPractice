package tasks;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        int A;
        int B;

        Scanner scanner = new Scanner(System.in);

        A = scanner.nextInt();
        B = scanner.nextInt();

        recursion(A,B);
    }

    public static void recursion(int A, int B){
        if(A==B) {
            System.out.print(A);
            return;
        }

        if (A<B) {
            System.out.print(A+", ");
            recursion(A+1,B);
        }

        if(A>B) {
            System.out.print(A+", ");
            recursion(A-1,B);
        }
    }
}
