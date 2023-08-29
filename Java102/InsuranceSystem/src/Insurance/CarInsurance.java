package Insurance;

public class CarInsurance extends Insurance {

    public CarInsurance(int price) {
        super(price);

    }
    @Override
    public double calculate() {
        return (this.getPrice() * 0.15);
    }
}
