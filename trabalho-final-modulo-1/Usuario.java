public class Usuario extends Aluguel {
    private String nivel;

    public Usuario(String nivel, String nome, String cpf, Integer diaDoAluguel, Integer qntDias, String nivel1) {
        super(nivel, nome, cpf, diaDoAluguel, qntDias);
        this.nivel = nivel1;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

}
