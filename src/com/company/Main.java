package com.company;

import clases.CapacidadEndedudamiento;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int valorNumerico;
        CapacidadEndedudamiento capacidadEndedudamiento = new CapacidadEndedudamiento();
        Scanner in = new Scanner(System.in);

        System.out.println("VALIDACIÓN CAPACIDAD DE ENDEUDAMIENTO");

        System.out.print("Ingrese el valor de sus ingresos mensuales: ");
        String ingMesuales = in.next();

        if (isNumeric(ingMesuales)) {
            valorNumerico = Integer.parseInt(ingMesuales);
            capacidadEndedudamiento.setIngresosTotales(valorNumerico);
        }
        else{
            System.out.print("Valor ingresado incorrecto, favor ingrese un valor numerico: ");
            ingMesuales = in.next();
            valorNumerico = Integer.parseInt(ingMesuales);
            capacidadEndedudamiento.setIngresosTotales(valorNumerico);
        }

        System.out.print("Ingrese el valor de sus gastos fijos: ");
        String gastoFijo = in.next();
        if (isNumeric(gastoFijo)) {
            valorNumerico = Integer.parseInt(gastoFijo);
            capacidadEndedudamiento.setGastosFijos(valorNumerico);
        }
        else{
            System.out.print("Valor ingresado incorrecto, favor ingrese un valor numerico: ");
            gastoFijo = in.next();
            valorNumerico = Integer.parseInt(gastoFijo);
            capacidadEndedudamiento.setGastosFijos(valorNumerico);
        }


        System.out.print("Ingrese el valor de sus gastos variables: ");
        String gastoVariable = in.next();
        if (isNumeric(gastoVariable)){
            valorNumerico = Integer.parseInt(gastoVariable);
            capacidadEndedudamiento.setGastoVaribales(valorNumerico);
        }
        else{
            System.out.print("Valor ingresado incorrecto, favor ingrese un valor numerico: ");
            gastoVariable = in.next();
            valorNumerico = Integer.parseInt(gastoVariable);
            capacidadEndedudamiento.setGastoVaribales(valorNumerico);
        }

        System.out.print("Desea ingresar gastos adicionales (SI/NO): ");
        String entrada = in.next();

        while (entrada.equals("SI") || entrada.equals("si")) {
            System.out.print("Ingrese otros gastos adicionales: ");
            int gastoAdicional = in.nextInt();
            valorNumerico = Integer.parseInt(gastoVariable);
            valorNumerico += gastoAdicional;
            capacidadEndedudamiento.setGastoVaribales(valorNumerico);

            System.out.print("Desea ingresar más gastos adicionales (SI/NO): ");
            entrada = in.next();
        }
        capacidadEndedudamiento.getCapacidadEndeudamiento();
    }

    public static boolean isNumeric(String value) {
        try {
            Integer.parseInt(value);
            return true;
        }
        catch (NumberFormatException nfe){
            return false;
        }

    }
}