
import java.math.BigInteger;

class Solution {
    public int maxLength(int[] nums) {

        int max = 1;

        for (int i = 0; i < nums.length; i++) {

            BigInteger product = BigInteger.ONE;
            BigInteger gcd = BigInteger.ZERO;
            BigInteger lcm = BigInteger.ONE;

            for (int j = i; j < nums.length; j++) {

                BigInteger num = BigInteger.valueOf(nums[j]);

                product = product.multiply(num);

                gcd = gcd.gcd(num);

                lcm = lcm.divide(lcm.gcd(num)).multiply(num);

                if (product.equals(gcd.multiply(lcm))) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }

        return max;
    }
}
