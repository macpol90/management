/**
 * Created by Maciej Polansky on 2018-12-07.
 **/

public class Boots extends Product {
    private int size;
    private boolean isNaturalSkin;

    public Boots(long id, String productName, double price,
                 double weight, String color, Integer productCount,
                 int size, boolean isNaturalSkin) {
        super(id, productName, price, weight, color, productCount);
        this.size = size;
        this.isNaturalSkin = isNaturalSkin;
    }

    public int getSize() {
        return size;
    }

    public boolean isNaturalSkin() {
        return isNaturalSkin;
    }

    @Override
    public String toString() {
        return "Boots{" +
                "size=" + size +
                ", isNaturalSkin=" + isNaturalSkin +
                '}';
    }
}
