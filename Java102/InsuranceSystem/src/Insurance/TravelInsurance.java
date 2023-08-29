package Insurance;

public class TravelInsurance extends Insurance {

    public TravelInsurance(int price) {
        super(price);
    }

    @Override
    public double calculate() {
        return (this.getPrice() * 0.30);
    }
}
