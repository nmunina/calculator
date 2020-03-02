package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Double> input = new ArrayList<Double>();
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static double memory;

    public static void main(String[] args) throws IOException {
	// write your code here
        System.out.println("Välkommen till miniräknare.");
        selectOperation();
    }

    private static void selectOperation() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputOperation;
        do {
            showMenu();
            inputOperation = reader.readLine();
            if (inputOperation.equals("1")) {
                add(readInput());
            } else if (inputOperation.equals("2")) {
                subtract(readInput());
            } else if (inputOperation.equals("3")) {
                multiply(readInput());
            } else if (inputOperation.equals("4")) {
                divide(readInput());
            } else if (!inputOperation.equals("5")){
                System.out.println("Inget giltigt val försök igen!");
            }

        } while (!inputOperation.equals("5"));

        System.out.println("Tack och hej!");
        reader.close();
    }

    private static void showMenu() {
        System.out.println("Vad vill du göra?");
        System.out.println("1: Addera");
        System.out.println("2: Subtrahera");
        System.out.println("3: Multiplicera");
        System.out.println("4: Dividera");
        System.out.println("5: Avsluta");
        System.out.println("");
        System.out.println("Ange ditt val:");
    }

    private static ArrayList<Double> readInput() throws IOException {
        System.out.println("Hur många tal vill du räkna?");
        int numberOfVariables = Integer.parseInt(reader.readLine());

        for (int i = 0; i < numberOfVariables; i++) {
            System.out.println("Ange tal №" + (i + 1) + " :");
            input.add(Double.parseDouble(reader.readLine()));
        }

        return input;
    }

    public static void add(ArrayList<Double> input) {
        double result = input.get(0);
        for (int i = 0; i < (input.size() - 1); i++)  {
            result += input.get(i+1);
        }

        System.out.println("Result = " + result);
        System.out.println("");
        memory = result;
        input.clear();
    }

    public static void subtract(ArrayList<Double> input) {
        double result= input.get(0);
        for (int i = 0; i < (input.size() - 1); i++) {
            result = result - input.get(i+1);
        }

        System.out.println("Result = " + result);
        System.out.println("");
        memory = result;
        input.clear();
    }

    public static void multiply(ArrayList<Double> input) {
        double result = input.get(0);
        for (int i = 0; i < (input.size() - 1); i++) {
            result = result * input.get(i+1);
        }

        System.out.println("Result = " + result);
        System.out.println("");
        memory = result;
        input.clear();
    }

    public static void divide(ArrayList<Double> input) {
        double result = input.get(0);
        for (int i = 0; i < (input.size() - 1); i++) {
            result = result / input.get(i+1);
        }

        System.out.println("Result = " + result);
        System.out.println("");
        memory = result;
        input.clear();
    }
}
