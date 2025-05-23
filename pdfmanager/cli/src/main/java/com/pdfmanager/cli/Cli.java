package com.pdfmanager.cli;

import java.sql.SQLException;

import com.pdfmanager.core.db.Database;

public class Cli {

    public Cli() {}

    public void readArgs(String[] args) {
        try {
            Database.initialize();

            if(args.length <= 0) {
                help();
                return;
            }

            String firstArg = args[0];
            switch(firstArg) {
                case "create" -> {
                    if (args.length <= 1) {
                        System.out.println("Falta um argumento para criar.");
                        return;
                    }
                    String secondArgs = args[1];
                    // Checar valor do argumento para decidir o que criar
                }
                default -> System.out.println("Comando \"" + firstArg + "\" não existe");

            }

            
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private void help() {
        // Adicionar mensagem de help
        System.out.println("Help");
    }
    
}
