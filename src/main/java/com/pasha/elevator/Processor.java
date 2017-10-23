package com.pasha.elevator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Processor implements Runnable {

    private Container container;

    @Override
    public void run() {
        while (true) {
            Floor floor = container.getFloor();
            System.out.println("Floor: " + floor.getFloorNumber());
        }
    }
}
