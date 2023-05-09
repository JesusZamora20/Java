package org.example.discounts;

import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorTest {
    @Test
    public void total_zero_when_no_prices() {
        PriceCalculator calculator = new PriceCalculator();

        assertEquals(0, calculator.getTotal(),0);
    }

    @Test
    public void total_is_the_sum_of_prices() {
        PriceCalculator calculator = new PriceCalculator();

        calculator.addPrice(25.2);
        calculator.addPrice(10.5);

        assertEquals(35.7, calculator.getTotal(), 0);
    }

    @Test
    public void apply_discount_to_price() {
        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrice(25.5);
        calculator.addPrice(13.5);
        calculator.setDiscount(50);

        assertEquals(19.5, calculator.getTotal(), 0);
    }
}