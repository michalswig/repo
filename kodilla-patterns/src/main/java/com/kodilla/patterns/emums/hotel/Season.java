package com.kodilla.patterns.emums.hotel;

import java.math.BigDecimal;

public enum Season {
    LOW(new BigDecimal(250), new BigDecimal(350)),
    HIGH(new BigDecimal(320), new BigDecimal(400)),
    HOLIDAY(new BigDecimal(400), new BigDecimal(500));

    private BigDecimal singleRoomPrices;
    private BigDecimal doubleRoomPrices;

    Season(BigDecimal singleRoomPrices, BigDecimal doubleRoomPrices) {
        this.singleRoomPrices = singleRoomPrices;
        this.doubleRoomPrices = doubleRoomPrices;
    }

    public BigDecimal getSingleRoomPrices() {
        return singleRoomPrices;
    }

    public BigDecimal getDoubleRoomPrices() {
        return doubleRoomPrices;
    }
}

