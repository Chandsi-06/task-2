package com.findminmax;

import java.util.List;
import java.util.Scanner;

public class Main g{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberProcessor processor = new NumberProcessor();

        System.out.println("Enter numbers (type 'done' to finish):");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();

            if ("done".equalsIgnoreCase(input.trim())) break;

            try {
                double number = Validator.parseInput(input);
                processor.addNumber(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        List<Double> numbers = processor.getNumbers();

        if (numbers.isEmpty()) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("\nResults:");
            System.out.println("Total Numbers: " + numbers.size());
            System.out.println("Maximum: " + processor.findMax());
            System.out.println("Minimum: " + processor.findMin());
        }

        scanner.close();
    }
}
