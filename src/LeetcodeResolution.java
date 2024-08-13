public class LeetcodeResolution {
    public static void main(String[] args) {
        int[] array = {0,1,1,1,0,0};
        int resultado = minOperations(array);

        System.out.println(resultado);

    }

    public static int minOperations(int[] nums) {
        int contador = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == (nums.length - 3)) {
                int soma = nums[i] + nums[i+1] + nums[i+2];
                if (soma > 0 && soma < 3) {
                    contador = -1;
                    break;
                }
            }

            if (nums[i] == 1) {
                continue;
            }



            nums[i] ^= 1;
            nums[i+1] ^= 1;
            nums[i+2] ^= 1;

            ++contador;
        }

        return contador;
    }
}
