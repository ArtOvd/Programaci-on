package SmartSafe;

import java.util.ArrayList;
import java.util.List;

public class SmartSafeMain {

    public static void main(String[] args) {
        ArrayList<Dispositivo> dispositivos = new ArrayList<>();
            CamaraSeguridad c1 = new CamaraSeguridad(1, "Camara1");
            SensorHumo s1 = new SensorHumo(11, "Sensor1");
            LucesEmergencia l1 = new LucesEmergencia(21, "LucesEmergencia1");
            dispositivos.add(c1);
            dispositivos.add(s1);
            dispositivos.add(l1);

            for(Dispositivo dispositivo : dispositivos){
                if (dispositivo instanceof IActivable ia){
                    ia.encender();
                }
                if (dispositivo instanceof IMantenimiento im){
                    if (im.realizarTest()) {
                        System.out.println("El dispositivo " + dispositivo.modelo + " se ha realizado el test");
                    } else {
                        System.out.println("El dispositivo " + dispositivo.modelo + " no se ha realizado el test");
                    }
                }
            }
    }

}
