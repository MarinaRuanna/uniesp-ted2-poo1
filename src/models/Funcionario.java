package models;

/**
 * Construção da super classe ou classe mãe que possui os atributos essenciais pra qualquer funcionário: nome, data de
 * nascimento, cpf e matricula. Possui o metodo construtor e os getters e setters nescessarios para intanciar
 * um objeto funcionário.
 */

public class Funcionario {

    private String nome;
    private String dataNascimento;
    private String cpf;
    private int matricula;

    public Funcionario() {

    }

    public Funcionario(String nome, String dataNascimento, String cpf, int matricula) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }


    public String getDataNascimento() {
        return dataNascimento;
    }


    public String getCpf() {
        return cpf;
    }


    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", cpf='" + cpf + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}
