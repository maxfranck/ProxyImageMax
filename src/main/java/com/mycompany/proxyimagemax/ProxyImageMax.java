/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proxyimagemax;

/**
 *
 * @author maxfr
 */
public class ProxyImageMax {

    public static void main(String[] args) {
        // Cria um objeto ProxyImage para a imagem "test.jpg"
        Image image = new ProxyImage("test.jpg");
        // A imagem real só é carregada aqui, na primeira vez que é exibida
        image.display();
        // A imagem já está carregada, então a exibição é mais rápida
        image.display();
    }
}
