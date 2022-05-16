package com.geekbrains.lesson4;

public class TriangleSquare {

    public static boolean isTriangleSquare(int a, int b, int c) {

        /*Scanner scanner = new Scanner(System.in);
        System.out.println(" Сумма двух сторон НЕ должна быть равна третьей стороне!");
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
            }*/

        if (a <= 0 || b <= 0 || c <= 0) return false;
        double pp = (a + b + c) / 2.0; // HalfPerimeter
        double triangleSquare = Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
        System.out.println("Площадь треугольника = " + triangleSquare);
        return true;
    }
}
