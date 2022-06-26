public class Devolucao extends Carro{

    private Integer diaDaDevolucao;
    private Carro nomeDoCarroDevolvido;
    private Carro tipoDoCarroDevolvido;

    public Devolucao(Integer diaDaDevolucao, Carro nomeDoCarroDevolvido, Carro tipoDoCarroDevolvido) {
        this.diaDaDevolucao = diaDaDevolucao;
        this.nomeDoCarroDevolvido = nomeDoCarroDevolvido;
        this.tipoDoCarroDevolvido = tipoDoCarroDevolvido;
    }

    public boolean devolucaoCarro(Integer diaDaDevolucao){
        return false;
    }

    public boolean calculoMulta(){
        return false;
    }

    public Integer getDiaDaDevolucao() {
        return diaDaDevolucao;
    }

    public void setDiaDaDevolucao(Integer diaDaDevolucao) {
        this.diaDaDevolucao = diaDaDevolucao;
    }

    public Carro getNomeDoCarroDevolvido() {
        return nomeDoCarroDevolvido;
    }

    public void setNomeDoCarroDevolvido(Carro nomeDoCarroDevolvido) {
        this.nomeDoCarroDevolvido = nomeDoCarroDevolvido;
    }

    public Carro getTipoDoCarroDevolvido() {
        return tipoDoCarroDevolvido;
    }

    public void setTipoDoCarroDevolvido(Carro tipoDoCarroDevolvido) {
        this.tipoDoCarroDevolvido = tipoDoCarroDevolvido;
    }
    
}