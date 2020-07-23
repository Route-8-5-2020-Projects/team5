public class Store_house {


    private int block_num,storehouse_id;
    private static int storehouses_count=0;

    public int getStorehouse_id() {
        return storehouse_id;
    }

    public int getBlock_num() {
        return block_num;
    }

    public void setBlock_num(int block_num) {
        this.block_num = block_num;
    }

    public Store_house(int block_num) {

        this.storehouse_id=storehouses_count;
        storehouses_count++;
        this.block_num = block_num;
    }
}
