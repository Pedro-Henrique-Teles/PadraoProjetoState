public class Conta {

    private String conta;
    private ContaEstado estado;

    public Conta(){
        this.estado = ContaEstadoAtiva.getInstance();
    }

    public void setEstado(ContaEstado estado) {
        this.estado = estado;
    }

    public boolean ativa() {
        return estado.ativa(this);
    }
    public boolean bloqueada(){
        return estado.bloqueada(this);
    }
    public boolean encerrada(){
        return estado.encerrada(this);
    }






    public String getContaEstado(){
        return estado.getEstado();
    }
    public String getConta(){
        return conta;
    }
    public void setConta(String conta){
        this.conta = conta;
    }
    public ContaEstado getEstado(){
        return estado;
    }

}
