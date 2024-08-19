package cleancode.minesweeper.tobe.cell;

/**
 * Created by merry@crossangle.io on 8/19/24
 */
public class EmptyCell extends Cell {

    public static final String EMPTY_SIGN = "■";

    @Override
    public boolean isLandMine() {
        return false;
    }

    @Override
    public boolean hasLandMineCount() {
        return false;
    }

    @Override
    public String getSign() {
        if (isOpened) {
            return EMPTY_SIGN;
        }
        if (isFlagged) {
            return FLAG_SIGN;
        }
        return UNCHECKED_SIGN;
    }
}
