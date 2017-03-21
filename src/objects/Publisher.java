package objects;

/**
 * Created by Dmitry on 21/03/2017.
 */
public class Publisher implements java.io.Serializable{

    private String name;

    public Publisher() {
    }

    public Publisher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
