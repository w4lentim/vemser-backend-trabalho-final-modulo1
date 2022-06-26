public interface Operacao {

    Double alugar(Double valorDoCarroAlugar);
    Boolean pagar(Double valorPagamento, Double valorCarroAlugar);
    Boolean devolver();
    Double multa();

}
