package controleestacionamento;
/**
 * Classe utilizada para armazenar os dados do veículo.
 */
class Veiculo {
    private String placa; // Placa do veículo
    private String nomeCondutor; // Nome do condutor do veículo
    
    /**
     * Classe contrutora de Veiculo.
     * @param placa Armazena a placa do veículo
     * @param nomeCondutor  Armazeno o nome do condutor do veículo
     */
    public Veiculo(String placa, String nomeCondutor) { // Construtor da classe "veiculo" recebe como parâmentros uma string "placa" e uma string "nomeCondutor".
        this.placa = placa;
        this.nomeCondutor = nomeCondutor;
    }
    /**
     * Método utilizado para retornar a placa do veículo
     * @return Retorna a string contendo a placa do veículo
     */
    public String getPlaca() { // retorna o valor de "placa"
        return placa;
    }
    /**
     * Método utilizado para retornar o nome do condutor do veículo.
     * @return Retorna o nome do condutor do veículo.
     */
    public String getNomeCondutor() {  // retorna o valor de "nomeCondutor"
        return nomeCondutor;
    }
}
   