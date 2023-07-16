programa
{
	/*
	Objetivo: Simular parcelas de cartao de credito
	Regras: parcelas até 10x sem juros
	12x com juros(1,2a.m)
	Cliente tem até 10% de descontos na compra
	Entrada: nome, totalCompra, vezes
	Processamento: calculo de contas
	Saida: resultado da conta
		*/	
	funcao inicio()
	{
		cadeia nome
		real totalCompra,valorParcela
		inteiro parcelas

		escreva("Bem vindo! Para iniciarmos, digite seu nome:\n")
		leia(nome)
		limpa()
		
		escreva(nome+ " qual o valor total da compra?\n")
		leia(totalCompra)

		escreva("Em quantas parcelas deseja fazer? Obs: maximo 12\n")
		leia(parcelas)

		valorParcela = totalCompra/parcelas

		se(parcelas == 1){
				real desconto = (totalCompra/100)*10
				totalCompra = totalCompra - desconto
				escreva("Muito obrigado "+nome+"!\n")
				escreva("Voce parcelou sua compra em: "+parcelas+", no valor de: "+valorParcela+", e o total do seu produto é de: "+totalCompra)
		}senao se(parcelas <= 10){
				escreva("Muito obrigado "+nome+"!\n")
				escreva("Voce parcelou sua compra em: "+parcelas+", no valor de: "+valorParcela+", e o total do seu produto é de: "+totalCompra)
		}senao{
				real juros = (totalCompra*1.2*parcelas)/100
				totalCompra = totalCompra+juros
				escreva("Muito obrigado "+nome+"!\n")
				escreva("Voce parcelou sua compra em: "+parcelas+", no valor de: "+valorParcela+", e o total do seu produto é de: "+totalCompra)	
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1396; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */