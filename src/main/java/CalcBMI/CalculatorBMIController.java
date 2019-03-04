package CalcBMI;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DecimalFormat;


@Controller
public class CalculatorBMIController {

    private CalculatorBMI calculatorBMI = new CalculatorBMI();
    private DecimalFormat dec2 = new DecimalFormat(".##");

    @GetMapping("/result")
    public String getResult(@RequestParam double height,
                            @RequestParam double weight,
                            ModelMap modelMap) {
        modelMap.put("height", dec2.format(height));
        modelMap.put("weight", dec2.format(weight));

        double bmi = calculatorBMI.calculate(weight,height);
        modelMap.put("bmi",  dec2.format(bmi));
        return "result";
    }

    @GetMapping("/bmi")
    public String main(){
        return "bmi";
    }
}
