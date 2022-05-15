import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        List<Cinema> testFilms = new ArrayList<>();
        testFilms.add(new Cinema("film1","genre1",2));
        testFilms.add(new Cinema("film2","genre2",1));

        List<Cinema> testFilms1 = new ArrayList<>();
        testFilms1.add(new Cinema("film3","genre3",3));
        testFilms1.add(new Cinema("film4","genre4",2));

        List<Viewer> list = new ArrayList<>();
        list.add(new Viewer("n1",20,testFilms));
        list.add(new Viewer("n2",30,testFilms1));
        list.add(new Viewer("n3",50,testFilms));
        list.add(new Viewer("n4",60,testFilms1));
        list.add(new Viewer("n5",18,testFilms));
        ViewerStatistics.averageAge(list);
    }
}
