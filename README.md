Programa de Gerenciamento de Funcionários

Este projeto é uma aplicação em Java que permite o gerenciamento de funcionários, incluindo o aumento salarial baseado em uma porcentagem, com foco na aplicação de princípios de encapsulamento.
Descrição

O programa permite:

    Cadastro de Funcionários: Insere N funcionários com informações de ID, nome e salário, sem repetição de IDs.
    Aumento Salarial: Realiza um aumento de salário baseado em uma porcentagem fornecida pelo usuário. O aumento é aplicado somente se o ID do funcionário existir. Caso contrário, uma mensagem de erro é exibida.
    Exibição da Lista de Funcionários: Ao final, exibe a lista atualizada de todos os funcionários com os salários ajustados.

Regras de Negócio

    Encapsulamento: O salário dos funcionários não pode ser modificado diretamente. O aumento salarial é permitido apenas através de uma operação específica de aumento por porcentagem, respeitando os princípios de encapsulamento.
    IDs Únicos: Cada funcionário deve ter um ID único.
