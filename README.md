📋 Projeto: Board de Gerenciamento de Tarefas
Este projeto é um sistema de gerenciamento de tarefas com boards customizáveis, desenvolvido como parte de um desafio prático. Ele permite a criação, visualização e controle de tarefas, com registro no banco de dados MySQL.

💡 Objetivo
O sistema foi criado para auxiliar equipes a organizarem seus fluxos de trabalho, com controle de status, bloqueios e movimentações de tarefas de forma clara e ordenada.

🧱 Funcionalidades
Menu principal com as opções de Criar, Selecionar, Excluir boards, e para o usuário, sair.

Cada board possui: 
- Nome único;
- Pelo menos 3 colunas: inicial, final (concluído) e cancelamento;
- Colunas do tipo "pendente" opcionais;
- Ordem fixa: Inicial → Pendentes → Final → Cancelamento (como exceção);

Cada card (tarefa):
- Possui título, descrição, data de criação e status de bloqueio;
- Pode ser bloqueado ou desbloqueado com justificativa;
- Só pode ser movido se não estiver bloqueado;
- Pode ser movido etapa por etapa (exceto para cancelamento, que aceita saltos);

🛠️ Tecnologias
Java, MySQL, JDBC 

📄 Licença
Este projeto foi criado como entrega de desafio prático da DIO (Digital Innovation One). Uso educacional.
