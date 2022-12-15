package biosphere;

public class RelativeHumidity extends Sensors {

    /**
     * Collect relative humidity data by the sensor.
     * @param arrayTable The array data.
     */
    public static void Sensor(int[][] arrayTable) {

        Sensors.setColumn(3);
        Sensors.setRange(100);
        Sensors.Sensor(arrayTable);

    }

}
