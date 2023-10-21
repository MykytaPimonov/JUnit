package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        new Main().showMinAndMax();
    }

    // Task 3
    public double func(double x) {
        double a = -0.5, b = 2;

        if (x <= 0.7) {
            return 1.;
        }

        if (x > 1.4) {
            return Math.exp(a * x) * Math.cos(b * x);
        }

        return a * x * x * Math.log(x);
    }

    // Task 4
    public int steps(double start, double finish, double delta) {
        return (int) Math.abs((finish - start) / delta);
    }

    // Task 5
    public double[] xAxis(double start, double finish, double delta) {
        double[] arr = new double[steps(start, finish, delta)];
        double x = start;
        for (int i = 0; i < arr.length && x <= finish; i++, x += delta) {
            arr[i] = x;
        }
        return arr;
    }

    // Task 5
    public double[] yAxis(double start, double finish, double delta) {
        double[] arr = new double[steps(start, finish, delta)];
        double x = start;
        for (int i = 0; i < arr.length && x <= finish; i++, x += delta) {
            arr[i] = func(x);
        }
        return arr;
    }

    // Task 6
    public int indexMaxElem(double[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[index] < arr[i]) {
                index = i;
            }
        }
        return index;
    }

    // Task 6
    public int indexMinElem(double[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[index] > arr[i]) {
                index = i;
            }
        }
        return index;
    }

    // Task 6
    public double sum(double[] arr) {
        return Arrays.stream(arr).sum();
    }

    // Task 6
    public double avg(double[] arr) {
        return sum(arr) / arr.length;
    }

    // Task 7
    public void showMinAndMax() {
        double[] y = yAxis(0.0, 3.0, 0.004);
        double[] x = xAxis(0.0, 3.0, 0.004);
        int min = indexMinElem(y);
        int max = indexMaxElem(y);
        print("Min", x[min], y[min]);
        print("Max", x[max], y[max]);
    }

    // Task 7
    public void print(String title, double x, double y) {
        System.out.printf("%s: y(%.5f) = %.5f\n", title, x, y);
    }
}