package test;

public class Asiento {
    String color;
    int precio;
    int registro;
    public void cambiarColor(String color){
        if (color == "rojo" || color == "amarillo" || color == "verde" || color == "negro" || color == "blanco"){
            this.color = color;
        }

    }


}