package inter;

public class ConnectionVoid implements Connection{

    @Override
    public void conectar(){
        System.out.println("No se especifico");
    }

    @Override
    public void desconectar(){
        System.out.println("No se especifico");
    }

}