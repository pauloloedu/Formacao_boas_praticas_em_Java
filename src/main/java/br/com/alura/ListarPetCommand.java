package br.com.alura;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.service.PetService;

import java.io.IOException;

public class ListarPetCommand implements Command{


    @Override
    public void execute() {
        try {
            ClientHttpConfiguration cliente = new ClientHttpConfiguration();
            PetService petService = new PetService(cliente);

            petService.listarPetsDoAbrigo();

        }catch (IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
