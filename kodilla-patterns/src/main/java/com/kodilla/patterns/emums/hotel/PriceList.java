package com.kodilla.patterns.emums.hotel;

import java.math.BigDecimal;
import java.util.Map;

public class PriceList {
    private static Map<Season, BigDecimal> singleBeds = Map.of(Season.LOW, new BigDecimal(250), Season.HIGH, new BigDecimal(320), Season.HOLIDAY, new BigDecimal(400));
    private static Map<Season, BigDecimal> doubleBeds = Map.of(Season.LOW, new BigDecimal(350), Season.HIGH, new BigDecimal(400), Season.HOLIDAY, new BigDecimal(500));

    public static BigDecimal getSingleBedPrices(Season season){
        return singleBeds.get(season);
    }
    public static BigDecimal getDoubleBedPrices(Season season){
        return doubleBeds.get(season);
    }
}
