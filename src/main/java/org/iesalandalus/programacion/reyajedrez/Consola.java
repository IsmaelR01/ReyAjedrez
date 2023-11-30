package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.reyajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

import java.sql.SQLOutput;

public class Consola {
        private  Consola() {

        }
        public static void mostrarMenu() {
            System.out.println("Menu de opciones");
            System.out.println("1. Crear Rey por defecto");
            System.out.println("2. Crear Rey eligiendo color");
            System.out.println("3. Mover");
            System.out.println("4. Salir");
        }
        public static int elegirOpcionMenu() {
            int opcion;
            do {
                System.out.println("Elige una opción 1-4:");
                opcion = Entrada.entero();
                return opcion;
            } while (opcion < 1 || opcion > 4);
        }
        public static Color elegirColor() {
            int color;
            do {
                System.out.println("Elige un color( 1. Blanco o 2. Negro)");
                color = Entrada.entero();
            } while (color < 1 || color > 2);

            if (color == 1) {
                return Color.BLANCO;
            } else
                return Color.NEGRO;
        }
        public static void mostrarMenuDirecciones() {
            System.out.println("Menu de direcciones");
            System.out.println("1. Dirección Norte");
            System.out.println("2. Dirección Noreste");
            System.out.println("3. Dirección Este");
            System.out.println("4. Dirección Sureste");
            System.out.println("5. Dirección Sur");
            System.out.println("6. Dirección Suroeste");
            System.out.println("7. Dirección Oeste");
            System.out.println("8. Dirección Noroeste");
            System.out.println("9. Enroque Corto");
            System.out.println("10. Enroque Largo");
        }
        public static Direccion elegirDireccion() {
            int direccion;
            do {
                System.out.println("Elige una dirección 1-10");
                direccion = Entrada.entero();
            }while(direccion < 1 || direccion > 10);

            return switch (direccion) {
                case 1 -> Direccion.NORTE;
                case 2 -> Direccion.NORESTE;
                case 3 -> Direccion.ESTE;
                case 4 -> Direccion.SURESTE;
                case 5 -> Direccion.SUR;
                case 6 -> Direccion.SUROESTE;
                case 7 -> Direccion.OESTE;
                case 8 -> Direccion.NOROESTE;
                case 9 -> Direccion.ENROQUE_CORTO;
                case 10 -> Direccion.ENROQUE_LARGO;
                default -> null;
            };
        }
        public static void despedirse() {
            System.out.println("Hasta la próxima");

        }
}




