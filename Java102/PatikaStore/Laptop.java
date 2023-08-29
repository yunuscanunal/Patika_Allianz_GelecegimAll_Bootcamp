class Laptop extends Product {
    int ram;
    int storage;
    double screenSize;

    public Laptop(int id, String name, double price, Brand brand, int storage, double screenSize, int ram) {
        super(id, price, name, brand);
        this.storage = storage;
        this.screenSize = screenSize;
        this.ram = ram;

    }
}
