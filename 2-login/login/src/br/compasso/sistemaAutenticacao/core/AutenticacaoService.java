package br.compasso.sistemaAutenticacao.core;

public class AutenticacaoService {

    private static String[] usuarios = {"usuario1", "usuario2", "usuario3"};
    private static String[] senhas = {"senha1", "senha2", "senha3"};

    public static int autenticarUsuario(String usuarioDigitado, String senhaDigitada) {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i].equals(usuarioDigitado) && senhas[i].equals(senhaDigitada)) {
                return i; 
            }
        }
        return -1; 
    }
}
