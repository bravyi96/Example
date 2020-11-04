package ru.bravyi.convertDigitToReverseArray;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        long digit = 348597;
        int[] array = convertDigitToReverseArray(Long.toString(digit));
        System.out.println(Arrays.toString(array));
    }

    private static int[] convertDigitToReverseArray(String digit) {
        int[] digits = new int[digit.length()];
        for (int i = digit.length() - 1, j = 0; i >= 0; i--) {
            digits[i] = Character.getNumericValue(digit.charAt(j++));
        }
        return digits;
    }
}
