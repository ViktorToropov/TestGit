import java.util.List;

public class Viewer {
    private String name;
    private int age;
    private int views;
    List<Cinema> films;

    public Viewer(String name, int age, List<Cinema> films) {
        this.name = name;
        this.age = age;
        this.views = films.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getViews() {
        return views;
    }

    public void setViews(List<Cinema> films) {
        this.views = films.size();
    }
}
