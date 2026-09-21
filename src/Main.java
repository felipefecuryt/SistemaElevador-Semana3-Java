public class Main {

    public static void main(String[] args) {

        Elevador elevador = new Elevador(500);

        elevador.adicionarPeso(300);
        elevador.subir();

        elevador.adicionarPeso(300);
        elevador.subir();

    }

}