package org.iesalandalus.programacion.reyajedrez.modelo;

import java.util.Objects;

public class Posicion {
    private int fila;
    private char columna;

    public Posicion(int fila, char columna) {
        setFila(fila);
        setColumna(columna);
    }

    public Posicion (Posicion posicion) {
        setFila(posicion.fila);
        setFila(posicion.columna);
    }



    public int getFila() {
        return fila;
    }

    private void setFila(int fila) {
        if(fila < 1 || fila > 8) {
            throw new IllegalArgumentException("ERROR:La fila introducida no es correcta");
        }
        this.fila = fila;
    }

    public char getColumna() {
        return columna;
    }

    private void setColumna(char columna) {
        if(columna <'a' || columna >'h') {
            throw new IllegalArgumentException("ERROR:La columna introducida no es correcta");
        }
        this.columna = columna;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Posicion posicion = (Posicion) o;
        return fila == posicion.fila && columna == posicion.columna;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fila, columna);
    }

}
