# Chat para Kanban

Este projeto é um sistema de chat desenvolvido para ser integrado com um sistema de Kanban, permitindo a comunicação em tempo real entre os membros da equipe mas também apresenta um chat de pessoa para pessoa para os que não estão participando de uma equipe.

## Funcionalidades

- **Mensagens em Tempo Real**: Os usuários podem enviar e receber mensagens instantaneamente.
- **Notificações**: Receba notificações sobre novas mensagens e atualizações.
- **Interface Amigável**: Design intuitivo e fácil de usar.
- **Integração com Kanban**: Conecte o chat com suas tarefas no Kanban.

## Tecnologias Utilizadas

- **Frontend**: Kotlin
- **Backend**: Spring Framework
- **Banco de Dados**: MongoDB
- **WebSockets**: Para comunicação em tempo real

## Screenshots

Aqui estão algumas capturas de tela do aplicativo:

### Tela de Login, Tela Principal e Lista de Conversas
<div style="display: flex; gap: 10px;">
  <img src="https://github.com/244Walyson/chat-mobile/blob/screenshots/screenshots/login.png" alt="Tela de Login" width="200"/>
  <img src="https://github.com/244Walyson/chat-mobile/blob/screenshots/screenshots/main.png" alt="Tela Principal" width="200"/>
  <img src="https://github.com/244Walyson/chat-mobile/blob/screenshots/screenshots/chat_list.png" alt="Lista de Conversas" width="200"/>
</div>

### Tela de Chat, Detalhes da Conversa e Notificações
<div style="display: flex; gap: 10px;">
  <img src="https://github.com/244Walyson/chat-mobile/blob/screenshots/screenshots/chat.png" alt="Tela de Chat" width="200"/>
  <img src="https://github.com/244Walyson/chat-mobile/blob/screenshots/screenshots/notification.png" alt="Notificações" width="200"/>
  <img src="https://github.com/244Walyson/chat-mobile/blob/screenshots/screenshots/team_details.png" alt="Detalhes da Conversa" width="200"/>
</div>

### Configurações
<div style="display: flex; gap: 10px;">
  <img src="https://github.com/244Walyson/chat-mobile/blob/screenshots/screenshots/user_details.png" alt="Configurações" width="200"/>
</div>

## Instalação

Para rodar este projeto localmente, siga os passos abaixo:

1. Clone este repositório mobile:
   ```sh
   git clone git@github.com:244Walyson/chat-mobile.git
4. Inicialize o backend:   
   *para isso voce pode precisar do docker:* [click aqui para o passo a passo](https://github.com/244Walyson/Kanban-services) 
5. Inicie o aplicativo mobile:   
    No Android Studio, clique no botão "Run" ou use o atalho Shift + F10 para iniciar o aplicativo em um emulador ou dispositivo físico conectado.



## Contribuição

1. Faça um fork do projeto.
2. Crie uma branch para sua feature:
   ```sh
   git checkout -b minha-nova-feature
3. Commit suas mudanças:
   ```sh
   git commit -m 'Adiciona nova feature'
4. Faça o push para a branch:
   ```sh
   git push origin minha-nova-feature
6. Abra um Pull Request.

