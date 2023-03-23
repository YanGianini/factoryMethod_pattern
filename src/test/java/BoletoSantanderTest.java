import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoletoSantanderTest {
    @Test
    void deveEmitirBoletoSantander(){
        IBoleto boleto = BoletoFactory.obterBoleto("Santander");
        assertEquals("Boleto Santander emitido!", boleto.emitir());
    }
}
