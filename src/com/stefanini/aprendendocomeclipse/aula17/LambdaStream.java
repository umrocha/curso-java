package com.stefanini.aprendendocomeclipse.aula17;

import java.util.SplittableRandom;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;


public class LambdaStream {
	static int gerarIdade(int min, int max) {
		return new SplittableRandom().nextInt(min,max);
		
	}
	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Alice", "Bernardo", "Carlos", "Dani", "Eliza", "Fábio", "Gustavo");
	
		System.out.println("Lista de Nomes:");
		nomes.forEach((n)-> System.out.println(n));
		
		System.out.println("\nLista de Pessoas:");
		List<Pessoa> pessoas = nomes.stream().map((n) -> new Pessoa(n, gerarIdade(15, 30))).collect(Collectors.toList());
		pessoas.forEach((p) -> System.out.println(p.getNome()+ " " + p.getIdade()));
		
		System.out.println("\nLista de Maiores de Idade");
		List<Pessoa> pessoasMaiores = pessoas.stream().filter((p) -> p.getIdade() >= 18).collect(Collectors.toList());
		pessoasMaiores.forEach((p) -> System.out.println(p.getNome()+ " " + p.getIdade()));
	
		System.out.println("\nLista de Pessoas por Idade");
		List<Pessoa> pessoasPorIdade = pessoasMaiores.stream().sorted((p1,p2) -> p1.getIdade() - p2.getIdade()).collect(Collectors.toList());
		pessoasPorIdade.forEach((p) -> System.out.println(p.getNome()+ " " + p.getIdade()));
		
		System.out.println("\nSoma das idades");
		Integer totalIdades = pessoasPorIdade.stream().map((p) -> p.getIdade()).reduce(0, (somaIdade, idade) -> somaIdade += idade);
		System.out.println("Total : " + totalIdades);
	}
	
	
	
	
	
}