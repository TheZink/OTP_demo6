package com.example;

import java.util.Scanner;

public class Timecal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter distanse in km: ");
        int distance = scanner.nextInt();
        System.out.println("Enter speed in km/h: ");
        int speed = scanner.nextInt();

        System.out.println("The required time to reach: " + calculateTime(distance, speed));
        scanner.close();
    }

    public static double calculateTime(int x, int v){
        return x / v;
    }
}