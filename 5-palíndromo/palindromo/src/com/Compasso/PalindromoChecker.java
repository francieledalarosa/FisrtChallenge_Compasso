package com.Compasso;

public class PalindromoChecker {
   
    public static boolean verificarPalindromo(String str) {
        String textoFormatado = formatarTexto(str);
        int i = 0;
        int j = textoFormatado.length() - 1;
        while (i < j) {
            if (textoFormatado.charAt(i) != textoFormatado.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private static String formatarTexto(String str) {
        return str.replaceAll("[^a-zA-Z]", "").toLowerCase();
    }
}
