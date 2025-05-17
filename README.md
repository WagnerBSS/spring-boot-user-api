🛠️ Spring Boot User API

🚀 API REST simples desenvolvida com Spring Boot para gerenciar usuários. A aplicação suporta as operações básicas de CRUD (Criar, Ler, Atualizar e Excluir) e armazena os dados em memória.

✨ Funcionalidades

- 🔍 GET /users: Lista todos os usuários cadastrados.
- ➕ POST /users: Cria um novo usuário (JSON no corpo da requisição).
- 📝 PUT /users/{id}: Atualiza um usuário existente.
- ❌ DELETE /users/{id}: Remove um usuário existente.

📂 Estrutura do Projeto

- 📄 User**: Entidade que representa um usuário com `id`, `name` e `age`.
- 🔧 UserService**: Serviço que realiza operações de gerenciamento de usuários utilizando um `Map` para armazenamento em memória.
- 🌐 UserController**: Controller que expõe os endpoints REST para interação com os usuários.

💻 Tecnologias Utilizadas

- ☕ Java 17
- 🌱 Spring Boot
- 📦 Maven

🚀 Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/WagnerBSS/spring-boot-user-api.git
