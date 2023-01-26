public class MathematicsOperations {
    public static void main(String[] args) {
        double x = 2.2;
        double y = 3;

        //Devuelve un entero hacia arriba
        System.out.println(Math.ceil(x));
        //Devuelve un entero hacia Abajio
        System.out.println(Math.floor(x));

        //devuelve un numero elevado a otro
        System.out.println(Math.pow(x,y));

        //devuelve el numero mayor
        System.out.println("El numero mayor es" + y);

        //raiz cuadrada
        System.out.println("La raiz cuadrada de " + y + " es "+ Math.sqrt(y));
    }
}
