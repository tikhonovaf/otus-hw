package ru.otus.hw.generics;

public class BoxWithNumbers<N extends Number> {
    private N[] numbers;

    public BoxWithNumbers(N... numbers) {
        this.numbers = numbers;
    }

    public double avg() {
        double result = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i].doubleValue();
        }
        return result / numbers.length;
    }

    public boolean sameAvg(BoxWithNumbers<?> another) {
        if (another == null) {
            return false;
        }
        return Math.abs(this.avg() - another.avg()) < 0.001f;
    }
}