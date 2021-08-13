package clases;

public class Mensajes {

    final String INGRESOS = "Ingrese el valor de los ingresos mensuales: ";
    final String GASTO_FIJO = "Ingrese el valor de los gastos fijos: ";
    final String GASTO_VARIABLE = "Ingrese el valor de los gastos variables: ";
    final String VALOR_INCORRECTO_INGRESO = "El valor de los ingresos no es numérico, ingresa un valor numérico";
    final String VALOR_INCORRECTO_FIJO = "El valor de los gastos fijos no es numérico";
    final String VALOR_INCORRECTO_VARIABLE = "El valor de los gastos variables no es numérico";
    final String MENSAJE_GASTOS = "Ingresa nuevamente el valor de los gastos";
    final String INGRESAR_DATOS = "¿Desea ingresar información de gastos? (SI/NO): ";

    public void ingreso(){
        System.out.print(INGRESOS);
    }

    public void gastoFijo(){
        System.out.print(GASTO_FIJO);
    }

    public void gastoVariable(){
        System.out.print(GASTO_VARIABLE);
    }

    public void valorIncorrectoIngreso(){
        System.out.println(VALOR_INCORRECTO_INGRESO);
    }

    public void valorIncorrectoFijo(){
        System.out.println(VALOR_INCORRECTO_FIJO);
    }

    public void valorIncorrectoVariable(){
        System.out.println(VALOR_INCORRECTO_VARIABLE);
    }

    public void ingresarDatos(){
        System.out.print(INGRESAR_DATOS);
    }

    public void ingresoGastos(){
        System.out.println(MENSAJE_GASTOS);
    }
}
