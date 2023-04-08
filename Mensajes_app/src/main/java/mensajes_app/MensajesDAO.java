package mensajes_app;

import com.mysql.cj.x.protobuf.MysqlxPrepare;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajesDAO {
    public static void createMessage(Mensajes mensaje){
        Conexion db_connect = new Conexion();

        try(Connection conexion = db_connect.get_connection()) {
            PreparedStatement ps = null;
            try{
                String query="INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?,?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutor_mensaje());
                ps.executeUpdate();
                System.out.println("mensaje creado");
            }catch(SQLException ex){
                System.out.println(ex);
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void readMessage(){
        Conexion db_connect = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try(Connection conexion = db_connect.get_connection()) {
            String query = "SELECT * FROM mensajes";
            ps = conexion.prepareStatement(query);
            rs=ps.executeQuery();

            while(rs.next()){
                System.out.println("ID: " + rs.getInt("id_mensaje"));
                System.out.println("mensaje: " + rs.getString("mensaje"));
                System.out.println("Autor: " + rs.getString("autor_mensaje"));
                System.out.println("Fecha: " + rs.getString("fecha_mensaje"));
                System.out.println("");
            }


        }catch (SQLException e){
            System.out.println("data can't be recovered");
            System.out.println(e);
        }
    }

    public static void deleteMessage(int id_mensaje){
        Conexion db_connect = new Conexion();

        try(Connection conexion = db_connect.get_connection()) {
            PreparedStatement ps = null;
            try{
                String query = "DELETE FROM mensajes WHERE id_mensaje = ?";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, id_mensaje);
                ps.executeUpdate();
                System.out.println("Message succesfully deleted");
            }
            catch(SQLException e){
                System.out.println(e);
                System.out.println("Message couldn't be deleted");
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }

    public static void updateMessage(Mensajes mensaje){

    }
}
