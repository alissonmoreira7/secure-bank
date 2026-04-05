package br.com.securebank.security;

/**
 * Qualquer classe que a implementar deve fornecer uma lógica
 * de validação de credenciais.
 */
public interface Autenticavel {
    /**
     * Valida a senha fornecida.
     * @return true se a senha for válida, false caso contrário.
     */
    boolean autenticar(String senha);
}