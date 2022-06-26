public interface Operacao {

    Double alugar(Double valorAluguel, Integer qntDias);
    Boolean pagar(Double valorPagamento, Integer diaDaDevolucao);
    Boolean devolver();
    Double multa();

}
