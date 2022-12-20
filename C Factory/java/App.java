import inter.Connection;

public class App{
    public static void main(String[] arg){
        ConnectionFactory factor=new ConnectionFactory();

        Connection cx1 = factor.getConnection("ORACLE");
		cx1.conectar();
		cx1.desconectar();

		Connection cx2 = factor.getConnection("MYSQL");
		cx2.conectar();
		cx2.desconectar();

		Connection cx3 = factor.getConnection("H2");
		cx3.conectar();
		cx3.desconectar();
    }
}