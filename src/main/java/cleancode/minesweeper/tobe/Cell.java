package cleancode.minesweeper.tobe;

/**
 * Created by merry@crossangle.io on 8/18/24
 */
public class Cell {

    public static final String FLAG_SIGN = "⚑";
    public static final String LAND_MINE_SIGN = "☼";
    public static final String UNCHECKED_SIGN = "□";
    public static final String EMPTY_SIGN = "■";

    private int nearbyLandMineCount;
    private boolean isLaneMine;
    private boolean isFlagged;
    private boolean isOpened;

    public Cell(int nearbyLandMineCount, boolean isLaneMine, boolean isFlagged, boolean isOpened) {
        this.nearbyLandMineCount = nearbyLandMineCount;
        this.isLaneMine = isLaneMine;
        this.isFlagged = isFlagged;
        this.isOpened = isOpened;
    }

    public static Cell of(int nearbLandyMineCount, boolean isLaneMine, boolean isFlagged, boolean isOpened) {
        return new Cell(nearbLandyMineCount, isLaneMine, isFlagged, isOpened);
    }

    public static Cell create() {
        return of(0, false, false, false);
    }

    public void turnOnLandMine() {
        this.isLaneMine = true;
    }

    public void updateNearbyLandMineCount(int count) {
        this.nearbyLandMineCount = count;
    }

    public void flag() {
        this.isFlagged = true;
    }

    public boolean isLandMine() {
        return isLaneMine;
    }

    public void open() {
        this.isOpened  = true;
    }

    public boolean isChecked() {
        return isFlagged || isOpened;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public boolean hasLandMineCount() {
        return nearbyLandMineCount != 0;
    }

    public String getSign() {
        if (isOpened) {
            if (isLaneMine) {
                return LAND_MINE_SIGN;
            }
            if (hasLandMineCount()) {
                return String.valueOf(nearbyLandMineCount);
            }
            return EMPTY_SIGN;
        }

        if (isFlagged) {
            return FLAG_SIGN;
        }

        return UNCHECKED_SIGN;
    }
}
