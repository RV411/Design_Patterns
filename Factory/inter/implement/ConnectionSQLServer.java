package inter;

public class ConnectionSQLServer implements Connection {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConnectionSQLServer() {
		this.host = "localhost";
		this.puerto = "1521";
		this.usuario = "admin";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		// Aqui puede ir código JDBC
		System.out.println("Se conectó a SQLServer");

	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectó de SQLServer");
	}

	@Override
	public String toString() {
		return "ConnectionSQLServer [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}

}