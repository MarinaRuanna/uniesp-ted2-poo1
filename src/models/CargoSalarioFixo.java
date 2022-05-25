package models;

import service.CalculadoraSalario;

/**
 * Classe referente aos cargos que recebem salario fixo acrescido de uma porcentagem de comissão variável.
 * Ela se estende da classe mãe Funcionario herdando os satributos nome, dataNascimento, cpf e matricila,
 * mas possui outro atributo referente a seu salario fixo (salarioFixo).
 * Sobrescrevendo a função de calculo de salário da interface CalculadoraSalario podemos calcular o salario dos
 * funcionarios que se encaixam nesses cargos.
 */


public class CargoSalarioFixo extends Funcionario implements CalculadoraSalario {

    double salarioFixo;


    public CargoSalarioFixo(String nome, String dataNascimento, String cpf, int matricula, double salarioFixo) {
        super();
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    @Override
    public double CalculaSalario(double porcentagem) {
        double comissao = salarioFixo * porcentagem;
        return comissao + salarioFixo;
    }

    @Override
    public String toString() {
        return "CargoSalarioFixo{" +
                ", nome=" + getNome() +
                ", data de nascimento=" + getDataNascimento() +
                ", cpf=" + getCpf() +
                ", matricula=" + getMatricula() +
                ", salarioFixo=" + salarioFixo +
                '}';
    }
}
