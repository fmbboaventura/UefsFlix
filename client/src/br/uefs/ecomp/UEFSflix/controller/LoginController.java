package br.uefs.ecomp.UEFSflix.controller;

/**
 * @author Filipe Boaventura
 * @since 19/03/2015.
 */
public class LoginController {
    private static LoginController ourInstance = new LoginController();

    public static LoginController getInstance() {
        return ourInstance;
    }

    private LoginController() {
    }

    public void requestLogin(String name, String password){

    }
}
