package controleestacionamento;
/**
 * Classe utilizada para gerenciar os métodos de controle do estacionamento.
 */
class Estacionamento {
    private Vaga[] vagas; // Array de vagas
    private final int capacidade = 15; // Delimitador de capacidade do estacionamento. 
    /**
     * Metódo utilizado para contruir um array de vagas, onde o número de vagas é definido pelo valor de "capacidade".
     */
    public Estacionamento() { // Construtor do "Estacionamento"
        vagas = new Vaga[capacidade]; // Instanciou um array com o tamanho de "capacidade" 15.
        for (int i = 0; i < capacidade; i++) { // Testa se o número de vagas está dentro da "capacidade" determinada na variavel "capacidade".
            vagas[i] = new Vaga(i + 1);
        }
    }
    /**
     * Método para dar entrada de um veículo, relacionando os dados de um veículo ao número de uma vaga.
     * @param placa Placa do veiculo
     * @param numeroVaga Número da vaga
     * @param nomeCondutor Nome do condutor do veículo
     * @return Faz a validação do número da vaga digitado e confere a disponibilidade, se tudo estiver dentro do esperado retorna true.
     */
    public boolean registrarVeiculo(String placa, int numeroVaga, String nomeCondutor) { // Faz a validação e testa a disponibilidade da vaga.
        if (numeroVaga < 1 || numeroVaga > capacidade || vagas[numeroVaga - 1].estaOcupada()) {
            return false;
        }
        Veiculo veiculo = new Veiculo(placa, nomeCondutor); // Caso a vaga esteja disponivel, instancia um veículo com os parâmentros de "placa" e "nomeCondutor" 
        vagas[numeroVaga - 1].ocupar(veiculo);
        return true;
    }
    /**
     * Método utilizado para desocupar uma vaga.
     * @param numeroVaga Numero da vaga
     * @return Faz a validação do numero da vaga digitado e confere se a vaga esta ocupada, se tudo estiver dentro do esperado retorna true.
     */
    public boolean desocuparVaga(int numeroVaga) { // Faz a validação e testa a disponibilidade da vaga.
        if (numeroVaga < 1 || numeroVaga > capacidade || !vagas[numeroVaga - 1].estaOcupada()) {
            return false;
        }
        vagas[numeroVaga - 1].desocupar(); // Caso a vaga esteja válida e ocupada, desocupa a vaga.
        return true;
    }
    /**
     * Método utilizado para listar as vagas disponíveis.
     */
    public void mostrarVagasDisponiveis() { // Mostra as vagas disponiveis
        System.out.println("Vagas disponíveis:");
        for (Vaga vaga : vagas) { //Percorre o Array "vagas" verificando a disponibilidade de cada endereço.
            if (!vaga.estaOcupada()) { // Testa a disponibilidade da vaga e caso estiver disponivel imprime o número referente.
                System.out.printf(vaga.getNumero() + ", ");
            }
        }
    }
    /**
     * Método utilizado para listar as vagas ocupadas.
     */
    public void mostrarVagasOcupadas() { // Lista as vagas ocupadas.
        System.out.println("Vagas ocupadas:");
        for (Vaga vaga : vagas) { //Percorre o Array "vagas" verificando a disponibilidade de cada endereço.
            if (vaga.estaOcupada()) { // Testa a disponibilidade da vaga e caso estiver ocupada imprime o número da vaga, a placa do veículo e o nome do condutor.
                System.out.println("Vaga " + vaga.getNumero() + " - Placa: " + vaga.getVeiculo().getPlaca() + " - Nome: " + vaga.getVeiculo().getNomeCondutor());
            }
        }
    }
}
