package isep.eapli.demo_orm.dominio;

public class GrupoAutomovel {
    private int numeroPortas;

    public GrupoAutomovel(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public void alterarNumeroPortas(int novoNumero) {
        this.numeroPortas = novoNumero;
        System.out.println("Número de portas alterado para: " + this.numeroPortas);
    }

    public int getNumeroPortas() {
        return this.numeroPortas;
    }

    @Override
    public String toString() {
        return "GrupoAutomovel { numeroPortas = " + numeroPortas + " }";
    }
}
