public class BoletoBB implements IBoleto{

    public String emitir() {
        return "Boleto Banco do Brasil emitido!";
    }
    public String cancelar() {
        return "Boleto Banco do Brasil cancelado";
    }
}
