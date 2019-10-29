package model;

public class Computer {
    int id;
    String area;
    String stt;
    String acc;

    public Computer(int id, String area, String stt, String acc) {
        this.id = id;
        this.area = area;
        this.stt = stt;
        this.acc = acc;
    }

    public int getId() {
        return id;
    }

    public String getArea() {
        return area;
    }

    public String getStt() {
        return stt;
    }

    public String getAcc() {
        return acc;
    }
    
}
