package mensajes_app;

import java.util.Scanner;

public class MensajesService {
    public static void createMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();

        System.out.println("Escribe tu nombre");
        String nombre = sc.nextLine();

        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);
        MensajesDAO.createMessage(registro);
    }

    public static void listMessages(){
        MensajesDAO.readMessage();
    }

    public static void deleteMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("indica el ID del mensaje a borrar");
        int id_mensaje = sc.nextInt();
        MensajesDAO.deleteMessage(id_mensaje);
    }

    public static void editMessage(){

    }
}
