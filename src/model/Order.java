package model;

public class Order {
    int id;
    int goods_id;
    int bill_id;
    int amount;

    public Order(int id, int goods_id, int bill_id, int amount) {
        this.id = id;
        this.goods_id = goods_id;
        this.bill_id = bill_id;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public int getBill_id() {
        return bill_id;
    }

    public int getAmount() {
        return amount;
    }
    
}
