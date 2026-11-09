package controlador;

import java.time.LocalDate;

public class ControladorClientes {
        public static boolean comprobarFecha(LocalDate fecha) {
        if (fecha.getYear() >= 1900 && fecha.getYear() <= 2015) {
            return true;
        } else {
            return false;
        }
    }

    
    public static boolean ComprobarPuntos(String puntos) {
        if(Integer.parseInt(puntos)>=0 && Integer.parseInt(puntos)<=1000){
            return true;
        }else{
            return false;
        }
    }
}
