
public class App{
    public static void main(String[] args){
        Singleton s= Singleton.getInstancia();
        //Queda prohibido por ser private
        //Singleton s=new Singleton();
        boolean ans= s instanceof Singleton;
        System.out.println(ans);
        
        s.conectar();
        s.desconectar();
        

    }
}