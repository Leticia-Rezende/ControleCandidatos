package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {" FELIPE", " MARCIA", " JULIA", " PAULO", " AUGUSTO"};
        for (String candidato : candidatos){
        
            entrandoEmContato(candidato);
        }
        
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
                else 
                System.out.println("\nContato realizado com sucesso");
        

        }while(continuarTentando && tentativasRealizadas < 3 ); // a quantidade de ligações será de 3 tentativas
    
        if (atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativas\n");
        else
            System.out.println("Não conseguimos contato com " + candidato + " , número maximo de tentativas " + tentativasRealizadas + " realizadas\n");


    }

    //método auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }


    static void imprimirSelecionados(){
        String [] candidatos = {" FELIPE", " MARCIA", " JULIA", " PAULO", " AUGUSTO"};
        System.out.println("\nImprimindo a lista de candidatos informando o indíce do elemento\n");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato(a) de nº " + (indice+1) + " é " + candidatos[indice]);
        }
        // System.out.println("Forma abreviada de interação for each, ou seja sem o indice");
        // for(String candidato: candidatos){
        //      System.out.println("O candidato selecionado foi" + candidato);
        //}
    }


    static void selecaoCandidatos() {
        String [] candidatos = {" FELIPE", " MARCIA", " JULIA", " PAULO", " AUGUSTO", " MONICA", " FABRICIO", " MIRELA", " DANIELA", " JOAQUIM"};
        
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) { // só poderá escolher 5 candidatosSelecionados daqueles que estão em candidatos, que são 10
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato(a)" + candidato + " Solicitou este valor de salario " + salarioPretendido + "\n" );
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato(a)" + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
                System.out.println("\n");
            
            }
            candidatoAtual++;
        }
    }
    
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200); //  o valor pretendido varia de  1800 à 2200
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        }else if (salarioBase == salarioPretendido)
            System.out.println("Ligar para o candidato com uma contra proposta");
        else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
        }
    
}





