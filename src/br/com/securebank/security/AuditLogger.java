package br.com.securebank.security;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Classe para realização de auditorias de segurança.
 * Limitando a escrita a um único log na memória que irá armazenar
 * os dados de todas as transações do sistema.
 */
public class AuditLogger {
    private static final AuditLogger instance = new AuditLogger();

    private AuditLogger() {}

    public static AuditLogger getInstance() {
        return instance;
    }

    public void logOperacao(String idConta, String operacao, double valor, String status){
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        String mensagemLog = String.format("[%s] | CONTA: %s | OP: %s | VALOR: R$%.2f | STATUS: %s",
                                            timestamp, idConta, operacao, valor, status);

        try (FileWriter fw = new FileWriter("auditoria_pf.log", true);
             PrintWriter pw = new PrintWriter(fw)){

            pw.println(mensagemLog);

        } catch (IOException e){
            System.err.println("Erro crítico: falha ao escrever no log de auditoria! " + e.getMessage());
        }
    }
}
