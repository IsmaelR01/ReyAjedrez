package org.iesalandalus.programacion.reyajedrez.modelo;

public class Posicion {
    private int fila;
    private char columna;

    public Posicion(int fila, char columna) {
        setFila(fila);
        setColumna(columna);
    }


    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        if(fila < 1 || fila > 8) {
            throw new IllegalArgumentException("ERROR:La fila introducida no es correcta");
        }
        this.fila = fila;
    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        if(columna <'a' || columna >'h') {
            throw new IllegalArgumentException("ERROR:La columna introducida no es correcta");
        }
        this.columna = columna;
    }

}
