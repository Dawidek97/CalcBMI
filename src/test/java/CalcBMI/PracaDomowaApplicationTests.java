package CalcBMI;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import CalcBMI.CalculatorBMI;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PracaDomowaApplicationTests {

	@Test
	public void contextLoads() {
		CalculatorBMI calculatorBMI = new CalculatorBMI();
		assertEquals(24.930747922437675, calculatorBMI.calculate(90,190),0);
		assertEquals(27.343749999999996, calculatorBMI.calculate(70,160),0);
		assertEquals(19.15119181970521, calculatorBMI.calculate(56,171),0);
	}

}
