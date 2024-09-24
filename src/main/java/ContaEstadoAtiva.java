public class ContaEstadoAtiva extends ContaEstado {

    private ContaEstadoAtiva() {

    }
    private static ContaEstadoAtiva instance = new ContaEstadoAtiva();

    public static ContaEstadoAtiva getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Conta Ativa";
    }

    public boolean bloqueada(Conta conta){
        conta.setEstado(ContaEstadoBloqueada.getInstance());
        return true;
    }

    //Como a conta ativa não pode ser encerrada sem antes ser bloqueada, eu não vou mudar o estado dela.
    public boolean encerrada(Conta conta){
        return false;
    }




}
