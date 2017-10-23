package com.pasha.elevator;

import lombok.AllArgsConstructor;

import java.util.Scanner;

@AllArgsConstructor
public class Reader implements Runnable {

    private Container container;

    public void run() {
        Scanner in = new Scanner(System.in);
        while (true) {
            int floor = in.nextInt();
            container.addFloorToVisit(floor);
        }
    }
}
