programa
{
	/*
		Objetivo: Calcular gastos e ajudar a poupar dinherio.
		Entrada: Valor renda, valor gasto
		Processamento: Calcular resto e os 10%
		Saida: Resto e pe de meia
	*/
	funcao inicio()
	{
		real renda, gastos, peDeMeia, resto

		escreva("Olá, bem vindo a plataforma de controle financeiro.")

		escreva("\nPara comecarmos, digite o valor da sua renda mensal:\n")
		leia(renda)
		escreva("Digite o valor dos seus gastos mensais:\n")
		leia(gastos)

		peDeMeia = (renda/100)*10
		
		resto = renda - gastos

		escreva("Pelas informacoes passadas, recomendamos que guarde, pelo menos, R$"+peDeMeia+" por mes para investir, ter seguranca e etc.\n")
		
		se(resto < 0){
			escreva("Infelizmente nesse mes voce nao teve dinherio suficiente para as contas. Recomendamos que parcele algumas delas.")
		}senao{
			escreva("Ai sim! As contas estao em dia e ainda te sobrou R$"+resto)
		}
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 876; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */