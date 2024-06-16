package controleestacionamento;
/**
 * Classe utilizada para guardar os dados da vaga.
 */
class Vaga {
    private int numero; // Número da vaga
    private Veiculo veiculo; // Dados do veículo
    /**
     *  Classe construtora de vaga.
     * @param numero Recebe um número identificado para vaga. Este número deve ser maior que zero e menor que a capacidade do estacionamento.
     */
    public Vaga(int numero) { //Recebe um número de parâmetro para atribuir à vaga, e instancia um objeto do tipo veiculo.
        this.numero = numero;
        this.veiculo = null;    
    }
    /**
     * Metodo para retornar o veículo ocupante da vaga.
     * @return Retorna os dados do veículo que esta ocupando uma vaga.
     */
    public boolean estaOcupada() { // retorna o número indicador das vagas que estão diferente de nulas.
        return veiculo != null;
    }
    /**
     * Método para atribuir um objeto do tipo "veículo" ao endereço da "vaga" desejado
     * @param veiculo Objeto do tipo Veiculo que contem as informações do veículo.
     */
    public void ocupar(Veiculo veiculo) { // Atribui um objeto do tipo "veiculo" ao endereço de "vaga" desejado.
        this.veiculo = veiculo;
    }
    /**
     * Método utilizado para desocupar uma vaga.
     */
    public void desocupar() { // Atribui um valor nulo ao "veiculo" em um endereço de "vaga" que esteja ocupado.
        this.veiculo = null;
    }
    /**
     * Método utilizado para retornar o número identificador de uma vaga.
     * @return Retorna o número da vaga.
     */
    public int getNumero() { // Retorna o número da vaga.
        return numero;
    }
    /**
     * Metódo para retornar informações do veículo
     * @return Retornar um objeto do tipo veiculo.
     */
    public Veiculo getVeiculo() { // retorna um objeto do tipo veiculo.
        return veiculo;
    }
}