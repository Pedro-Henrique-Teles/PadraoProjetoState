public class ContaEstadoBloqueada extends ContaEstado {

    private ContaEstadoBloqueada() {
    }

    private static ContaEstadoBloqueada instance = new ContaEstadoBloqueada();

    public static ContaEstadoBloqueada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Bloqueada";
    }
    public boolean ativa(Conta conta) {
        conta.setEstado(ContaEstadoAtiva.getInstance());
        return true;
    }
    public boolean encerrada (Conta conta) {
        conta.setEstado(ContaEstadoEncerrada.getInstance());
        return true;
    }
}
