package CalcBMI;

public class CalculatorBMI {

    private double weight;
    private double height;

    public CalculatorBMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public CalculatorBMI() {
    }

    public double calculate(double weight, double height){
        height = height /100;
        double BMIindex = weight /(height * height);
        return BMIindex;
    }
}
