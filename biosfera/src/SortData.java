import java.util.Arrays;
import java.util.Comparator;

public class SortData {

    /**
     * Sort the array data by column.
	 * @param arrayTable The array data.
     * @param column     The array column numbers.
     */
    public static void byColumn(int[][] arrayTable, final int column) {

        Arrays.sort(arrayTable, new Comparator<int[]>() {
            @Override
            public int compare(int[] fst, int[] snd) {
                if (fst[column] > snd[column]) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });

    }

    /**
     * Reverse sort the array data by column.
	 * @param arrayTable The array data.
     * @param column     The array column numbers.
     */
    public static void byColumnReverse(int[][] arrayTable, final int column) {

        Arrays.sort(arrayTable, new Comparator<int[]>() {
            @Override
            public int compare(int[] fst, int[] snd) {
                if (fst[column] < snd[column]) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });

    }

}
