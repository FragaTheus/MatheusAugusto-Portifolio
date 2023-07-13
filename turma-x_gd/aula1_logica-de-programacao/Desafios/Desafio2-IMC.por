programa
{
	/*
	Objetivo: Montar um algoritmo para calcular o IMC
	Entrada: Peso e altura
	Processamento: Calcular IMC e classificar
	Saida: Indice de massa do funcionario
	*/
	funcao inicio()
	{
		real peso, altura, imc

		escreva("Olá, bem vindo a ferramenta 'Calcula IMC'\n")
		
		escreva("Digite seu peso em kg: ")
		leia(peso)

		escreva("Digite sua altura: ")
		leia(altura)

		imc = peso / (altura*altura)

		se(imc <= 16.9){
			escreva("Seu IMC é de: "+imc+". Voce esta muito abaixo do peso.")
		}senao se(imc <= 18.4){
			escreva("Seu IMC é de: "+imc+".Voce esta abaixo do peso.")
		}senao se(imc <= 24.9){
			escreva("Seu IMC é de: "+imc+".Voce esta no peso ideal.")	
		}senao se(imc <= 29.9){
			escreva("Seu IMC é de: "+imc+".Voce esta acima do peso.")	
		}senao se(imc <= 34.9){
			escreva("Seu IMC é de: "+imc+".Voce esta na obesidade grau 1.")	
		}senao se(imc <= 40){
			escreva("Seu IMC é de: "+imc+".Voce esta na obesidade grau 2.")	
		}senao{
			escreva("Seu IMC é de: "+imc+".Voce esta na obesidade grau 3.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1028; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */