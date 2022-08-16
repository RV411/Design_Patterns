package inter.implement;
import inter.Connection;

public class ConnectionPostgreSQL implements Connection {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConnectionPostgreSQL() {
		this.host = "localhost";
		this.puerto = "1521";
		this.usuario = "admin";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		// Aqui puede ir código JDBC
		System.out.println("Se conectó a PostgreSQL");

	}

	@Override
	public void desconectar() {
		System.out.println("Se desconectó de PostgreSQL");
	}

	@Override
	public String toString() {
		return "ConnectionPostgreSQL [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
	}

}