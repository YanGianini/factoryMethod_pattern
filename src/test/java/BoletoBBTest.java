import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BoletoBBTest {

    @Test
    void deveEmitirBoletoBB(){
        IBoleto boleto = BoletoFactory.obterBoleto("BB");
        assertEquals("Boleto Banco do Brasil emitido!", boleto.emitir());
    }
}
