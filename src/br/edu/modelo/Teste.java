
package br.edu.modelo;


public class Teste {
    
    public static void main(String[] args) {
        Texto texto = new Texto();
        texto.escreverTexto("Primeira linha do texto\n");
        texto.escreverTexto("Segunda linha do texto\n");
        texto.escreverTexto("Terceira linha do texto\n");
        texto.mostrarTexto();
        texto.desfazerEscrita();
        texto.mostrarTexto();
        texto.desfazerEscrita();
        texto.mostrarTexto();
        texto.desfazerEscrita();
        texto.mostrarTexto();
        texto.desfazerEscrita();
        texto.mostrarTexto();
    }
}
