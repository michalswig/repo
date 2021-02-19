package com.kodilla.patterns.emums.hotel;

public class HotelApp {
    public static void main(String[] args) {
        System.out.println("Accomodation Prices:");
        System.out.println("1. Single Bed rooms:");
        System.out.println("   - Low Season " + Season.LOW.getSingleRoomPrices());
        System.out.println("   - High Season " + Season.HIGH.getSingleRoomPrices());
        System.out.println("   - Holiday Season " + Season.HOLIDAY.getSingleRoomPrices());
        System.out.println("2. Double Bed rooms:");
        System.out.println("   - Low Season " + Season.LOW.getDoubleRoomPrices());
        System.out.println("   - High Season " + Season.HIGH.getDoubleRoomPrices());
        System.out.println("   - Holiday Season " + Season.HOLIDAY.getDoubleRoomPrices());
    }
}
