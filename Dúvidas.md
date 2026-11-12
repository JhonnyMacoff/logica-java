Desafio 1:
int tem limite de até 2milhoes e alguma coisa.. se for algo maior usa long.

Quebrei um pouco a cabeça com for porque estava acostumado a usar for n in i: , mas no java é for (i=1; i<=n; i++){} mas to pegando o jeito.

Scanner é uma função que não conhecia, estou tentando decorar como usar:
1º Cria uma variavel leitor = new Scanner(System.in);; 2º para atribuir a uma variavel igualar a leitor.nextint() se for int, next() se for string. nextline() para a linha toda até apertar enter;3º no final scanner close() é um bom habito para liberar o recurso e evitar vazamento de memória.

Pra incrementar fiz um while pra repedir a pergunta 3 vezes.

--------------------------------------------------------------------
Desafio 2:
Tranquilo, unico problema que tive foi tentando fazer um if com string. Primeiro tentei fazer char mas o scanner não funciona com char só int double, string. Depois criei uma string mas deu erro no iff e fica num loop infinito. Precisei pesquisar como verificar um string e encontrei a função .equalsIgnoreCase("n").
Também coloquei um if para o caso de não digitar um número inteiro, para aparecer a mensagem de erro, porém tive problemas com um loop e precisei pesquisar, vi que há a função leitor.next() para zerar o leitor e então uso o continue para voltar ao inicio do while.
Tive alguns erros de atenção fechando escopo fora do lugar mas depois de um tempo conseguir me achar novamente.
Fiz um mecanismo para que sempre que alguem der uma resposta invalida seja s/n ou uando pede um número sempre dar mensagem de erro orientando como preencher.

--------------------------------------------------------------------
Desafio 3:
Tranquilo de fazer. Usei 3 ifs não sei que outra forma seria mais enxuta para fazer.
--------------------------------------------------------------------
Desafio 4:
Tranquilo, precisei pesquiser para entender apenas como funciona o charAt e "palarva".length(). De resto apenas escrevi minha própria lógica.
--------------------------------------------------------------------
Desafio 5:
Pensei na lógica de pegar uma palavra(string) e atribuir letra por letra em outra string de tras pra frente. Só quebrei a cabeça pra saber qual função usar dentro do for.
--------------------------------------------------------------------