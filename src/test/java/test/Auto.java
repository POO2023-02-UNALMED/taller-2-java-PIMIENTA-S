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
        boolean estado = true;
        if (motor.registro != registro){
            estado = false;
        }
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] != null && asientos[i].registro != registro) {
                    estado = false;
                    break;
            }
        }

        if (estado){
            return ("Auto original");
        } else {
            return("Las piezas no son originales");
        }
    }
}
