package ru.bravyi.convertDigitToReverseArray;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        int digit = 348597;
        int[] array = convertDigitToReverseArray(Integer.toString(digit));
        System.out.println(Arrays.toString(array));
    }

    private static int[] convertDigitToReverseArray(String digit) {
        int[] digits = new int[digit.length()];
        for (int i = digit.length() - 1; i >= 0; i--) {
            digits[i] = Character.getNumericValue(digit.charAt(i));
        }
        return digits;
    }
}
