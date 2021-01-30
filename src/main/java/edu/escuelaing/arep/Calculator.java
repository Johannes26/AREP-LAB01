package edu.escuelaing.arep;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Calculator {

	public static Calculator calculator;

	/**
	 * realiza un singleton de la clase calculator
	 * 
	 * @return una instacia de calculator
	 */
	public static Calculator getCalculator() {
		if (calculator == null) {
			calculator = new Calculator();
		}
		return calculator;
	}

	private Calculator() {
	}

	/**
	 * Calcula la desviacion y la media de un conjunto de datos
	 * 
	 * @param path direccion del archivo a leer
	 * @return una lista con el valor de la media y la desviacion
	 */
	public ArrayList<Double> Execute(String path) {
		LinkedList<Double> numbers = ReadFile(path);
		Double mean = mean(numbers);
		Double desviation = deviation(numbers, mean);
		ArrayList<Double> result = new ArrayList<Double>();
		result.add(mean);
		result.add(desviation);
		return result;
	}

	/**
	 * Lee un archivo contenido solo por numeros
	 * 
	 * @param path direccion del archivo a leer
	 * @return devuelve una lista con todos los numeros leidos
	 */
	public LinkedList<Double> ReadFile(String path) {
		LinkedList<Double> lines = new LinkedList<Double>();
		String line;
		try {

			BufferedReader buffered = new BufferedReader(new FileReader(path));
			while ((line = buffered.readLine()) != null) {
				lines.push(Double.parseDouble(line));
			}
			buffered.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lines;
	}

	/**
	 * Determina la media de un conjunto de datos
	 * 
	 * @param list datos de numeros a procesar
	 * @return media de los datos
	 */
	private double mean(LinkedList<Double> list) {

		double value = 0.0;
		for (int x = 0; x < list.size(); x++) {
			value += list.getIndexOf(x);
		}
		value = value / list.size();
		return Math.round(value * 100.0) / 100.0;
	}

	/**
	 * Determina la desviacion de un conjunto de datos
	 * 
	 * @param list lista de numeros a procesar
	 * @param mean media de los datos
	 * @return desviacion de los datos
	 */

	private double deviation(LinkedList<Double> list, Double mean) {
		double value = 0.0;

		for (int x = 0; x < list.size(); x++) {
			value += Math.pow((list.getIndexOf(x) - mean), 2);
		}
		value = Math.sqrt(value / (list.size() - 1));
		return Math.round(value * 100.0) / 100.0;
	}

	public static void main(String a[]) {
		calculator = Calculator.getCalculator();
		String path = "./src/test/java/edu/escuelaing/arep/Prueba2";
		File archivo = new File(path);
		if (archivo.exists()) {
			ArrayList<Double> result = calculator.Execute(path);
			System.out.println(result.get(0));
			System.out.println(result.get(1));
		}

	}

}
