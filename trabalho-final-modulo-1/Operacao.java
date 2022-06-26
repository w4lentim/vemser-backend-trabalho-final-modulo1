public interface Operacao {
    
    Double alugar();
    Double alugar(Double valorAluguel, Integer qntDias);
    Boolean pagar(Double valorPagamento);
    Boolean devolver();
    Double multa();

}
