import activity.Activity;
import java.util.ArrayList;
import java.util.List;

public class Workflow {
    public List<Activity> activities = new ArrayList<>();

    public void registerActivity(Activity activity){
        activities.add(activity);
    }
}
