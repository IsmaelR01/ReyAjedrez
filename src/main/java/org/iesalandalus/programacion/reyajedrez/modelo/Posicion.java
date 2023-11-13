package org.iesalandalus.programacion.reyajedrez.modelo;

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


}
