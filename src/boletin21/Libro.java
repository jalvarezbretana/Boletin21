/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

/**
 *
 * @author jalvarezbretana
 */
public class Libro {

    String titulo;
    String autor;
    float prezo;
    int unidades;

    public Libro() {
    }

    public Libro(String nome, String autor, float prezo, int unidades) {
        this.titulo = nome;
        this.autor = autor;
        this.prezo = prezo;
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return titulo + ", " + autor + ", " + prezo + ", " + unidades + ",";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

}
