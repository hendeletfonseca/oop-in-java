package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

// basic exercise done to see the difference in resolution with 2 different paradigms
    public class FirstExerciseTriangle {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        boolean oop = true; // change to execute with Triangle class

        if (!oop) {

            double xA, xB, xC, yA, yB, yC;

            System.out.println("Enter the measures of triangle x:");
            xA = sc.nextDouble();
            xB = sc.nextDouble();
            xC = sc.nextDouble();
            System.out.println("Enter measures of triangle y:");
            yA = sc.nextDouble();
            yB = sc.nextDouble();
            yC = sc.nextDouble();

            double p = (xA + xB + xC) / 2.0;
            double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

            p = (yA + yB + yC) / 2.0;
            double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

            System.out.println("Triangle X area: " + areaX);
            System.out.println(("Triangle Y area:" + areaY));

            if (areaY > areaX) System.out.println("Larger area: Y");
            else System.out.println("Larger area: X");

        }
        else {
            Triangle x = new Triangle();
            Triangle y = new Triangle();

            System.out.println("Enter the measures of triangle x:");
            x.a = sc.nextDouble();
            x.b = sc.nextDouble();
            x.c = sc.nextDouble();
            System.out.println("Enter measures of triangle y:");
            y.a = sc.nextDouble();
            y.b = sc.nextDouble();
            y.c = sc.nextDouble();

            System.out.println("Triangle X area: " + x.area());
            System.out.println("Triangle Y area:" + y.area());

            if (x.area() > y.area()) System.out.println("Larger area: X");
            else System.out.println("Larger area: Y");
        }


        sc.close();
    }

}