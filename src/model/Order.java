package model;

public class Order {
    int id;
    String goods_name;
    int bill_id;
    int amount;

    public Order(int id, String goods_id, int bill_id, int amount) {
        this.id = id;
        this.goods_name = goods_id;
        this.bill_id = bill_id;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public int getBill_id() {
        return bill_id;
    }

    public int getAmount() {
        return amount;
    }
    
}
