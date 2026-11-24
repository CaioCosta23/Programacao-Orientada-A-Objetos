# Sistema Bancário :dollar:

Este projeto foi desenvolvido para representar um sistema bancário simples em JAVA.

---

## Implementação :technologist:

O código reflete as principais entidades de um banco, sendo elas:

- **Pessoa**: Possui instância(s) que representa(m) o(s) cliente(s), com atributos como nome, cpf e idade;
- **Conta**: Possui instaância(s) que represent(m) a(s) conta(s) bancária(s) do(s) cliente(s) com atributos como saldo, e número de conta, permitindo que o saldo de uma conta seja incrementado ou decrementado;
- **Agencia**: Possui Instância(s) que representa(m) agência(s) bancária(s), onde são gerenciadas as contas dos clientes, podendo-se adicionar, buscar e listar contas existentes;

---

## Estrutura de Pastas :file_folder:

- `src`: Pasta que contém os arquivos de código fonte;
- `bin`: Pasta que contém os arquivos compilados (_.class_);
- `README.md`: Documentação do projeto; 

---

## Execução :arrows_counterclockwise:

Para executar o programa, execute os seguintes comandos (em ordem);

```bash
javac -d bin src/*.java
java -cp bin App
```

> **OBS**: Certifique-se de estar na pasta raíz (`SistemaBancario`) ao executar os comandos.
