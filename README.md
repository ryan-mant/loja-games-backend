# loja-games-backend

# Sobre
Loja de jogos com CRUD utilizando do JPA e Spring Web. Esse projeto foi feito em sala de aula no IFSP e aprimorado em casa.

### Atualização
Foi adicionado o método de DELETE.
Foi adicionado o método de GET(getById).

#### DELETE
Ao criar o método "deletar", ele deve receber um int "id" como parâmetro.<br />
Criei um Optional da classe Jogo chamado jogoExcluido que deverá receber o método findById("aqui ele deverá receber o mesmo id que dei ao método deletar") do jogoRepository.<br />
Criei uma condicional para verificar se existe um jogo com o id que eu passei no método findByID no meu banco de dados.<br />
Caso haja um jogo com esse id, eu passo ele para uma nova variavel chamada "jogo".<br />
Então eu chamo o método de "deleteById" do jogoRepository que precisa de um int "id" para remover um jogo do banco de dados.<br />
Eu passo minha variavel "jogo" buscando seu id no método de getId para o método jogoRepository.deleteById.<br />
Por fim eu retorno minha variavel "jogo" para poder ver se o jogo deletado foi o jogo esperado.<br />

Caso seja passado um "id" onde não haja um jogo vinculado, ele apenas retornará null.

#### getById
Meu método chamado "getById" deverá receber um int "id" como parâmetro.<br />
Ao criar um Optional da classe Jogo eu chamo ele de "jogoRequerido" que recebe o método de "findById"(ele deve receber o mesmo int "id que passei no método "getById") do meu jogoRepository.<br />
O método "findById" procura um jogo no meu banco de dados com o mesmo "id" que lhe foi passado.<br />
Criei uma condicional que verifica se existe um jogo com esse "id" no banco de dados.<br />
Se existe um jogo com esse mesmo "id", eu crio uma variavel que recebe o "jogoRequerido" chamada "jogo".<br />
Por fim eu retorno esse jogo.

Caso "findById" não encontrar um jogo com esse "id", ele deverá apenas retornar null.