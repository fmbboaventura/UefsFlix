package br.uefs.ecomp.UEFSflix;

import br.uefs.ecomp.UEFSflix.model.Server;

import java.io.IOException;

/**
 * Created by Filipe Boaventura on 19/03/2015.
 */
public class UefsFlixServerApp {

    public static void main(String[] args){
        try {
            new Server();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
