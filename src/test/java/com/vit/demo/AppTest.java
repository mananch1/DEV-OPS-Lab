package com.vit.demo;

public class AppTest {
    public static void main(String[] args) {
        int expected = 5;
        int actual = App.add(2,3);

        if(expected == actual){
            System.out.println("TEST PASSED: App.add(2, 3) returned 5.");
        } else {
            System.out.println("Test failed: expected " + expected + " but received " + actual);
            System.exit(1);
        }
    }
}
