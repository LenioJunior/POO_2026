package Heranca.Interface;

public class Oracle implements IDatabase {

    @Override
    public boolean conectar() {
        return true;
    }

    @Override
    public Object consultar() {
        return true;
    }
    
}
