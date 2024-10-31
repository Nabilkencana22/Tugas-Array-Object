package Inventory;

import java.util.Scanner;

public class Tester2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("CD (1) / DVD (2)");
        int pilihan = in.nextInt();

        in.nextLine(); // Reset Scanner
        System.out.println("Name : ");
        String name = in.next();
        System.out.println("Number : ");
        int number = in.nextInt();
        System.out.println("Quantity : ");
        int quantity = in.nextInt();
        System.out.println("Price : ");
        double price = in.nextDouble();
        in.nextLine();

        if (pilihan == 1) {
            System.out.println("Artist : ");
            String artist = in.next();
            System.out.println("Label : ");
            String label = in.next();
            System.out.println("Total Song : ");
            int numsong = in.nextInt();
            CD c1 = new CD();
            c1.print();
        } else if (pilihan == 2) {
            System.out.println("Rating : ");
            String rating = in.next();
            System.out.println("Studio : ");
            String studio = in.next();
            System.out.println("Lenght : ");
            int lenght = in.nextInt();
        } else {
            System.out.println("input salah");
        }
    }
}
