## Trabalho Efetivo Discente - Analise e Desenvolvimento de Sistemas

### Trabalho da discplina de Programação Orientada a Objetos I

#### Escopo do trabalho:

- Você está desenvolvendo um sistema para uma empresa onde os funcionários tem seus salários calculados de duas formas:
  Alguns recebem salário apenas por comissão e outros recebem comissão mais um salário fixo;

- O calculo do sálario é realizado considerando um percentual de comissão sobre o total de vendas feitas pelo funcionário;


- Os funcionários tem matrícula, **nome, CPF e data de nascimento** (atributos obrigatórios);


- Cada funcionário pode ter um percentual de comissão diferente;


- A(s) classe(s) deve(m) apresentar, obrigatoriamente, método costrutor para que sejam passados dados do
  funcionário na instanciação da classe.

Utilizando dos conhecimentos adqiridos na disciplina, implemente classe(s) que atenda(m) a situação
supracitada, utilizando principalmente das técnicas de **herança** e **encapsulamento.**


### Resolução:

Foi criada a Classe Funcionario com os atributos essenciais de qualquer cargo(nome, data de nascimento, cpf, matricula). 
As classes CargoComissionado e CargoSalarioFixo herdaram os atributos da classe Funcionario, 
mas também possuem seus proprios atributos específicos.
Atraves da sobrescrita da função calculaSalario() da interface CalculadoraSalario implemetada nas classes podemos 
calcular o salario de cada cargo de acordo com suas caracteristicas.

