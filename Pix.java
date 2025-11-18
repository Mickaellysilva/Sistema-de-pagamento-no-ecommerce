public class Pix extends Pagamento{
    private String  chavePix;
    private String bancoOrigem;

    public Pix(String chavePix, String bancoOrigem) {
        this.chavePix = chavePix;
        this.bancoOrigem = bancoOrigem;
    }

    public String getBancoOrigem() {
        return bancoOrigem;
    }

    public void setBancoOrigem(String bancoOrigem) {
        if(bancoOrigem!=null || !(bancoOrigem.isBlank())){
            this.bancoOrigem = bancoOrigem;
            System.out.println("Bando de origem identificado");
        }
        else{
            System.out.println("Banco de origem não identificado.");
        }
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        if(chavePix==null){
            System.out.println("Não há chave pix registrada");
        }
    }

    public void processarPagamento(double valor){
        System.out.println("Processar o pagamento do PIX");

        System.out.println("Chave pix: " +getChavePix() );
        System.out.println("Banco de origem: " +getBancoOrigem());

    }
}
