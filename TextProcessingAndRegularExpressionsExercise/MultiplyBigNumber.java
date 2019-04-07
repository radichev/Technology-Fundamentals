package TechModule.TextProcessingAndRegularExpressionsExercise;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger bi = scanner.nextBigInteger();
        BigInteger multiplayer = scanner.nextBigInteger();

        System.out.println(bi.multiply(multiplayer));
    }
}
