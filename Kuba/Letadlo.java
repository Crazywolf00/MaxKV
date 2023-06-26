package Kuba;

public class Letadlo {
    private int guns;
    private String name;


    public Letadlo(int guns, String name) {
        this.guns = guns;
        this.name = name;
    }

    public int getGuns() {
        return guns;
    }

    public void setGuns(int guns) {
        this.guns = guns;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
