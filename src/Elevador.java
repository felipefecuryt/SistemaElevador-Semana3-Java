public class Elevador {

    private int andarAtual;
    private double pesoMaximo;
    private double pesoAtual;

    public Elevador(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
        this.andarAtual = 0;
        this.pesoAtual = 0;
    }

    public void adicionarPeso(double peso) {
        pesoAtual += peso;
    }

    public void subir() {

        if (pesoAtual > pesoMaximo) {
            System.out.println("Excesso de peso! O elevador não pode subir.");
        } else {
            andarAtual++;
            System.out.println("Elevador subiu para o andar " + andarAtual + ".");
        }

    }

}