package Insurance;

public class ResidenceInsurance extends Insurance {
    public ResidenceInsurance(int price) {
        super(price);
    }

    @Override
    public double calculate() {
        return (this.getPrice() * 0.30);
    }
}



