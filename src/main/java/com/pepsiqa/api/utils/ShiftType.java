package com.pepsiqa.api.utils;

public enum ShiftType {

    TYPE1(2), TYPE2(3), TYPE3(4), TYPE4(5), TYPE5(6);

    private final int value;

    ShiftType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
