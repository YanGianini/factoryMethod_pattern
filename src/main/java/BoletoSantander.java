public class BoletoSantander implements IBoleto{

    public String emitir() {
        return "Boleto Santander emitido!";
    }
    public String cancelar() {
        return "Boleto Santander cancelado";
    }
}
