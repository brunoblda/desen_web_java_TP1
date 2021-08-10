# Infnet - TP1 - Desenvolvimento Web com Java EE
Teste de Performance 1 da matéria de Desenvolvimento Web com Java EE

## Apresentação

No Teste de Performance 1, você vai colocar em prática as seguintes habilidades desenvolvidas durante as etapas 1 e 2:

 - Compreender a estrutura e as tags básicas de um documento HTML
 - Compreender estilos em HTML e a sintaxe CSS
 - Compreender as diferentes aplicações dos métodos GET e POST
 - Escrever conteúdos dinâmicos com Servlets

Você deve construir um servlet simples e páginas HTML para o cadastro de um usuário de um sistema web. Este usuário terá, neste momento, os seguintes campos de formulário:

 1. Nome
 2. E-mail
 3. Senha

O formulário deve possuir um botão Salvar. Este botão deve submeter as informações utilizando o método GET ou POST. Escolha o método adequado para este contexto.

Depois que o botão Salvar for acionado, as informações de nome e e-mail do usuário cadastrado devem ser exibidas numa página de mensagem de sucesso no cadastro.

## Projeto Desenvolvido

O projeto foi desenvolvido por meio do Dynamic Web Project, contendo os pacotes de controller(servelet), dominio e a pasta de views.

O sistema tem uma pagina incial (index) que tem um formulário para ser preenchido pelo usuário.

Após preenchimento os dados vão para o controler que cria um objeto usuário com o nome, email e senha informados. 

Posteriomente uma pagina dinamica é criada por meio do PrintWriter com a informação do nome e email informado pelo usuário no formulário.

O bootstrap foi utilizado para estilização da pagina web.


