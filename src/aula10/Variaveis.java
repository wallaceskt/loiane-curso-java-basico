package aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		// Convenção Java
		int idade = 20;
		String nome = "Loiane";
		String nomeDoMeuCachorro = "Totó";
		String ano2022 = "2022";
		
		// Não utilizadas
		int _idade;
		int $idade;
		
		// Apesar de aceitas, não são convenções Java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String nomeDoMeucachorro;
		
		idade = 32;
		
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);
		
		// Má prática
		int a = 10;
		String b = "Loiane";

	}

}
