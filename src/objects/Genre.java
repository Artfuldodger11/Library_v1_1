package objects;

/**
 * Created by Dmitry on 21/03/2017.
 */
public class Genre implements java.io.Serializable {

    private String name;

    public Genre() {
    }

    public Genre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
