public class tribonacci {
    public static int[]
    		tribonacci(int[] signature, int n) {
    	
        if (n == 0) {
            return new int[0];
        }
        if (n < 3) {
            int[] valor = new int[n];
            for (int i = 0; i < n; i++) valor[i] = signature[i];
            return valor;
        }
        int[] valor = new int[n];
        valor[0] = signature[0];
        valor[1] = signature[1];
        valor[2] = signature[2];
        for (int i = 3; i < n; i++) {
        	valor[i] = valor[i - 1] + valor[i - 2] + valor[i - 3];
        }
        return valor;
    }
}
