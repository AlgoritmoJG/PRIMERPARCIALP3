public class Main2 {
    public static void main(String[] args) {
        int[][] tests = {
            {4, 5, 8, 4, 7},
            {30, 15, 21},
            {3, 5, 5},
            {0, 0, 4}
        };

        for (int[] t : tests) {
            System.out.println(java.util.Arrays.toString(t) + " -> " + Marcador.score(t));
        }
        System.out.println("null -> " + Marcador.score(null));
    }
}
