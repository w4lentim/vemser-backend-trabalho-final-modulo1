public class Usuario extends Cliente {

    private String nivel;

    public Usuario(String nivel, Cliente nome, Cliente cpf, Carro nomeCarro, Carro tipo) {
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

}
