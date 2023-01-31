public class DataTypes {
    public static void main(String[] args) {

        //10 digits max
        int n = 918723612;
        long nL = 198375641234L;

        float nF = 1341234.1235123F;
        double nD = 123234.56456;

        //using var in java
        //var salary = 1000;
        System.out.println(nL);

        //increase and decrease
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives);

        int gift = 100 + ++lives;
        System.out.println(gift);
    }
}
