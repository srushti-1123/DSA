public class PowSolution {
    public static double myPow(double x, int n) {
        double ans = Math.pow(x, n);
        return ans;
    }
    public static void main(String[] args) {
        double x = 2.00000, n = 10;
        double ans = myPow(2.00000,10);
        System.out.println("Power of x is: " + ans);
    }
}
