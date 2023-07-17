programa
{
/*	Objetivo: Calcular o gasto de agua baseado em metros cubicos
	Entrada: Consumo de agua
	Processamento: Calcular conta
	Saida: Resultado da conta
*/
	
	funcao inicio()
	{
		inteiro  consumoAgua
		real valorConta = 22.38

		escreva("Digite a quantidade de agua utilizada pelo cliente:\n")
		leia(consumoAgua)

		se(consumoAgua <= 10){
			escreva("O valor da conta do cliente ficou em R$"+valorConta)
		}senao se(consumoAgua <= 20){
			valorConta = valorConta + 3.50
			escreva("O valor da conta do cliente ficou em R$"+valorConta)
		}senao se(consumoAgua <= 30){
			valorConta = valorConta + 8.75
			escreva("O valor da conta do cliente ficou em R$"+valorConta)
		}senao se(consumoAgua <= 50){
			valorConta = valorConta + 9.64
			escreva("O valor da conta do cliente ficou em R$"+valorConta)
		}senao{
			valorConta = valorConta + 10.17
			escreva("O valor da conta do cliente ficou em R$"+valorConta)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 211; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */