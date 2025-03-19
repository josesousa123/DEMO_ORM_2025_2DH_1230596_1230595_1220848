package isep.eapli.demo_orm.dominio;

public class Automovel {
    private int numeroKms;
    private String matricula; // Novo atributo para armazenar a matrícula

    // Construtor padrão
    public Automovel() {
        this.numeroKms = 0;
        this.matricula = ""; // Inicializa a matrícula
    }

    // Método para alterar o número de kms
    public void alterarNumeroKms(int novoNumeroKms) {
        if (novoNumeroKms >= 0) {
            this.numeroKms = novoNumeroKms;
        } else {
            throw new IllegalArgumentException("Número de kms não pode ser negativo");
        }
    }

    // Método para retornar a matrícula
    public String matricula() {
        return matricula;
    }

    // Método para definir a matrícula
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Getter do número de kms
    public int getNumeroKms() {
        return numeroKms;
    }

    // Método toString
    @Override
    public String toString() {
        return "Automovel{" +
                "numeroKms=" + numeroKms +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}