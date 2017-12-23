/*Shafali Gupta
APCS1 pd8
HW12 -- stAtistically sPeaking
2017-10-05 */    

public class Stats {
    public static int mean(int a, int b) {
    int c = a + b;
    c /= 2;
    return c;
    }
    public static double mean(double a, double b) {
    double c = a + b;
    c /= 2;
    return c;
    }
    public static int max(int a, int b) {
    if (a >= b) {
        return a;
    }
    return b;
    }
    public static double max(double a, double b) {
    if (a >= b) {
        return a;
    }
    return b;
    }
    public static int geoMean(int a, int b) {
    int c = (a * b);
    return (int) Math.sqrt(c);
    }
    public static double geoMean(double a, double b) {
    double c = (a * b);
    return Math.sqrt(c);
    }
    public static void main(String[] args) {
    System.out.println(mean(11,13)); //Output 12
    System.out.println(mean(9.5,10.5)); //Output 10.0?
    System.out.println(max(15,18)); //Output 18?
    System.out.println(max(567.89,1234.123)); //Output 1234.23?
    System.out.println(geoMean(32,2)); //Output 8?
    System.out.println(geoMean(12.5, 2.0)); //Output 5?
    }
}
