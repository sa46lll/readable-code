package cleancode.minesweeper.tobe.cell;

/**
 * Created by merry@crossangle.io on 8/19/24
 */
public class NumberCell extends Cell {

    private int nearbyLandMineCount;

    @Override
    public void turnOnLandMine() {
        throw new UnsupportedOperationException("지원하지 않는 기능입니다.");
    }

    @Override
    public void updateNearbyLandMineCount(int count) {
        this.nearbyLandMineCount = count;
    }

    @Override
    public boolean isLandMine() {
        return false;
    }

    @Override
    public boolean hasLandMineCount() {
        return true;
    }

    @Override
    public String getSign() {
        if (isOpened) {
            return String.valueOf(nearbyLandMineCount);
        }
        if (isFlagged) {
            return FLAG_SIGN;
        }
        return UNCHECKED_SIGN;
    }
}
