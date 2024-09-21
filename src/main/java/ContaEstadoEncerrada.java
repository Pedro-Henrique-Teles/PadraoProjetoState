public class ContaEstadoTrancada extends ContaEstado{

    private ContaEstadoTrancada(){}
    private static ContaEstadoTrancada instace = new ContaEstadoTrancada();
    private static ContaEstadoTrancada getInstance(){
        return instace;
    }

    public String getEstado(){
        return "Trancado";
    }

    public boolean ativa (Conta conta){
        conta.setEstado(ContaEstadoAtiva.getInstance());
        return false;
    }

    public boolean


}
