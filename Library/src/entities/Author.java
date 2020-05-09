package entities;

/**
 * @author sidney
 */
public class Author {

    private static int cod;
    private int birth;
    private String name;

    public Author(int birth, String name) {
        cod++;
        this.birth = birth;
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author: "
                + "\nBirth: " + birth + " Name: " + name;
    }

}
