import inter.FabricaAbstracta;
import inter.IConexionBD;
import inter.IConexionREST;
import inter.impl.ConexionRESTCompras;
import inter.impl.ConexionRESTNoArea;

public class ConexionRESTFabrica implements FabricaAbstracta {

	@Override
	public IConexionREST getREST(String area) {
		if (area == null) {
			return new ConexionRESTNoArea();
		}
		if (area.equalsIgnoreCase("COMPRAS")) {
			return new ConexionRESTCompras();
		}

		return new ConexionRESTNoArea();
	}

	@Override
	public IConexionBD getBD(String motor) {
		return null;
	}
}