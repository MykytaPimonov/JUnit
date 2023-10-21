package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main main;

    @BeforeEach
    public void init() {
        main = new Main();
    }

    @Test
    void func() {
        double res1 = main.func(0.99);
        assertEquals(0.004925167085008386, res1);

        double res2 = main.func(0.);
        assertEquals(1.0, res2);

        double res3 = main.func(2.);
        assertEquals(-0.2404620499685837, res3);
    }

    @Test
    void steps() {
        int res1 = main.steps(0.0, 3.0, 0.004);
        assertEquals(750, res1);
    }

    @Test
    void xAxis() {
        double[] arr = {1, 2, 3};
        double[] res1 = main.xAxis(1, 4, 1);
        assertArrayEquals(arr, res1);
    }

    @Test
    void yAxis() {
        double[] arr = {-0.0, -0.2404620499685837, 0.21424294983005993};
        double[] res1 = main.yAxis(1, 4, 1);
        assertArrayEquals(arr, res1);
    }

    @Test
    void indexMaxElem() {
        double[] arr = {1, 2, 3, 4, 5, 6, 7, 12, 45, -4};
        int res1 = main.indexMaxElem(arr);
        assertEquals(8, res1);
    }

    @Test
    void indexMinElem() {
        double[] arr = {1, 2, 3, 4, 5, 6, 7, 12, 45, -4};
        int res1 = main.indexMinElem(arr);
        assertEquals(9, res1);
    }

    @Test
    void sum() {
        double[] arr = {1, 2, 3, 4, 5, 6, 7, 12, 45, -4};
        double res1 = main.sum(arr);
        assertEquals(81.0, res1);
    }

    @Test
    void avg() {
        double[] arr = {1, 2, 3, 4, 5, 6, 7, 12, 45, -4};
        double res1 = main.avg(arr);
        assertEquals(8.1, res1);
    }

}