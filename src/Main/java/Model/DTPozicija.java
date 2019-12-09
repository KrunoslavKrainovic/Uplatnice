package Main.java.Model;

public class DTPozicija {

    private Integer pozicijaPoX;
    private Integer pozicijaPoY;
    private Integer id;

    public DTPozicija(){

    }

    public Integer getPozicijaPoX() {
        return pozicijaPoX;
    }

    public void setPozicijaPoX(String pozicijaPoX) {
        this.pozicijaPoX =  Integer.parseInt(pozicijaPoX);
    }

    public Integer getPozicijaPoY() {
        return pozicijaPoY;
    }

    public void setPozicijaPoY(String pozicijaPoY) {
        this.pozicijaPoY = Integer.parseInt(pozicijaPoY);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DTPozicija{" +
                "pozicijaPoX='" + pozicijaPoX + '\'' +
                ", pozicijaPoY='" + pozicijaPoY + '\'' +
                ", id=" + id +
                '}';
    }
}
