/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxyimagemax;

/**
 *
 * @author maxfr
 */
public class ProxyImage implements Image {
    private final String filename;
    private RealImage image; // Referência para a imagem real, que só será carregada sob demanda

    // Construtor que recebe o nome do arquivo de imagem a ser exibido
    public ProxyImage(String filename) {
        this.filename = filename;
    }

    // Implementação do método de exibição da imagem
    @Override
    public void display() {
        // Se a imagem real ainda não foi carregada, carrega-a agora
        if (image == null) {
            image = new RealImage(filename);
        }
        // Delega a exibição da imagem para a imagem real, que já está carregada
        image.display();
    }
}