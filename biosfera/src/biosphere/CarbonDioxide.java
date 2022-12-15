package biosphere;

public class CarbonDioxide extends Sensors {

    /**
     * Collect CO2 quantity data by the sensor.
     * @param arrayTable The array data.
     */
    public static void Sensor(int[][] arrayTable) {

        Sensors.setColumn(4);
        Sensors.setRange(1000);
        Sensors.Sensor(arrayTable);

    }

}
