class MobilePhone extends Product {
    int storage;
    double screenSize;
    int camera;
    double battery;

    public MobilePhone(int id, String name, double price, Brand brand, int storage, double screenSize, int camera,
            double battery, int mobileRam, String mobileColor) {
        super(id, price, name, brand);
        this.storage = storage;
        this.screenSize = screenSize;
        this.camera = camera;
        this.battery = battery;
        this.mobileRam = mobileRam;
        this.mobileColor = mobileColor;

    }
}