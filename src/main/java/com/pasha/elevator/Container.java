package com.pasha.elevator;

import java.util.LinkedList;
import java.util.List;

public class Container {

    private static int MAX_FLOOR = 16;
    List<Floor> container;

    public Container() {
        this.container = new LinkedList<>();
    }

    public synchronized void addFloorToVisit(int floor) {

        if (container.size() >= MAX_FLOOR) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        container.add(new Floor(floor));
        notifyAll();
    }

    public synchronized Floor getFloor() {

        if (container.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Floor floor = container.get(0);
        container.remove(0);
        notifyAll();
        return floor;
    }
}
