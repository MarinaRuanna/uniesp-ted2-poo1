import models.*;


public class Main {
    public static void main(String[] args) {

    CargoComissionado vendedor = new CargoComissionado(
          "Pedro",
          "27/05/2001",
          "123.456.789-00",
          1001,
          1_300.00);

    System.out.println(vendedor);
    System.out.println(vendedor.CalculaSalario(0.3));

    CargoSalarioFixo gerente = new CargoSalarioFixo(
        "Flavia",
        "23/04/1993",
        "987.654.321-00",
        1002,
        3_300.00);

    System.out.println(gerente);
    System.out.println(gerente.CalculaSalario(0.5));
    }
}

