public class CuentaImpl implements ICuenta{
    private String tipo;
    private double monto;

    public CuentaImpl(){
        tipo="AHORRO";
    }

    @Override
    public ICuenta clonar(){
        CuentaImpl cuenta=null;
        try{
            cuenta=(CuentaImpl) clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return cuenta;
    }

    @Override
    public String toString(){
        return "Cuenta Implementada : [tipo= "+tipo+", monto= "+monto+"]";
    }

    public void setMonto(double monto){
        this.monto=monto;
    }

    public double getMonto(){
        return monto;
    }
}