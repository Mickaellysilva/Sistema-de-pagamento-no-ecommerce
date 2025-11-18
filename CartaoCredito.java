public  class CartaoCredito extends Pagamento {
    private String numeroCartao;
    private String nomeTitular;
    private String validade;
    private String cvv;
    private int parcelas;

    public CartaoCredito(String numeroCartao, String nomeTitular, String validade, String cvv, int parcelas) {
        this.numeroCartao =  numeroCartao;
        this.nomeTitular =  nomeTitular;
        this.validade = validade;
        this.cvv = cvv;
        this.parcelas = parcelas;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        if(numeroCartao.length()==10 || numeroCartao.length()<20){
            this.numeroCartao = numeroCartao;
            System.out.println("Número do cartão de crédito aceito.");
        }
        else{
            System.out.println("Número regeitado.");
        }
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular() {
        if(nomeTitular!=null || !(nomeTitular.isBlank())){
            this.nomeTitular = nomeTitular;
            System.out.println("Nome do titular validado.");
        }
        else{
            System.out.println("Nome do titular inválido.");
        }
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        if(cvv.length()==3){
            this.cvv = cvv;
            System.out.println("CVV válido!");
        }
        else{
            System.out.println("CVV inválido, o cvv tem que ter exatas 3 caracteres");
        }
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

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public void processarPagamento(double valor){
        System.out.println("Processar o pagamento do cartão de crédito");

        System.out.println("Nome do titular: " +getNomeTitular() );
        System.out.println("Numero do cartão: " +getNumeroCartao());
        System.out.println("Validade : " +getParcelas());
        System.out.println("CVV: " +getCvv());
    }
}
