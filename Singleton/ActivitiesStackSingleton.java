
import java.util.Stack;
public class ActivitiesStackSingleton {
    private static ActivitiesStackSingleton instance = new ActivitiesStackSingleton();
    private Stack<TeamknBaseActivity> activities_stack;
    private ActivitiesStackSingleton() {
        activities_stack = new Stack<TeamknBaseActivity>();
    }
    private static Stack<TeamknBaseActivity> get_activities_stack() {
        return instance.activities_stack;
    }
    protected static void clear_activities_stack() {
        Stack<TeamknBaseActivity> activities_stack = get_activities_stack();
        int size = activities_stack.size();
        for (int i = 0; i < size; i++) {
            TeamknBaseActivity activity = activities_stack.pop();
            activity.finish();
        } 
    }
    protected static void remove_activity(TeamknBaseActivity activity) {
        get_activities_stack().remove(activity);
    }
    protected static void tidy_and_push_activity(TeamknBaseActivity new_activity) {
        Class<?> cls = new_activity.getClass();
        Stack<TeamknBaseActivity> activities_stack = get_activities_stack();
        int index = -1;
        int size = activities_stack.size();
        for (int i = 0; i < size; i++) {
            TeamknBaseActivity activity = activities_stack.get(i);
            if (cls == activity.getClass()) {
                index = i;
                break;
            }
        }
        if (index > -1) {
            int pops_count = size - index;
            for (int i = 0; i < pops_count; i++) {
                TeamknBaseActivity item = activities_stack.pop();
                item.finish();
            }
        }
        activities_stack.push(new_activity);
    }
}
