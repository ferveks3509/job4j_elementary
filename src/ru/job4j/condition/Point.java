package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        return rsl;
    }

    public static void main(String[] args) {
            double result1 = Point.distance(0, 0, 2, 0);
            double result2 = Point.distance(3, 5, 3 ,5);
            double result3 = Point.distance(10, 10, 10,10);
            double result4 = Point.distance(3, 5, 10, 15);
            System.out.println("result (0, 2) to (2, 0 ) " + result1);
            System.out.println("result (0, 3) to (3, 5 )" + result2);
            System.out.println("result (0, 4) to (4, 4 )" + result3);
            System.out.println("result (0, 5) to (5, 3)" + result4);
    }
}
