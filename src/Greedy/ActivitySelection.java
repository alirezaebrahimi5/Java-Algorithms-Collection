package Greedy;

import java.util.*;

class Activity implements Comparable<Activity> {
    int start, finish;

    public Activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }

    @Override
    public int compareTo(Activity other) {
        return this.finish - other.finish;
    }
}

public class ActivitySelection {

    public static List<Activity> activitySelection(List<Activity> activities) {
        Collections.sort(activities); // مرتب‌سازی بر اساس زمان پایان
        List<Activity> selectedActivities = new ArrayList<>();

        int lastFinishTime = 0;

        for (Activity activity : activities) {
            if (activity.start >= lastFinishTime) {
                selectedActivities.add(activity);
                lastFinishTime = activity.finish;
            }
        }

        return selectedActivities;
    }

    public static void runActivitySelection(int[][] array) {
        List<Activity> activities = new ArrayList<>();

        for (int[] i : array) {
            activities.add(new Activity(i[0], i[1]));  // Add each Activity to the list
        }

        List<Activity> result = activitySelection(activities);
        System.out.println("Selected activities:");
        for (Activity activity : result) {
            System.out.println("Start: " + activity.start + ", Finish: " + activity.finish);
        }
    }
}
