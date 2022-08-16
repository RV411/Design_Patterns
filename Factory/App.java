package inter;

public class App{
    public static void main(String[] arg){
        ConnectionFactory factor=new ConnectionFactory();

        Connection cx1 = factor.getConexion("ORACLE");
		cx1.conectar();
		cx1.desconectar();

		Connection cx2 = factor.getConexion("MYSQL");
		cx2.conectar();
		cx2.desconectar();

		Connection cx3 = factor.getConexion("H2");
		cx3.conectar();
		cx3.desconectar();
    }
}