/**
 *  Curso Digital Innovation One
 */
package com.dio;

import com.dio.model.Gato;

/**
 * @author Dimas
 *
 */
public class PrimeiroProjeto {

	public static void main(String[] args) {

		Gato gato = new Gato();
		Livros livros = new Livros();

		System.out.println("Resultado classe Gato: " + gato);
		System.out.println(livros);
		
		int A = 2;
		int B = 3;

		System.out.println("DIO - Aprendizado Java");
		System.out.println("Resultado do produto entre as variaveis A e B é: " + (A * B));
        
		gato.setCor("preto");
		gato.setIdade(2);
		gato.setNome("Tomas");
		
		System.out.println(gato);
	}

	@Override
	public String toString() {
		return "PrimeiroProjeto [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}

class Livros {
	private String nome;
	private String npag;
	
	@Override
	public String toString() {
		return "Livros [nome=" + nome + ", npag=" + npag + "]";
	}
}
