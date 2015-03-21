package br.uefs.ecomp.UEFSflix.controller;

import br.uefs.ecomp.UEFSflix.model.scl.Client;

import java.io.IOException;

/**
 * @author Filipe Boaventura
 * @since 19/03/2015.
 */
public class RequestController {
    private static RequestController ourInstance = new RequestController();
    private Client client = new Client();

    public static RequestController getInstance() {
        return ourInstance;
    }

    private RequestController() {
    }

    public void requestLogin(String name, String password){
        try {
            client.connect(name, password);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
