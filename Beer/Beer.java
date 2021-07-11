public class Beer {
    public String getBrand() {
        return brand;
    }

    public int getVolume() {
        return volume;
    }

    private String brand;
    private int volume;

    public Beer (int volume, String brand) {
        this.volume = volume;
        this.brand = brand;
    }
}
