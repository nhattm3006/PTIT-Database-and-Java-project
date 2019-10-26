package gamingcenter.tableData;

public class Goods {
    int id;
    String name;
    String type;
    String unit;
    float price;
    int stock;

    public Goods(int id, String name, String type, String unit, float price, int stock) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.unit = unit;
        this.price = price;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getUnit() {
        return unit;
    }

    public float getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
    
}
