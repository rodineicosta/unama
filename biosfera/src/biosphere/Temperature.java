package biosphere;

public class Temperature extends Sensors {

    /**
     * Collect temperature data by the sensor.
     * @param arrayTable The matrix data table.
     */
    public static void Sensor(int[][] arrayTable) {

        Sensors.setColumn(2);
        Sensors.setRange(33);
        Sensors.Sensor(arrayTable);

    }

}
