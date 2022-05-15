import java.util.List;

public class ViewerStatistics {
    public static void averageAge(List<Viewer> list){
        int avAge=0;
        for(Viewer i:list)
            avAge+=i.getAge();
        System.out.println(avAge/list.size());
    }
}
