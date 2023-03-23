public class BoletoFactory {

    public static IBoleto obterBoleto(String banco) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("Boleto" + banco);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Banco inexistente");
        } if (!(objeto instanceof IBoleto)) {
            throw new IllegalArgumentException("Banco invalido");
        }
        return (IBoleto) objeto;
    }
}
