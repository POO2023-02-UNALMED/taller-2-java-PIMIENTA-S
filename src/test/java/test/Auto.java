package test;

public class Auto {
    String modelo;
    int precio;
    static Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    int cantidadCreados;

    int cantidadAsientos(){
        int totalAsientos = 0;
        for (Asiento asiento : asientos) {
            if (asiento != null) {
                totalAsientos++;
            }
        }
        return totalAsientos;
    }
    String verificarIntegridad(){
        if (registro == motor.registro){
            for (Asiento asiento : asientos){
                if (asiento != null){
                    if (asiento.registro != registro){
                        return ("Las piezas no son originales");
                    }
                }
            }
            return("Auto original");
        } else {
            return ("Las piezas no son originales");
        }
    }
}