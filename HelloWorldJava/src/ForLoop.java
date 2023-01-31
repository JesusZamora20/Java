public class ForLoop {
    static boolean isTurnOnLight = false;
    
    public static void main(String[] args) {
        turnOnOffLight();

        for (int i = 1; i <= 10; i++) {
            SOS();
        }
    }

    public static void SOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOffLight(){
        isTurnOnLight = (isTurnOnLight)? false:true;
        return isTurnOnLight;
    }
}
