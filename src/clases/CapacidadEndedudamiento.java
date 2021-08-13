package clases;

public class CapacidadEndedudamiento {
    Integer ingresosTotales;
    Integer gastosFijos;
    Integer gastoVariables;
    final double POR_FIJO = 0.35;

    public Integer getIngresosTotales() {
        return ingresosTotales;
    }

    public void setIngresosTotales(Integer ingresoTotal) {
        this.ingresosTotales = ingresoTotal;
    }

    public Integer getGastoFijo() {
        return gastosFijos;
    }

    public void setGastosFijos(Integer gastoFijo) {
        this.gastosFijos = gastoFijo;
    }

    public Integer getGastoVariable() {
        return gastoVariables;
    }

    public void setGastoVariables(Integer gastoVariable) {
        this.gastoVariables = gastoVariable;
    }

    @Override
    public String toString() {
        return  "ingresosTotales = " + getIngresosTotales() +
                ", gastosFijos = " + getGastoFijo() +
                ", gastoVariables = " + getGastoVariable();
    }

    public String capacidadEndeudamiento() {
        double capacidadEndeudamiento = (getIngresosTotales() - getGastoFijo() - getGastoVariable()) * POR_FIJO;
        return "Su capacidad de endeudamiento es: "+capacidadEndeudamiento;
    }
}