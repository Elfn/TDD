import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Project TDD
 * @Author elfof on 31/08/2022 at 15:53
 */
class CalculatorTest {

    @Test
    void add() {
        Integer sum = Calculator.add(1,4);
        Assertions.assertEquals(5, sum);
    }
}