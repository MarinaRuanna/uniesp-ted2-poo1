package models;

import service.CalculadoraSalario;

/**
 * Classe é referente aos cargos que recebem salario considerando um percentual de comissão sobre o total de
 * vendas feitas pelo funcionário. Ela se estende da classe mãe Funcionario herdando os satributos
 * nome, dataNascimento, cpf e matricula, mas possui outro atributo referente a seu total de vendas (totalVendas).
 * Sobrescrevendo a função de calculo de salário da interface CalculadoraSalario podemos calcular o salario dos
 * funcionarios que se encaixam nesses cargos.
 */
public class CargoComissionado extends Funcionario implements CalculadoraSalario {

    double totalVendas;

    public CargoComissionado(String nome, String dataNascimento, String cpf, int matricula, double totalVendas) {
        super(nome, dataNascimento, cpf, matricula);
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public double CalculaSalario(double porcentagem) {
        double comissao = porcentagem * totalVendas;
        return comissao + totalVendas;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + getNome() + '\'' +
                ", dataNascimento='" + getDataNascimento() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", matricula=" + getMatricula() +
                ", totalVendas=" + totalVendas +
                '}';
    }
}
