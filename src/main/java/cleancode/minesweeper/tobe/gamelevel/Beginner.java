package cleancode.minesweeper.tobe.gamelevel;

/**
 * Created by merry@crossangle.io on 8/19/24
 */
public class Beginner implements GameLevel {

    @Override
    public int getRowSize() {
        return 8;
    }

    @Override
    public int getColSize() {
        return 10;
    }

    @Override
    public int getLandMineCount() {
        return 10;
    }
}
