package Insurance;


public class HealthInsurance extends Insurance {
    public HealthInsurance(int price) {
        super(price);
    }

    @Override
    public double calculate() {
        return (this.getPrice() * 0.05);

    }
}

