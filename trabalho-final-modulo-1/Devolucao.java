public class Devolucao extends Carro{
    private Integer diaDaDevolucao;
    private Double qntCombustivelDevolucao;


    public Integer getDiaDaDevolucao() {
        return diaDaDevolucao;
    }

    public void setDiaDaDevolucao(Integer diaDaDevolucao) {
        this.diaDaDevolucao = diaDaDevolucao;
    }

    public Double getQntCombustivelDevolucao() {
        return qntCombustivelDevolucao;
    }

    public void setQntCombustivelDevolucao(Double qntCombustivelDevolucao) {
        this.qntCombustivelDevolucao = qntCombustivelDevolucao;
    }

    public boolean devolucaoCarro(Integer diaDaDevolucao){
        return false;
    }

    public boolean calculoMulta(){
        return false;
    }
    
}