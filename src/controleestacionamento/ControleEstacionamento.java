package controleestacionamento;
import java.util.Scanner;
/**
 * Classe principal, utilizada para direcionar o usuário conforme a opção desejada.
 * @author Eduardo Vitor, Hadriel Gomes, Juan Pablo
 */
public class ControleEstacionamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estacionamento estacionamento = new Estacionamento();
        boolean executando = true; // Enquanto (executando) for verdadeira ao final de cada operação o sistema retornará ao menu inicial.

        while (executando) {
            System.out.println("\nMenu:");
            System.out.println("1. Registrar veículo");
            System.out.println("2. Ver vagas ocupadas");
            System.out.println("3. Desocupar vaga");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();// Captura a opção inserida pelo usuário e direciona para a operação correspondente.
            scanner.nextLine();
            
            //O switch apresenta as opções para o usuário, e direciona para o case desejado.
            switch (opcao) {
                case 1: // Mostra vagas disponíveis e registra um novo veículo.
                    estacionamento.mostrarVagasDisponiveis(); //Chama o método "mostrarVagasDisponiveis" da classe "estacionamento", exibindo as vagas disponíveis.
                    System.out.print("\nDigite a placa do veículo: ");
                    String placa = scanner.nextLine();
                    System.out.print("Digite o nome do condutor do veículo: ");
                    String nomeCondutor = scanner.nextLine();
                    System.out.print("Digite o número da vaga (1-15): ");
                    int numeroVaga = scanner.nextInt();
                    
                    if (estacionamento.registrarVeiculo(placa, numeroVaga, nomeCondutor)) { //Testa a vaga digitada é valida e se esta ocupada.
                        System.out.println("Veículo registrado com sucesso:\n" + "Vaga: " + numeroVaga +"\nPlaca: " + placa + "\nNome: " +nomeCondutor);
                    } else {
                        System.err.println("Falha ao registrar veículo. Verifique se a vaga está disponível ou se o número da vaga é válido.");
                    }
                    break;
                case 2: // Exibe uma lista das vagas ocupadas.
                    estacionamento.mostrarVagasOcupadas();
                    break;
                case 3: // Exibe as informações das vagas ocupadas, e da a opção para o usuário retirar o carro.
                    estacionamento.mostrarVagasOcupadas();
                    System.out.print("Digite o número da vaga a desocupar (1-15): ");
                    numeroVaga = scanner.nextInt();
                    if (estacionamento.desocuparVaga(numeroVaga)) { // Testa se a vaga a ser desocupada esta realmente ocupada ou se o número digitado é válido.
                        System.out.println("Vaga " + numeroVaga + " desocupada com sucesso.");
                    } else {
                        System.err.println("Falha ao desocupar a vaga. Verifique se o número da vaga é válido e se está ocupada.");
                    }
                    break;
                case 4: // Finaliza o programa
                    executando = false;
                    System.out.println("Encerrando programa...");
                    break;
                default: // Verifica se o usuário digitou uma opção do case válida.
                    System.err.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close(); //encerra o scanner para evitar vazamento de memoria.
    }
}