package mensajes_app;

import java.sql.Connection;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option = 0;

        do{
            System.out.println("------------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1. crear mensaje");
            System.out.println("2. Listar mensajes");
            System.out.println("3. editar mensaje");
            System.out.println("4. eliminar mensaje");
            System.out.println("5. salir");

            option = sc.nextInt();

            switch (option){
                case 1:
                    MensajesService.createMessage();
                    break;
                case 2:
                    MensajesService.listMessages();
                    break;
                case 3:
                    MensajesService.editMessage();
                    break;
                case 4:
                    MensajesService.deleteMessage();
                    break;
                default:
                    break;
            }
        }while(option != 5);
    }
}
