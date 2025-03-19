package isep.eapli.demo_orm.dominio;

public class Automovel {
    private int numeroKms;

    // Construtor padrão
    public Automovel() {
        this.numeroKms = 0;
    }

    // Método para alterar o número de kms
    public void alterarNumeroKms(int novoNumeroKms) {
        if (novoNumeroKms >= 0) {
            this.numeroKms = novoNumeroKms;
        } else {
            throw new IllegalArgumentException("Número de kms não pode ser negativo");
        }
    }

    // Getter do número de kms
    public int getNumeroKms() {
        return numeroKms;
    }
}
