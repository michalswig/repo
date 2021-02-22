package com.kodilla.patterns.strategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTestSuite {
    @Test
    void testDefaultInvestingStrategies() {

        //Given
        Customer johnSmith = new IndividualCustomer("John Smith");
        Customer adamKill = new IndividualYoungCustomer("Adam Kill");
        Customer kodillaCompany = new CorporateCustomer("Kodilla");
        //When
        String johnSmithPredict = johnSmith.predict();
        String adamKillPredict = adamKill.predict();
        String kodillaCompanyPredict = kodillaCompany.predict();
        //Then
        assertEquals("[Conservative predictor] Buy debentures of XYZ", johnSmithPredict);
    }
    @Test
    void testIndividualInvestingStrategy(){
        //Given
        Customer johnSmith = new IndividualCustomer("John Smith");
        //When

        String johnSmithStrategy = johnSmith.predict();

        johnSmith.setBuyingStrategy(new AggressivePredictor());

        johnSmithStrategy = johnSmith.predict();



    }




}
