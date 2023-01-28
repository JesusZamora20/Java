public class Switch {
    public static void main(String[] args) {
        String colorModeSelected = "Dark";

        switch (colorModeSelected){
            case "Light":
                System.out.println("Ligth Mode Selected");
                break;
            case "Night":
                System.out.println("Seleccionaste Modo Noche");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste Modo Blue Dark");
                break;
            case "Dark":
                System.out.println("Seleccionaste Modo Dark");
                break;
            default:
                System.out.println("Selecciona una opcion correcta");
        }
    }
}
