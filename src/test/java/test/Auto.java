package test;

public class Auto {
    String modelo;
    int precio;
    static Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    int cantidadCreados;

    public int cantidadAsientos(){
        int totalAsientos = 0;
        for (Asiento asiento : asientos) {
            if (asiento != null) {
                totalAsientos++;
            }
        }
        return totalAsientos;
    }
    public String verificarIntegridad(){
        if (this.registro == this.motor.registro){
            for (Asiento asiento : asientos){
                if (asiento != null){
                    if (this.registro != asiento.registro){
                        return ("Las piezas no son originales")
                    }
                }
            }
            return("Auto original")
        } else {
            return ("Las piezas no son originales")
        }
    }
}