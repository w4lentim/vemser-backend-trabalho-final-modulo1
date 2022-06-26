public interface Operacao {

    Double alugar(Double valorDoCarroAlugar, Integer qntDias);
    Boolean pagar(Double valorPagamento, Integer diaDaDevolucao);
    Boolean devolver();
    Double multa();

}
