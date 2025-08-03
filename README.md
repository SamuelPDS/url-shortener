Seu novo `README.md` para o projeto Shortenet URL, seguindo o modelo do OrderHub, ficaria assim:

---

# Shortenet URL - Sistema de Encurtamento de URLs

Shortenet URL é um sistema completo para encurtar URLs, desenvolvido com Spring Boot, persistência em PostgreSQL, mapeamento com MapStruct e arquitetura REST.

## 🚀 Funcionalidades

### Core Features

✅ Encurtamento de URLs: API REST para criar URLs encurtadas  
✅ Redirecionamento: Redireciona para a URL original ao acessar o link curto  
✅ Expiração de URLs: URLs podem expirar após determinado tempo  
✅ Contador de acessos: Registra o número de acessos de cada URL  
✅ Painel administrativo: Endpoints para consulta e gerenciamento de URLs

### Recursos Técnicos

🔒 Segurança: Spring Security (opcional)  
📊 Monitoramento: Spring Boot Actuator para métricas e health checks  
🗄️ Persistência: JPA/Hibernate com PostgreSQL  
🔍 Mapeamento: MapStruct para conversão entre entidades e DTOs  
🛠️ Redução de boilerplate: Lombok  
⚡ APIs REST: Controllers para operações CRUD

## 🏗️ Arquitetura

### Estrutura do Projeto

`src/main/java/com/samuel/shortenet_url/`  
├── config/          \# Configurações MapStruct  
├── controller/      \# Controllers REST  
├── mapper/          \# MapStruct mappers  
├── model/           \# DTOs e entidades JPA  
│   ├── DTO/  
│   └── entity/  
├── repository/      \# Repositórios JPA  
├── service/         \# Lógica de negócio  
└── ShortenetUrlApplication.java

### Fluxo de Encurtamento

1. Criação: Usuário envia URL original via API REST
2. Geração: Sistema gera URL encurtada e salva no banco
3. Redirecionamento: Acesso à URL curta redireciona para a original
4. Expiração: URLs podem expirar conforme configuração
5. Consulta: Endpoints para listar e consultar URLs

## 🛠️ Tecnologias

- Java 17
- Spring Boot
- Spring Data JPA
- MapStruct
- Lombok
- PostgreSQL
- Maven

## 🚦 Endpoints

### APIs Públicas

- **Criar URL encurtada**  
  `POST /urls`  
  Content-Type: application/json

- **Redirecionar para URL original**  
  `GET /{shortenedUrl}`

### APIs Administrativas

- **Listar URLs**  
  `GET /admin/urls`

- **Consultar detalhes da URL**  
  `GET /admin/urls/{id}`

- **Remover URL**  
  `DELETE /admin/urls/{id}`

## 📋 Configuração

### Banco de Dados

No arquivo `application.yml`:

```yaml
spring:
  datasource:
    driver-class-name: org.postgresql.Driver
    url: jdbc:postgresql://localhost:5432/authservice
    username: root
    password: root
```

## 🚀 Execução

### Desenvolvimento

```shell
# Clonar repositório
git clone <repository-url>
cd shortenet-url

# Executar com Maven
./mvnw spring-boot:run
```

## 📊 Monitoramento

- **Health Check**  
  `GET /actuator/health`

- **Métricas**  
  `GET /actuator/metrics`

## 🧪 Testes

```shell
# Executar todos os testes
./mvnw test
```

## 📝 Exemplo de Uso

**Criar URL encurtada**

```shell
curl -X POST http://localhost:8080/urls \
-H "Content-Type: application/json" \
-d '{"originalUrl": "https://www.exemplo.com"}'
```

**Redirecionar**

```shell
curl -L http://localhost:8080/abc123
```

## 🤝 Contribuição

1. Fork o projeto
2. Crie uma branch para sua feature (`git checkout -b feature/NovaFeature`)
3. Commit suas mudanças (`git commit -m 'Add NovaFeature'`)
4. Push para a branch (`git push origin feature/NovaFeature`)
5. Abra um Pull Request

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

## 📞 Suporte

- Email: suporte@seuprojeto.com
- GitHub Issues: Criar Issue
- Documentação: Wiki do Projeto

---

Esse modelo segue o padrão do OrderHub, adaptado para o contexto do Shortenet URL.