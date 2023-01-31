public class Functions {
    public static void main(String[] args) {
        System.out.println(CircleArea(4));
        System.out.println(SphereArea(4));
        System.out.println(VolumeSphere(4));
        System.out.println(convertToDollar(50000, "COP"));
    }

    public static double CircleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double SphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double VolumeSphere(double r){
        return 4/3 * Math.PI * Math.pow(r,3);
    }


    public static double convertToDollar(double quantity, String currency){
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}
