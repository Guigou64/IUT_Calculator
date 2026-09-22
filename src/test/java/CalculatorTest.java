import com.guigou.calculator.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void add_devraitEtreAplusB(){
        // GIVEN
        int premNb = 45;
        int secNb = 15;

        // WHEN
        int res ;
        Calculator c = new Calculator();
        res = c.add(premNb, secNb);

        // THEN
        assertEquals(60,res);
    }

    @Test
    void divide_devraitEtreAsurB(){
        // GIVEN
        int premNb = 45;
        int secNb = 15;

        // WHEN
        int res ;
        Calculator c = new Calculator();
        res = c.divide(premNb, secNb);

        // THEN
        assertEquals(3,res);
    }
}
