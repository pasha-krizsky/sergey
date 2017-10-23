package com.pasha.elevator;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Floor implements Comparable<Floor> {

    private int floorNumber;

    @Override
    public int compareTo(Floor floor) {
        if (this.getFloorNumber() > floor.getFloorNumber()) {
            return 1;
        } else if (this.getFloorNumber() == floor.getFloorNumber()) {
            return 0;
        } else {
            return -1;
        }
    }
}
