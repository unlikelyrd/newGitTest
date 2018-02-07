package com.ramchaudhary;

public class EnumDay {

    enum Day {SUNDAY, TUESDAY, FRIDAY}

    public static void main(String[] args) {
        Day day = Day.TUESDAY;

        switch (day) {
            case SUNDAY:
                System.out.println("SUNDAY");
                break;
        }
        switch (day) {
            case TUESDAY:
                System.out.println("TUESDAY");
                break;
        }
        switch (day) {
            case FRIDAY:
                System.out.println("FRIDAY");
                break;
        }
    }
}
