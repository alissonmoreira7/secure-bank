package br.com.securebank.exceptions;

/**
 * Exceção lançada quando há falha de autenticação ou
 * tentativa de violação de acesso ao sistema.
 */
public class AcessoNegadoException extends RuntimeException {
    public AcessoNegadoException(String message) {
        super(message);
    }

    public AcessoNegadoException(){
        super("Acesso negado: Credenciais inválidas ou permissão insuficiente!");
    }
}
