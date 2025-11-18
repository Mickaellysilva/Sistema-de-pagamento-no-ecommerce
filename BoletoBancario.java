public class BoletoBancario extends Pagamento {
    private  String codigoBarras;
    private String validade;
    private String nomeCliente;

    public BoletoBancario(String validade, String codigoBarras, String nomeCliente) {
        this.codigoBarras = codigoBarras;
        this.validade = validade;
        this.nomeCliente = nomeCliente;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
       if(codigoBarras.length()<=13 && codigoBarras.length()>=8){
           this.codigoBarras = codigoBarras;
           System.out.println("Código de barras deferido");
       }
       else{
           System.out.println("Código de barras indeferido");
       }
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        if(validade != null || validade.isBlank()){
            this.validade = validade;
            System.out.println(" Validade definida.");

        }
        else{
            System.out.println("Validade não definida.");
        }
    }

    public void setNomeCliente(String nomeCliente) {
        if(nomeCliente.isBlank() || nomeCliente==null){
            System.out.println("O nome do cliente não está cadastrado");
        }
        else{
            this.nomeCliente = nomeCliente;
            System.out.println("Nome do cliente: " + nomeCliente);
        }
    }

    public void processarPagamento(double valor){
        System.out.println("Processar o pagamento do PIX");

        System.out.println("Nome do Cliente: " + getNomeCliente());
        System.out.println("Chave pix: " +getCodigoBarras() );
        System.out.println("Banco de origem: " +getValidade());
    }
}
