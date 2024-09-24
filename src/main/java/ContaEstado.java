public abstract class ContaEstado {

    public abstract String getEstado();

    public boolean ativa(Conta conta){
        return false;
    }

    public boolean bloqueada(Conta conta){
        return false;
    }

    public boolean encerrada(Conta conta){
        return false;
    }
}
