package br.com.alura;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.service.AbrigoService;

import java.io.IOException;

public class ListarAbrigoCommand implements Command{

    @Override
    public void execute() {
        try {
            ClientHttpConfiguration cliente = new ClientHttpConfiguration();
            AbrigoService abrigoService = new AbrigoService(cliente);

            abrigoService.listarAbrigo();

        }catch (IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }

    }
}
