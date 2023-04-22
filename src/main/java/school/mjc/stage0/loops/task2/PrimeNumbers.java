package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 2;
        while (counter <= printToInclusive) {
            if (counter > 1) {
                boolean isPrime = true;
                int i = 2;
                while (i <= Math.sqrt(counter)) {
                    if (counter % i == 0) {
                        isPrime = false;
                        break;
                    }
                    i++;
                }
                if (isPrime) System.out.println(counter);
            }
            counter++;
        }
    }
}
