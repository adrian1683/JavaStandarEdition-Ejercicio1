package com.company;

import clases.CapacidadEndedudamiento;
import clases.Mensajes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Mensajes mensaje = new Mensajes();
        CapacidadEndedudamiento capacidadEndedudamiento = new CapacidadEndedudamiento();
        String valorIngreso;
        String valorFijo;
        String valorVariable;
        String entrada = "SI";

        mensaje.ingreso();
        valorIngreso = in.nextLine();

        if(isNumeric(valorIngreso)){
            capacidadEndedudamiento.setIngresosTotales(Integer.parseInt(valorIngreso));

            while (entrada.equals("SI")){
                mensaje.gastoFijo();
                valorFijo = in.nextLine();

                mensaje.gastoVariable();
                valorVariable = in.nextLine();

                if(isNumeric(valorFijo) && isNumeric(valorVariable)){
                    capacidadEndedudamiento.setGastosFijos(Integer.parseInt(valorFijo));
                    capacidadEndedudamiento.setGastoVariables(Integer.parseInt(valorVariable));
                }
                else if(isNumeric(valorFijo) && !isNumeric(valorVariable)){
                        capacidadEndedudamiento.setGastosFijos(Integer.parseInt(valorFijo));
                        mensaje.valorIncorrectoVariable();
                        mensaje.ingresoGastos();
                }
                    else if(!isNumeric(valorFijo) && isNumeric(valorVariable)){
                        capacidadEndedudamiento.setGastoVariables(Integer.parseInt(valorVariable));
                        mensaje.valorIncorrectoFijo();
                        mensaje.ingresoGastos();
                    }
                    else{
                        mensaje.valorIncorrectoFijo();
                        mensaje.valorIncorrectoVariable();
                        mensaje.ingresoGastos();
                    }
                mensaje.ingresarDatos();
                entrada = in.nextLine().toUpperCase();
            }
            System.out.println(capacidadEndedudamiento);
            System.out.println(capacidadEndedudamiento.capacidadEndeudamiento());
        }
        else{
            mensaje.valorIncorrectoIngreso();
            main(args);
        }
    }

    public static boolean isNumeric(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}