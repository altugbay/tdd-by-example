package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    void testMultiplication() {
        Dollar dollar = new Dollar(5);
        dollar.times(2);
        assertEquals(10, dollar.amount);
    }
}
