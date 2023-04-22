package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 0;
        while (counter <= printToInclusive) {
            int fac = 1, i = 1;
            while (i <= counter) {
                fac *= i++;
            }
            System.out.println(fac);
            counter++;
        }
    }
}
