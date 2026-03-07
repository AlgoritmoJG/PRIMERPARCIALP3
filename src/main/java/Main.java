
public class Main {
    public static void main(String[] args) {
        int[] signature = {0, 0, 1};
        int n = 9;
        int[] result = tribonacci.tribonacci(signature, n);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
        System.out.println();
    }
}
