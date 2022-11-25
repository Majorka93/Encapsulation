public class Cargoinfo {

    private final Dimensions dimensions;
    private final double weight;
    private final String address;
    private final boolean mayflip;
    private final String regNum;
    private final boolean isFragile;

    public Cargoinfo(Dimensions dimensions, double weight, String address, boolean mayflip, String regNum, boolean isFragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.mayflip = mayflip;
        this.regNum = regNum;
        this.isFragile = isFragile;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public String getAddress() {
        return address;
    }

    public boolean isMayflip() {
        return mayflip;
    }

    public String getRegNum() {
        return regNum;
    }

    public boolean isFragile() {
        return isFragile;
    }

    public Cargoinfo setAddress(String address) {
        return new Cargoinfo(dimensions, weight, address, mayflip, regNum, isFragile);
    }

    public Cargoinfo setDimensions(Dimensions dimensions) {
        return new Cargoinfo(dimensions, weight, address, mayflip, regNum, isFragile);
    }

    public Cargoinfo setWeight(double weight) {
        return new Cargoinfo(dimensions, weight, address, mayflip, regNum, isFragile);
    }

    @Override
    public String toString() {
        return "Данные о грузе: " +
                dimensions +
                ", Масса= " + weight +
                ", Адрес= " + address + '\'' +
                ", Можно ли переворачивать= " + mayflip +
                ", Рег.номер= " + regNum + '\'' +
                ", Является ли груз хрупким= " + isFragile;
    }
}
