package cleancode.minesweeper.tobe.gamelevel;

/**
 * Created by merry@crossangle.io on 8/19/24
 */
public class Middle implements GameLevel {

    @Override
    public int getRowSize() {
        return 14;
    }

    @Override
    public int getColSize() {
        return 18;
    }

    @Override
    public int getLandMineCount() {
        return 40;
    }
}
