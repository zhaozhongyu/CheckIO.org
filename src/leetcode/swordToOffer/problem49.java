package leetcode.swordToOffer;

public class problem49 {
    /**
     * 我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。
     *
     *  
     *
     * 示例:
     *
     * 输入: n = 10
     * 输出: 12
     * 解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。
     * */
    public int nthUglyNumber(int n) {
        int a = 0, b = 0, c = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for(int i = 1; i < n; i++) {
            int n2 = dp[a] * 2, n3 = dp[b] * 3, n5 = dp[c] * 5;
            dp[i] = Math.min(Math.min(n2, n3), n5);
            if(dp[i] == n2) a++;
            if(dp[i] == n3) b++;
            if(dp[i] == n5) c++;
        }
        return dp[n - 1];
    }

    public static void main(String[] a) {
        for (int i = 1; i < 10000; i ++) {
            int num2 = 0;
            int tmp = i;
            while(tmp % 2 == 0) {
                tmp = tmp / 2;
                num2++;
            }
            int num3 = 0;
            while(tmp % 3 == 0) {
                tmp = tmp / 3;
                num3 ++;
            }

            int num5 = 0;
            while(tmp % 5 == 0) {
                tmp = tmp / 5;
                num5 ++;
            }
            if (tmp == 1) {
                System.out.print(num2);
                System.out.print(", ");
                System.out.print(num3);
                System.out.print(", ");
                System.out.print(num5);
                System.out.print(", ");
                System.out.println(i);
            }

        }
    }
}
