package cleancode.minesweeper.tobe.cell;

/**
 * Created by merry@crossangle.io on 8/19/24
 */
public class LandMineCell extends Cell {

    public static final String LAND_MINE_SIGN = "☼";

    private boolean isLaneMine;

    @Override
    public void turnOnLandMine() {
        this.isLaneMine = true;
    }

    @Override
    public void updateNearbyLandMineCount(int count) {
        throw new UnsupportedOperationException("지원하지 않는 기능입니다.");
    }

    @Override
    public boolean isLandMine() {
        return true;
    }

    @Override
    public boolean hasLandMineCount() {
        return false;
    }

    @Override
    public String getSign() {
        if (isOpened) {
            return LAND_MINE_SIGN;
        }
        if (isFlagged) {
            return FLAG_SIGN;
        }
        return UNCHECKED_SIGN;
    }
}
