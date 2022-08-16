package inter;

public class ConnectionMySQL implements Connection{
    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConnectionMySQL(){
        this.host="localhost";
        this.puerto="3306";
        this.usuario="root";
        this.constrasena="root";
    }

    @Override
    public void conectar(){
        System.out.println("Se conecto a MySQL");
    }

    @Override
    public void desconectar(){
        System.out.println("Se desconecto a MySQL");
    }

    @Override
    public String toString(){
        return "Connection MySQL [host="+host+",puerto="
        +puerto+",usuario="+usuario+", contraseña"+constrasena+"]";
    }
}