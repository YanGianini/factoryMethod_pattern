import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class BoletoFactoryTest {
    @Test
    void deveRetornarExcecaoBancoInexistente(){
        try{
            IBoleto boleto = BoletoFactory.obterBoleto("Itaú");
            fail();
        }catch (IllegalArgumentException e) {
            assertEquals("Banco inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoBancoInvalido() {
        try{
            IBoleto boleto = BoletoFactory.obterBoleto("NuBank");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Banco invalido", e.getMessage());
        }
    }
}
