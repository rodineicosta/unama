import java.util.Random;

public class Sensors {

    /**
     * Creates a new random number generator.
     */
    static final Random random = new Random();

    /**
     * The array column.
     */
    protected static int column;

    /**
     * The stream of pseudorandom numbers.
     */
    protected static int range;


    /**
     * Set the array column.
     * @param column The column.
     */
    protected static void setColumn(int column) {
        Sensors.column = column;
    }

    /**
     * Get the array column.
     * @return int column
     */
    public static int getColumn() {
        return column;
    }

    /**
     * Set the pseudorandom numbers.
     * @param range The pseudorandom numbers.
     */
    protected static void setRange(int range) {
        Sensors.range = range;
    }

    /**
     * Get the pseudorandom numbers.
     * @return int range
     */
    public static int getRange() {
        return range;
    }

    /**
     * Populate the array with sensor data.
     * @param arrayTable The array
     */
    public static void Sensor(int[][] arrayTable) {

        for (int i = 0; i < arrayTable.length; i++ ) {
            arrayTable[i][getColumn()] = random.nextInt(getRange());
        }

    }

}
