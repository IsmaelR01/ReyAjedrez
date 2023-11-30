package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.reyajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reyajedrez.modelo.Posicion;
import org.iesalandalus.programacion.reyajedrez.modelo.Rey;

import javax.naming.OperationNotSupportedException;
import java.awt.*;


public class MainApp {
    private static Rey rey;
    public static void main(String[] args) {
        int opcion = 0;
        do {
            Consola.mostrarMenu();
            ejecutarOpcion(opcion = Consola.elegirOpcionMenu());
            try {
                mostrarRey();
            }catch(NullPointerException e) {
                System.out.println(e);
            }
        }while(opcion !=4);

    }
    private static void ejecutarOpcion(int opcion)  {
        if(opcion == 1) {
            crearReyDefecto();
        }
        if(opcion == 2) {
            try {
                crearReyColor();
            }catch (NullPointerException e) {
                System.out.println(e);;
            }
        }
        if(opcion == 3) {

            try {
                    mover();

            }catch (OperationNotSupportedException | IllegalArgumentException | NullPointerException e) {
                System.out.println(e);
            }
        }
        if(opcion == 4) {
            Consola.despedirse();
        }
    }
    private static void crearReyDefecto() {
         rey  = new Rey();
    }

    private static void crearReyColor() {
         rey = new Rey(Consola.elegirColor());
    }

    private static void mover() throws OperationNotSupportedException {
        Consola.mostrarMenuDirecciones();
        rey.mover(Consola.elegirDireccion());

    }

    private static void mostrarRey() {
        if(rey == null) {
            throw new NullPointerException("ERROR: El rey no puede ser nulo.");
        }
        System.out.println(rey.toString());
    }

}
