import inter;


public class ConnectionFactory {

	public Connection getConexion(String motor) {
		if (motor == null) {
			return new ConnectionVoid();
		}
		if (motor.equalsIgnoreCase("MYSQL")) {
			return new ConnectionMySQL();
		} else if (motor.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle();
		} else if (motor.equalsIgnoreCase("POSTGRE")) {
			return new ConexionPostgreSQL();
		} else if (motor.equalsIgnoreCase("SQL")) {
			return new ConnectionSQLServer();
		}

		return new ConnectionVoid();
	}
}