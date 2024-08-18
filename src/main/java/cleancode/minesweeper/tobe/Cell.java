package cleancode.minesweeper.tobe;

/**
 * Created by merry@crossangle.io on 8/18/24
 */
public class Cell {

    public static final String FLAG_SIGN = "⚑";
    public static final String CLOSED_CELL_SIGN = "□";
    public static final String LAND_MINE_SIGN = "☼";
    public static final String OPENED_CELL_SIGN = "■";

    private final String sign;

    public Cell(String sign) {
        this.sign = sign;
    }

    public static Cell of(String sign) {
        return new Cell(sign);
    }

    public static Cell ofFlag() {
        return of(FLAG_SIGN);
    }

    public static Cell ofLandMine() {
        return of(LAND_MINE_SIGN);
    }

    public static Cell ofClosed() {
        return of(CLOSED_CELL_SIGN);
    }

    public static Cell ofOpened() {
        return of(OPENED_CELL_SIGN);
    }

    public static Cell ofNearByLandMineCount(int count) {
        return of(String.valueOf(count));
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

    public boolean isClosed() {
        return CLOSED_CELL_SIGN.equals(this.sign);
    }

    public boolean doesNotClosed() {
        return !isClosed();
    }
}
