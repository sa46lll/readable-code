package cleancode.minesweeper.tobe;

/**
 * Created by merry@crossangle.io on 8/18/24
 */
public class Cell {

    private final String sign;

    public Cell(String sign) {
        this.sign = sign;
    }

    public static Cell of(String sign) {
        return new Cell(sign);
    }

    public String getSign() {
        return sign;
    }

    public boolean equalsSign(String sign) {
        return this.sign.equals(sign);
    }

    public boolean doesNotEqualSign(String sign) {
        return !equalsSign(sign);
    }
}
