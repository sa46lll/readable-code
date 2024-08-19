package cleancode.minesweeper.tobe.gamelevel;

/**
 * Created by merry@crossangle.io on 8/19/24
 */
public class VeryBeginner implements GameLevel {

    @Override
    public int getRowSize() {
        return 4;
    }

    @Override
    public int getColSize() {
        return 5;
    }

    @Override
    public int getLandMineCount() {
        return 2;
    }
}
