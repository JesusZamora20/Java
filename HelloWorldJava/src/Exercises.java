public class Exercises {
    public static void main(String[] args) {
        char c = 'z';
        int d = (int) c;
        System.out.println(d);

        int i = 250;
        
        long a = (long) i;
        short b = (short) a;
        System.out.println(a);
        System.out.println(b);

        int num = 100;
        float iF = (float) num;
        iF += 5000.66;
        System.out.println(iF);

        double da = 298.638;
        long as = (long) da /25;
        System.out.println(as);
    }
}
