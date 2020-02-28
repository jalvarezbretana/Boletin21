/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jalvarezbretana
 */
public class Boletin21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Libro> listaLibros = new ArrayList();
        File f = new File("libros.txt");
        Metodos obx = new Metodos();
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("   MENÚ  \n1 Engadir libro\n2 Consultar prezo "
                    + "\n3 Amosar" + "\n4 Dar de baixa os libros con 0 unidades\n5 Cambiar prezo \n0 Saír"));
            switch (opcion) {
                case 1:
                    obx.engadirLibro("libros.txt");
                    break;
                case 2:
                    obx.consultar(f);
                    break;
                case 3:
                    obx.visualizar(f);
                    break;
                case 4:
                    obx.darBaixa(listaLibros, f);
                    obx.escribirListaActualizada("libros.txt", listaLibros);
                    break;
                case 5:
                    obx.modificarPrezo(listaLibros);
                    obx.escribirListaActualizada("libros.txt", listaLibros);
                    break;
                case 0:
                    obx.sair();

            }

        } while (opcion < 0);

    }

}
