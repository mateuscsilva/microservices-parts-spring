# Projeto de ecommerce usando arquitetura de microserviços

:computer:

Projeto em desenvolvimento para treinar criação de aplicação utilizando Spring Boot e arquitetura de microserviços. Base do projeto desenvolvida ensinada durante bootcamp da Digital Innovation One. 

Atualmente o projeto encontra-se em fase de expansão de funcionalidades e melhorias no código sendo executado pelo criador deste repositório.

##Projeto em desenvolvimento com:

- Java 16
- Spring Boot 2.5.3
- Gradle 7.1.1
- Junit5  
- IntelliJ IDEA Community Edition
- Controle de versão com GIT
- Armazenamento no Github   
- Elasticsearch
- Redis database
- Postman para simular requisições http 


####Para executar o projeto inicialize os microserviços na seguinte ordem:

1. config-server
2. server-discovery
3. gateway
4. product-catalog
5. shopping-cart


##### Comando para inicializar cada microserviço
```shell script
gradle bootRun
```

### Tarefas já definidas:

- [x] Instalar os programas necessários
- [x] Configurar o ambiente de desenvolvimento
- [x] Configurar as dependências em build.gradle
- [x] Configurar Elasticsearch e Redis
- [x] Definir a organização inicial do projeto 
- [x] Criar o repositório no Github
- [x] Criar microserviços de catálogo de produto e carrinho de compras
- [x] Acresentar microserviços responsávei com lidar com as configurações de exposição de serviço
- [x] Criar o README.md
- [ ] Criar as Exceptions
- [ ] Insere teste com Junit5 