public class TestarVeiculo {

    public static void main(String[] args) {
        Carro c = new Carro("Ford", "Fusion", 2019, 5);
        Moto m = new Moto("Honda", "NC 750X", 2024, false);

        System.out.println(c);
        System.out.println(m);
    }
}