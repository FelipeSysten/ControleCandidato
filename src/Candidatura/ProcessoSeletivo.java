package Candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		imprimirSelecionados();
	}
        
        static void imprimirSelecionados() {
            String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
            
            System.out.println("Imprimindo a lista de Candidatos e informando o indice do elemento ");
            
            for(int indice=0; indice < candidatos.length; indice++){
            System.out.println("O Candidato de n " + (indice+1) + " é o " + candidatos[indice]);
            }
            
             System.out.println("Forma de abreviação chamada for earch");
            
            for(String candidato: candidatos){
                 System.out.println("O Candidato selecionado foi " + candidato);
            }
        }
	
	static void selecaoCandidatos() {
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "MIRELA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
	
		int candidatosSelecionados = 0;
		int candidatosAtual=0;
		double salarioBase=2000.0;
		while(candidatosSelecionados < 5) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidato (double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA CANDIDATO");
		} else if(salarioBase==salarioPretendido)
			System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
		else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}
