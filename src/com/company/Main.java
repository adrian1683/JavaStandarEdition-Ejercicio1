package com.company;

import clases.CapacidadEndedudamiento;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CapacidadEndedudamiento capacidadEndedudamiento = new CapacidadEndedudamiento();
        Scanner in = new Scanner(System.in);

        System.out.println("VALIDACIÓN CAPACIDAD DE ENDEUDAMIENTO");

        System.out.print("Ingrese el valor de sus ingresos mensuales: ");
        int ingMesuales = in.nextInt();
        capacidadEndedudamiento.setIngresosTotales(ingMesuales);

        System.out.print("Ingrese el valor de sus gastos fijos: ");
        int gastoFijo = in.nextInt();
        capacidadEndedudamiento.setGastosFijos(gastoFijo);

        System.out.print("Ingrese el valor de sus gastos variables: ");
        int gastoVariable = in.nextInt();
        capacidadEndedudamiento.setGastoVaribales(gastoVariable);

        System.out.print("Desea ingresar gastos adicionales (SI/NO): ");
        String entrada = in.next();

        while (entrada.equals("SI") || entrada.equals("si")) {
            System.out.print("Ingrese otros gastos adicionales: ");
            int gastoAdicional = in.nextInt();
            gastoVariable += gastoAdicional;
            capacidadEndedudamiento.setGastoVaribales(gastoVariable);

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