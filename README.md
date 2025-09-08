# ✅ Gerenciador de Tarefas em Java + MySQL

Um projeto simples de **CRUD** (Create, Read, Update, Delete) feito em **Java** com conexão ao **MySQL**.  
A ideia é gerenciar tarefas de uma lista *to-do*, permitindo adicionar, listar, atualizar e excluir tarefas.

---

## 🛠️ Tecnologias utilizadas
- ☕ **Java 17+**
- 🐬 **MySQL** (JDBC)
- 📦 **Maven** *(opcional, caso use)*  
- 🖥️ **Console/Terminal**

---

## 📌 Funcionalidades
- Adicionar nova tarefa
- Listar todas as tarefas
- Atualizar tarefa (título e status)
- Excluir tarefa
- Exibição amigável no console

---

## 🗄️ Estrutura da Tabela
Crie o banco e tabela no MySQL:

```sql
CREATE DATABASE todo_java;

USE todo_java;

CREATE TABLE tasks (
  id INT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(100) NOT NULL,
  done BOOLEAN DEFAULT false
);
