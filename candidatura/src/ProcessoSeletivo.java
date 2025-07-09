
// package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {

        String[] candidatos = { "FELIPE", "SAMUEL", "PEDRO", "PAULO", "OLIVER", "MARIA", "JULIA" };

        for (String candidato : candidatos) {

            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false;

            do {
                atendeu = atender();

                continuarTentando = !atendeu;

                if (continuarTentando) {
                    tentativasRealizadas++;
                } else
                    System.out.println("CONTATO REALIZADO COM SUCESSO");
            } while (continuarTentando && tentativasRealizadas < 3);

            if (atendeu)
                System.out
                        .println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
            else
                System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + "NÚMERO MAXIMO TENTATIVAS "
                        + tentativasRealizadas);

        }
    }

    static void entrandoEmContato(String candidato) {

    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "FELIPE", "SAMUEL", "PEDRO", "PAULO", "OLIVER", "MARIA", "JULIA" };

        System.out.println("Imprimindo a lista de canditos informando o indice do elemento");

        for (int indece = 0; indece < candidatos.length; indece++) {
            System.out.println(" O candidato e nº " + indece + " é " + candidatos[indece]);
        }

        System.out.println("Forma abrevida de interação for each");

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "FELIPE", "SAMUEL", "PEDRO", "PAULO", "OLIVER", "MARIA", "JULIA" };

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPredetendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: R$" + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }

            candidatosAtual++;
        }
    }

    static double valorPredetendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

}
