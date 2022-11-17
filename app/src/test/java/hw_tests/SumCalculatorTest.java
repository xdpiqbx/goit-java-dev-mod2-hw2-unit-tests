package hw_tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    private SumCalculator sumCalculator;
    @BeforeEach
    public void beforeEach(){
        sumCalculator = new SumCalculator();
    }
    @Test
    public void testSumForOne(){
        Assertions.assertEquals(1, sumCalculator.sum(1));
    }
    @Test
    public void testSumFor3(){
        Assertions.assertEquals(6, sumCalculator.sum(3));
    }
    @Test
    public void testSumForIllegalArgument(){
        int[] illegalValues = {-2, -1, 0};

        for (int value: illegalValues) {
            Assertions.assertThrows(
                    IllegalArgumentException.class,
                    () -> sumCalculator.sum(value),
                    value+""
            );
        }
    }
}
