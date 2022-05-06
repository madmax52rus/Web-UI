package com.geekbrains.lesson4;

import java.util.Scanner;

public class TriangleSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side A: ");
        int a = scanner.nextInt();
            if(a <= 0) {
            System.out.println("Invalid value!!!");
            System.exit(1);
            }
        System.out.println("Enter side B: ");
        int b = scanner.nextInt();
            if(b <= 0) {
            System.out.println("Invalid value!!!");
            System.exit(1);
            }
        System.out.println("Enter side C: ");
        int c = scanner.nextInt();
            if(c <= 0) {
                System.out.println("Invalid value!!!");
                System.exit(1);
            }
        double pp = (a + b + c) / 2.0; // HalfPerimeter
        double triangleSquare = Math.sqrt(pp * (pp - a) * (pp - b) * (pp -c));
        System.out.println("Площадь треугольника = " + triangleSquare);
    }
}
