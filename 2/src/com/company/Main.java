package com.company;

public class Main {

    private final static double e = 2.71828;

    public static void main(String[] args) {
        //IA-14, group 6
        // 39, 18, 3

        System.out.println(task39(4.88, -0.54, 1.25, 0.34));
        System.out.println(task18(2.34, 0.756, 2.23, -1.653));
        System.out.println(task3(1.234, -3.12, 5.45, 2.0));
    }

    private static double task39(double a, double b, double c, double d){
        return Math.log(
            Math.abs(
                    (b / a) *
                    Math.sqrt(Math.abs(
                        Math.cos(c) /
                        (Math.log(Math.sqrt(d)) / Math.log(Math.sqrt(c)))
                    ))
            )
        ) / Math.log(c);
    }

    private static double task18(double a, double b, double c, double d){
        return (Math.pow(e, c) + 2 * Math.log10(a) / Math.sqrt(Math.pow(c, b))) * Math.abs(Math.asin(d));
    }

    private static double task3(double a, double b, double c, double d){
        return Math.pow(2 * Math.sin(a) + Math.cos(Math.abs(b * Math.sqrt(c))) , d);
    }
}
