package l2.blog.model;

import java.io.Serializable;

public class MenuModel implements Serializable {

    private String tenhienthi;
    private int id;

    public MenuModel() {
    }

    public MenuModel(String tenhienthi, int id) {
        this.tenhienthi = tenhienthi;
        this.id = id;
    }

    public String getTenhienthi() {
        return tenhienthi;
    }

    public void setTenhienthi(String tenhienthi) {
        this.tenhienthi = tenhienthi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
