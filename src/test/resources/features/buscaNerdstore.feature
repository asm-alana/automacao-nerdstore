#language: pt
#enconding: UTF-8
#author: Alana Mendes
#date: 26/05/2021
#version: 1.0

@test
Funcionalidade: Buscar camiseta no site NerdStore
  Eu como usuario do site NerdStore
  Quero buscar a camiseta 
  Para coloca-la no carrinho de compras

Contexto: Buscar por camiseta
Dado que estou no site Nerdstore
Esquema do Cenario: Validar pagina da <buscarCamiseta>
Quando busco por <buscarCamiseta>
Entao sou redirecionado para a pagina com o titulo <tituloCamiseta> e preco <precoCamiseta>

Exemplos: 
| buscarCamiseta 											| tituloCamiseta         							|	precoCamiseta |
| "camiseta Don't Panic"							| "Camiseta 42 – Don’t Panic" 				|	"R$79,90" 		|
|	"camiseta A Princesa e o Cafajeste" | "Camiseta A Princesa e o Cafajeste"	| "R$79,90" 		|			

@test1
Esquema do Cenario: Validar pagina do carrinho de compras
Quando busco por <buscarCamiseta>
E seleciono o tamanho <tamanhoCamiseta>
Entao valido o nome <nomeCamiseta> na pagina de Carrinho

Exemplos:
| buscarCamiseta 					| tamanhoCamiseta 	|	nomeCamiseta											| 
#| "camiseta Don't Panic" 	|	"pp" 							|	"Camiseta 42 - Don't Panic - PP" 	|	
#| "camiseta Don't Panic" 	|	"p" 						|	"Camiseta 42 - Don't Panic - P"			|												
| "camiseta Don't Panic" 	|	"m" 						|	"Camiseta 42 - Don't Panic - M"			|	
#| "camiseta Don't Panic" 	|	"g" 						|	"Camiseta 42 - Don't Panic - G"		|	
#| "camiseta Don't Panic" 	|	"2g" 						|	"Camiseta 42 - Don't Panic - 2G		|
#| "camiseta Don't Panic" 	|	"3g" 						|	"Camiseta 42 - Don't Panic - 3G"	|
#| "camiseta Don't Panic" 	|	"4g" 						|	"Camiseta 42 - Don't Panic - 4G"	|
#| "camiseta Don't Panic" 	|	"5g" 						|	"Camiseta 42 - Don't Panic - 5G"	|	

@test2
Esquema do Cenario: Validar mensagem de falta de estoque
E busco por <buscarCamiseta>
Quando seleciono o tamanho <tamanhoCamiseta>
E clico em Comprar
Entao aparece a mensagem <msgForaDeEstoque>

Exemplos:
| buscarCamiseta 					| tamanhoCamiseta 	|	msgForaDeEstoque					| 
| "camiseta Don't Panic" 	|	"pp" 						|	"Fora de estoque" 		|	
| "camiseta Don't Panic" 	|	"p" 						|	"Fora de estoque"			|												
#| "camiseta Don't Panic" 	|	"m" 						|	"Fora de estoque"			|	
#| "camiseta Don't Panic" 	|	"g" 						|	"Fora de estoque"			|	
#| "camiseta Don't Panic" 	|	"2g" 						|	"Fora de estoque"			|
#| "camiseta Don't Panic" 	|	"3g" 						|	"Fora de estoque"			|
#| "camiseta Don't Panic" 	|	"4g" 						|	"Fora de estoque"			|
#| "camiseta Don't Panic" 	|	"5g" 						|	"Fora de estoque"			|	
