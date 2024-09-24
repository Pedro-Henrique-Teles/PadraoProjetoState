import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContaTest {

    Conta conta;

    @BeforeEach
    public void setUp(){
        conta = new Conta();
    }

    // Conta Ativa

    @Test
    public void naoDeveAtivarContaAtiva(){
        conta.setEstado(ContaEstadoAtiva.getInstance());
        assertFalse(conta.ativa());
    }
    @Test
    public void deveBloquearContaAtiva(){
        conta.setEstado(ContaEstadoAtiva.getInstance());
        assertTrue(conta.bloqueada());
        assertEquals(ContaEstadoBloqueada.getInstance(), conta.getEstado());
    }
    @Test
    public void naoDeveEncerrarContaAtivaSemAntesBloquear(){
        conta.setEstado(ContaEstadoAtiva.getInstance());
        assertFalse(conta.encerrada());
    }

    //Conta Bloqueada

    @Test
    public void deveAtivarContaBloqueada(){
        conta.setEstado(ContaEstadoBloqueada.getInstance());
        assertTrue(conta.ativa());
        assertEquals(ContaEstadoAtiva.getInstance(), conta.getEstado());
    }
    @Test
    public void naoDeveBloquearContaBloqueada(){
        conta.setEstado(ContaEstadoBloqueada.getInstance());
        assertFalse(conta.bloqueada());
    }
    @Test
    public void deveEncerrarContaBloqueada(){
        conta.setEstado(ContaEstadoBloqueada.getInstance());
        assertTrue(conta.encerrada());
        assertEquals(ContaEstadoEncerrada.getInstance(), conta.getEstado());
    }

    //Conta Encerrada

    @Test
    public void naoDeveAtivarContaEncerrada() {
        conta.setEstado(ContaEstadoEncerrada.getInstance());
        assertFalse(conta.ativa());
        assertEquals(ContaEstadoEncerrada.getInstance(), conta.getEstado());
    }
    @Test
    public void naoDeveBloquearContaEncerrada(){
        conta.setEstado(ContaEstadoEncerrada.getInstance());
        assertFalse(conta.bloqueada());
    }
    @Test
    public void naoDeveEncerrarContaEncerrada(){
        conta.setEstado(ContaEstadoEncerrada.getInstance());
        assertFalse(conta.encerrada());
        assertEquals(ContaEstadoEncerrada.getInstance(),conta.getEstado());
    }
}
