public class Carro {

    public String marca;
    public String modelo;
    public int anoFabricacao;

    /**
     *
     * @param marca informa a marca do carro
     * @param modelo informa o modelo do carro
     * @param anoFabricacao informa o ano de fabricação do carro
     */
    public void cadastrarCarro(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    //Retorna a marca do carro
    public String marcaCarro() {
        return marca;
    }
}
