<h1 align="center">
  <img src="spring.png" alt="logo_spring" width="550px" />
</h1>

# Shopping Core API #

## Objetivos ##

API responsável por gerenciar dados de lojas do Shopping

## Levantando ambiente ##

### Desenvolvimento ###

#### Download e instalação do docker-ce ####

* Linux: https://www.digitalocean.com/community/tutorials/como-instalar-e-usar-o-docker-no-ubuntu-16-04-pt

#### Download e instalação do docker-compose ####

https://docs.docker.com/compose/install/#install-compose

#### Configurando a conexão com o banco de dados ####

As variáveis de conexão com o banco de dados, por padrão, estão configuradas utilizando a porta 32801 :)

Caso precise alterar a porta, acesse na raiz do projeto o arquivo `docker-compose.yml` e mude a variável

### Testar os endpoints

Os endpoints podem ser testados com a collection do Postman dentro do projeto,
procure por: `shopping_module.postman_collection.json`

#### Levantando a aplicação! ####

No diretório da aplicação, execute:

```bash
docker-compose up -d
```

Infelizmente você terá que executar esse comando toda vez que fizer mudanças, então o Java poderá compilar e o docker poderá recriar o serviço do Tomcat  :(

Então, não esqueça de derrubar o container do docker executando `docker-compose down` e levantando toda vez que fizer mudanças.   

#### Derrubando o container :( ####

Para derrubar o container e desligar o serviço, entre no diretório da aplicação e execute:

```bash
docker-compose down
```

