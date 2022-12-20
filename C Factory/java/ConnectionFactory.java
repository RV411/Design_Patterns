import inter.implement.ConnectionVoid;
import inter.implement.ConnectionMySQL;
import inter.implement.ConnectionOracle;
import inter.implement.ConnectionPostgreSQL;
import inter.implement.ConnectionSQLServer;
import inter.Connection;

public class ConnectionFactory {

	public Connection getConnection(String motor) {
		if (motor == null) {
			return new ConnectionVoid();
		}
		if (motor.equalsIgnoreCase("MYSQL")) {
			return new ConnectionMySQL();
		} else if (motor.equalsIgnoreCase("ORACLE")) {
			return new ConnectionOracle();
		} else if (motor.equalsIgnoreCase("POSTGRE")) {
			return new ConnectionPostgreSQL();
		} else if (motor.equalsIgnoreCase("SQL")) {
			return new ConnectionSQLServer();
		}

		return new ConnectionVoid();
	}
}