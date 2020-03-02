//Uppgift av Natalia Munina. MVT 19-20

package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Calculator {
    public static ArrayList<Double> input;
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static double memory;
    public static String usersMenuChoice;

    public static void main(String[] args) throws IOException {
        System.out.println("Välkommen till miniräknare.");
        selectOperation();
        reader.close();
    }

    private static void selectOperation() throws IOException {
        do {
            showMenu();
            usersMenuChoice = reader.readLine();
            if (usersMenuChoice.equals("1")) {
                add(readInput());
            } else if (usersMenuChoice.equals("2")) {
                subtract(readInput());
            } else if (usersMenuChoice.equals("3")) {
                multiply(readInput());
            } else if (usersMenuChoice.equals("4")) {
                divide(readInput());
            } else if (!usersMenuChoice.equals("5")){
                System.out.println("Inget giltigt val försök igen!");
                System.out.println();
                continue;
            }

            if (!usersMenuChoice.equals("5")) {
            System.out.println("Result = " + memory);
            System.out.println();
            }

        } while (!usersMenuChoice.equals("5"));

        System.out.println();
        System.out.println("Tack och hej!");
    }

    private static void showMenu() {
        System.out.println("Vad vill du göra?");
        System.out.println("1: Addera");
        System.out.println("2: Subtrahera");
        System.out.println("3: Multiplicera");
        System.out.println("4: Dividera");
        System.out.println("5: Avsluta");
        System.out.println();
        System.out.println("Ange ditt val:");
    }

    private static ArrayList<Double> readInput() throws IOException {
        input = new ArrayList<Double>();
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

        memory = result;
    }

    public static void subtract(ArrayList<Double> input) {
        double result= input.get(0);
        for (int i = 0; i < (input.size() - 1); i++) {
            result = result - input.get(i+1);
        }

        memory = result;
    }

    public static void multiply(ArrayList<Double> input) {
        double result = input.get(0);
        for (int i = 0; i < (input.size() - 1); i++) {
            result = result * input.get(i+1);
        }

        memory = result;
    }

    public static void divide(ArrayList<Double> input) {
        double result = input.get(0);
        for (int i = 0; i < (input.size() - 1); i++) {
            result = result / input.get(i+1);
        }

        memory = result;
    }
}
