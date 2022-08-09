# Tutoriais
O principal objetivo desta prática é fortalecer o conhecimento visto e implementar uma API REST que permita que os dados persistam em um banco de dados relacional SQL.

**Exercício**

Um aluno da academia depois de concluir com sucesso todos os cursos que iniciou, decide
criar alguns tutoriais para colocar em prática os conhecimentos aprendidos e revisá-los
caso se esqueça de algumas coisas.<br><br>
É muito importante para ele que os dados sejam armazenados corretamente e estejam
disponíveis para quando quiser consultá-los novamente.<br><br>
Para fazer isso, você decide implementar um serviço REST que permite alcançá-lo.

Uma entidade chamada “Tutorial” deve ser criada com os seguintes atributos:<br>
- ID do tutorial.<br>
- Título do tutorial.<br>
- Descrição do tutorial.<br>
- Situação da publicação.<br>

A API deve ser capaz de:
1. Criar, recuperar, atualizar e excluir tutoriais.<br>
2. Dê suporte a métodos de pesquisa personalizados, como pesquisar por status de publicação ou por título.<br>

**MÉTODO - URI - AÇÃO**<br>
POST - /api/tutorials - Crie um novo Tutorial.<br>
GET - /api/tutorials - Retornar todos os tutoriais.<br>
GET - /api/tutorials/id - Retornar um tutorial por id.<br>
PUT - /api/tutorials/id -  Atualizar um tutorial por id.<br>
DELETE - /api/tutorials - Excluir todos os tutoriais.<br>
DELETE - /api/tutorials/id - Excluir um tutorial por id.<br>
GET - /api/tutorials/published - Buscar todos os tutoriais publicados.<br>
GET - /api/tutorials?title=Spring - Buscar todos os tutoriais que tenham a palavra “Spring” no título.<br>
