/**
 * Projeto:    Biosfera 2
 * Disciplina: Programação Orientada a Objetos e Estrutura de Dados
 * Professor:  Mauricio da Motta Braga
 * Autor:      Rodinei Costa da Silva
 * Matrícula:  04115356
 * Data:       15/12/2022
 */
import java.io.IOException;

public class Biosphere {

    /**
     * The array.
     */
    private static int[][] arrayTable;

    /**
     * The array row numbers.
     */
    private static int rows;

    /**
     * The array column numbers.
     */
    private static int columns;

    /**
     * Get the array.
     * @return int[][] arrayTable
     */
    public static int[][] getArrayTable() {
        return arrayTable;
    }

    /**
     * Set the array.
     * @param arrayTable The array.
     */
    public static void setArrayTable(int[][] arrayTable) {
        Biosphere.arrayTable = arrayTable;
    }

    /**
     * Get the amount of array row numbers.
     * @return int rows
     */
    public static int getRows() {
        return rows;
    }

    /**
     * Set the amount of array row numbers.
     * @param rows Rows amount.
     */
    public static void setRows(int rows) {
        Biosphere.rows = rows;
    }

    /**
     * Get the amount of array column numbers.
     * @return int columns
     */
    public static int getColumns() {
        return columns;
    }

    /**
     * Set the amount of array column numbers.
     * @param columns Columns amount.
     */
    public static void setColumns(int columns) {
        Biosphere.columns = columns;
    }

    /**
     * The main method.
     * @param  args        Main args.
     * @throws IOException General class of exceptions produced by failed or interrupted I/O operations.
     */
    public static void main(String[] args) throws IOException {

        prepareArray();
        Schedules.theSchedules(getArrayTable());
        getSensorsData(arrayTable);

        printWelcomeMessage();
        printScheduleTable();
        pressKey();

        printHumidityTable();
        pressKey();

        printTemperatureTable();
        pressKey();

        printCarbonGasTable();

    }

	/**
	 * Create an instance of array with number of rows and columns.
	 */
	private static void prepareArray() {

		setRows(48);
        setColumns(5);
        setArrayTable(new int [getRows()][getColumns()]);

    }

	/**
     * Get the data collected by the sensors.
	 * @param arrayTable The array data.
	 */
	private static void getSensorsData(int[][] arrayTable) {

        Temperature.Sensor(getArrayTable());
        RelativeHumidity.Sensor(getArrayTable());
        CarbonDioxide.Sensor(getArrayTable());

	}

	/**
     * Helper function used in execution pause.
	 * @throws IOException General class of exceptions produced by failed or interrupted I/O operations.
	 */
	private static void pressKey() throws IOException {

		System.out.println("Pressione a tecla Enter para continuar...");
        System.in.read();

	}

	/**
	 * Prints the welcome message.
	 */
	private static void printWelcomeMessage() {

		System.out.println("===========================================================");
        System.out.println();
        System.out.println("           Boas vindas ao Projeto Biosfera 2!");
        System.out.println();
        System.out.println("===========================================================");
        System.out.println();

	}

	/**
	 * Prints the data sorted by time.
	 */
	private static void printScheduleTable() {

		System.out.println("Na tabela abaixo podem ser visualizados os");
        System.out.println("dados coletados a cada meia hora do dia.");
        printData();

    }

	/**
	 * Prints the data in reverse order by humidity.
	 */
	private static void printHumidityTable() {

		SortData.byColumnReverse(getArrayTable(), 3);

        System.out.println("Na tabela seguinte podem ser visualizados os dados");
        System.out.println("coletados sobre a umidade relativa do ar, em");
        System.out.println("ordem decrescente.");
        printData();

	}

	/**
	 * Prints the data sorted by temperature.
	 */
	private static void printTemperatureTable() {

		SortData.byColumn(getArrayTable(), 2);
        System.out.println("Na tabela seguinte podem ser visualizados os dados");
        System.out.println("coletados sobre a temperatura, em ordem crescente.");
        printData();

	}

	/**
	 * Prints the data sorted by CO2 quantity.
	 */
	private static void printCarbonGasTable() {

		SortData.byColumn(getArrayTable(), 4);
        System.out.println("Na tabela seguinte podem ser visualizados os dados");
        System.out.println("coletados sobre a quantidade de gás carbônico,");
        System.out.println("em ordem crescente.");
        printData();

	}

    /**
	 * Help function to print the data.
     */
    public static void printData() {

        System.out.println("+=============" + "==================" + "==============" + "============+");
        System.out.println("|   Horário   " + "|   Temperatura   " + "|   Umidade   " + "|    CO²    |");
        System.out.println("+=============" + "==================" + "==============" + "============+");

        for (int i = 0; i < getArrayTable().length; i++) {

            String hour, minute, temperature, humidity, co2;

            hour = String.format("%02d", getArrayTable()[i][0]);
            minute = String.format("%02d", getArrayTable()[i][1]);
            temperature = String.format("%02d", getArrayTable()[i][2]);
            humidity = String.format("%02d", getArrayTable()[i][3]);
            co2 = String.format("%03d", getArrayTable()[i][4]);

            System.out.println("|    " + hour + ":" + minute + "    " + "|      " + temperature + " °C      " + "|     " + humidity + "%     " + "|  " + co2 + " ppm  |");

        }

        System.out.println("+=============" + "==================" + "==============" + "============+");
        System.out.println();

    }

}
