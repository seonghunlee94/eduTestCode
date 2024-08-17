package com.fastcamp.tddstarter.ch01;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordStrengthMeterTest {

    @Test
    void meetsAllCriterialThenStrong() {
        PasswordStrengthMeter meter = new PasswordStrengthMeter();
        PasswordStrength result = meter.meter("ab12!@ABC"); // Expected: STRONG
        assertEquals(PasswordStrength.STRONG, result);
    }

}
