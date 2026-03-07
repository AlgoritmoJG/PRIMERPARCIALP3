public class Marcador {
    public static int score(int[] vnumbers) {
        if (vnumbers == null) return 0;
        int total = 0;
        for (int n : vnumbers) {
            if (n == 5) {
                total += 5;
            } else if (n % 2 == 0) {
                total += 1;
            } else {
                total += 3;
            }
        }
        return total;
    }
}
