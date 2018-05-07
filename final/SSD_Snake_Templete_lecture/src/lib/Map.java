package lib;

import java.util.ArrayList;
import java.util.List;

public class Map {

    protected int size = 20;
    protected List<Block> blocks = new ArrayList<Block>();

    public int getSize() {
        return size;
    }

    public List<Block> getBlocks() {
        return blocks;
    }

    public void addBlock(Block block) {
        blocks.add(block);
    }

}
