public class Carro extends Veiculo {
    private int Portas;

    public Carro(String marca, String modelo, int ano, int numPortas) {
        super(marca, modelo, ano);
        this.Portas = numPortas;
    }

    public int getNumPortas() {
        return Portas;
    }

    public void setNumPortas(int numPortas) {
        this.Portas = numPortas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de portas: " + Portas;
    }
}