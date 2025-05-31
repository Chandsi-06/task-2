package com.findminmax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberProcessor {
    private final List<Double> numbers;

    public NumberProcessor() {
        numbers = new ArrayList<>();
    }

    public void addNumber(double number) {
        numbers.add(number);
    }

    public List<Double> getNumbers() {
        return numbers;
    }

    public double findMax() {
        return Collections.max(numbers);
    }

    public double findMin() {
        return Collections.min(numbers);
    }
}
