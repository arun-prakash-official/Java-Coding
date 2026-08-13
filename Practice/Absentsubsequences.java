import java.util.*;
class Absentsubsequences {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int mod = 1_000_000_007;
        int[] f = new int[n + 2];
        for (int i = 0; i < n; i++) f[sc.nextInt()]++;
        sc.close();
        long ans = 0, p = 1;
        for (int i = 1; i <= n + 1; i++) {
            ans = (ans + p) % mod;
            p = p * (1 + f[i]) % mod;
        }
        System.out.println(ans);
    }
}
