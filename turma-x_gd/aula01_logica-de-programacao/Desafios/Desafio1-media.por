programa
{
	/*
	Objetivo: Calcular média dos alunos e classificalos...
	Entrada: Quatro notas
	Processamento: Calcular média e classificar
	Saida: Classificacao do aluno (aprovado,recuperacao,reprovado)
	*/
	funcao inicio()
	{
		cadeia nome
		real nota1, nota2, nota3, nota4, media

		escreva("Olá, bem vindo ao portal do aluno!\nNos diga... Qual o seu nome?\n")
		leia(nome)
		limpa()

		escreva(nome+", tudo bem com voce?\nDigite suas quatro notas para calcular a média: \n")
		leia(nota1)
		leia(nota2)
		leia(nota3)
		leia(nota4)

		media = (nota1+nota2+nota3+nota4)/4

		se(media <= 4){
			escreva("Sua média é: "+media+", infelizmente voce foi reprovado!")
		}senao se(media >= 4.1 e media <= 5.9){
			escreva("Sua média é: "+media+". Que pena, voce está de reuperacao!")	
		}senao{
			escreva("Sua média é: "+media+". Parabéns, voce está aprovado!")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 596; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */