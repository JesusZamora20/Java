package CatApp;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLOutput;

public class GatosService {
    public static void VerGatos() throws IOException {
        //1. traer los datos de la API
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://api.thecatapi.com/v1/images/search")
                .get()
                .build();

        Response response = client.newCall(request).execute();

        String elJson = response.body().string();

        //2. cortar los corchetes []
        elJson = elJson.substring(1, elJson.length()-1);

        //crear un objeto de la clase Gson
        Gson gson = new Gson();
        Cats gatos = gson.fromJson(elJson, Cats.class);

        //redimensionar la imagen en caso de q se requiera
        Image image = null;
        try{
            URL url = new URL(Cats.getUrl());
            image = ImageIO.read(url);
            ImageIcon fondoGato = new ImageIcon(image);

            if(fondoGato.getIconWidth() > 800){
                Image fondo = fondoGato.getImage();
                Image modificada = fondo.getScaledInstance(800, 600, Image.SCALE_SMOOTH);
                fondoGato = new ImageIcon(modificada);
            }

        }catch(IOException e){
            System.out.println(e);
        }

    }
}
