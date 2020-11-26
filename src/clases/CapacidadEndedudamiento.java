package clases;

public class CapacidadEndedudamiento {
    Integer ingresosTotales;
    Integer gastosFijos;
    Integer gastoVaribales;
    final double POR_FIJO = 0.35;

    public Integer getIngresosTotales() {
        return ingresosTotales;
    }

    public void setIngresosTotales(Integer ingresosTotales) {
        this.ingresosTotales = ingresosTotales;
    }

    public Integer getGastosFijos() {
        return gastosFijos;
    }

    public void setGastosFijos(Integer gastosFijos) {
        this.gastosFijos = gastosFijos;
    }

    public Integer getGastoVaribales() {
        return gastoVaribales;
    }

    public void setGastoVaribales(Integer gastoVaribales) {
        this.gastoVaribales = gastoVaribales;
    }


    public void getCapacidadEndeudamiento() {
        System.out.print("Su capacidad de endeudamiento es: "+ (getIngresosTotales() - getGastosFijos() - getGastoVaribales()) * POR_FIJO);
    }
}