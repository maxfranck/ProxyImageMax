/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxyimagemax;

/**
 *
 * @author maxfr
 */
public class RealImage implements Image {
    private final String filename;

    // Construtor que recebe o nome do arquivo de imagem a ser carregado
    public RealImage(String filename) {
        this.filename = filename;
        // Simula o carregamento da imagem do disco
        loadFromDisk();
    }

    // Implementação do método de exibição da imagem
    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }

    // Método privado que simula o carregamento da imagem do disco
    private void loadFromDisk() {
        System.out.println("Loading " + filename + " from disk");
    }
}