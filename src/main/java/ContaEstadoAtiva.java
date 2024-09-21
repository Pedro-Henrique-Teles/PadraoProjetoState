public class ContaAtiva extends ContaEstado {

    private ContaAtiva() {

    }
    private static ContaAtiva instance = new ContaAtiva();

    public static ContaAtiva getInstance() {
        return instance;
    }
    public String getEstado() {
        return "Conta Ativa";
    }
    public boolean bloqueada(Conta conta){
        conta.setEstado(Conta)
    }


}
