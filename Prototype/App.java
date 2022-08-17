public class App{
    public static void main(String[] args){
        CuentaImpl cuentahorro=new CuentaImpl();
        cuentahorro.setMonto(200);
        CuentaImpl cuentaclonada = (CuentaImpl) cuentahorro.clonar();

        if(cuentaclonada!=null){
            System.out.println(cuentaclonada);
        }

        //*verificar si es la misma direccion de memoria
        System.out.println(cuentaclonada==cuentahorro);
    }
}