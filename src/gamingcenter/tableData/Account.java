package gamingcenter.tableData;

public class Account {
    private int id;
    private String name;
    private String passwd;
    private String dateCreated;
    private float money;

    public Account(int id, String name, String passwd, String dateCreated, float money) {
        this.id = id;
        this.name = name;
        this.passwd = passwd;
        this.dateCreated = dateCreated;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public float getMoney() {
        return money;
    }
    
}
