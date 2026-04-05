package br.com.securebank.exceptions;

/**
 * Exceção lançada quando uma operação financeira tenta exceder
 * o saldo e os limites disponíveis na conta.
 */
public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(String message) {
        super(message);
    }

    public SaldoInsuficienteException() {
        super("Operação negada: Saldo ou limite insuficiente para essa transação!");
    }
}
