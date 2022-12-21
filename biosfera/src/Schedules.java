import java.util.Calendar;

public class Schedules {

    /**
     * Set the sensor scheduling times on array.
     * @param arrayTable The array.
     */
    public static void theSchedules(int[][] arrayTable) {

        int hour = 0, minute;
        Calendar cal = Calendar.getInstance();

        for (int i = 0; i < arrayTable.length; i++ ) {
            if (i % 2 == 0) {
                hour = i == 0 ? 0 : hour + 1;
                minute = 0;
            } else {
                minute = 30;
            }

            cal.set(Calendar.HOUR_OF_DAY, hour);
            cal.set(Calendar.MINUTE, minute);
            arrayTable[i][0] = cal.get(Calendar.HOUR_OF_DAY);
            arrayTable[i][1] = cal.get(Calendar.MINUTE);
        }

    }

}
