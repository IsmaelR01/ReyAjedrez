package org.iesalandalus.programacion.reyajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Rey {
    private Color color;
    private Posicion posicion;
    private int totalMovimientos;

    public Rey() {
      setColor(Color.BLANCO);
      setPosicion(new Posicion(1,'e'));
    }

    public Rey(Color color) {
        if (color == Color.BLANCO) {
            setPosicion(new Posicion(1,'e'));
            setColor(Color.BLANCO);
        }
        if (color == Color.NEGRO) {
            setPosicion((new Posicion(8,'e')));
            setColor(Color.NEGRO);
        }
        if(color == null) {
            throw new NullPointerException("ERROR: El color no puede ser nulo.");
        }
    }

    public Color getColor() {
        return color;
    }

    private void setColor(Color color) {
        if (color== null) {
            throw new NullPointerException("ERROR: El color no puede ser nula");
        }
        this.color = color;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    private void setPosicion(Posicion posicion) {
        if(posicion == null) {
            throw new NullPointerException(("Error: La posición no puede ser nula"));
        }
        this.posicion = posicion;
    }

    public void mover(Direccion direccion) throws OperationNotSupportedException {
        if (direccion == null) {
            throw new NullPointerException("ERROR: La dirección no puede ser nula.");
        }
        try {
            switch (direccion) {
                case NORTE:
                    setPosicion(new Posicion(posicion.getFila() + 1, posicion.getColumna()));
                    break;
                case NORESTE:
                    setPosicion(new Posicion(posicion.getFila() + 1, (char) (posicion.getColumna() + 1)));
                    break;
                case ESTE:
                    setPosicion(new Posicion(posicion.getFila(), (char) (posicion.getColumna() + 1)));
                    break;
                case SURESTE:
                    setPosicion(new Posicion(posicion.getFila() - 1, (char) (posicion.getColumna() + 1)));
                    break;
                case SUR:
                    setPosicion(new Posicion(posicion.getFila() - 1, posicion.getColumna()));
                    break;
                case SUROESTE:
                    setPosicion(new Posicion(posicion.getFila() - 1, (char) (posicion.getColumna() - 1)));
                    break;
                case OESTE:
                    setPosicion(new Posicion(posicion.getFila(), (char) (posicion.getColumna() - 1)));
                    break;
                case NOROESTE:
                    setPosicion(new Posicion(posicion.getFila() + 1, (char) (posicion.getColumna() - 1)));
                    break;
                case ENROQUE_CORTO:
                    comprobarEnroque();
                    setPosicion(new Posicion(posicion.getFila(), (char) (posicion.getColumna() + 2)));
                    break;
                case ENROQUE_LARGO:
                    comprobarEnroque();
                    setPosicion(new Posicion(posicion.getFila(), (char) (posicion.getColumna() - 2)));
            }
        }catch (IllegalArgumentException e) {
            throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
        }

        totalMovimientos++;

    }

    private void comprobarEnroque() throws OperationNotSupportedException {
        if(totalMovimientos > 0) {
            throw new OperationNotSupportedException("ERROR: El rey ya se ha movido antes.");
        }

    }


    @Override
    public String toString() {
        return "color=" + color + ", posicion=(" + posicion + ")";
    }
}
