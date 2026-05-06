package GELoL;

import java.util.ArrayList;

public class EquipoLoL {
      private String nombreEquipo;
      private ArrayList<String> jugadores;

      public EquipoLoL(String nombreEquipo) throws Exception {
          setNombreEquipo(nombreEquipo);
          this.jugadores = new ArrayList<>();
      }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) throws Exception {
         if (nombreEquipo.isEmpty()) {
             throw new CadenaVaciaException("El nombre está vacío.");
         } else if (nombreEquipo.length() < 3) {
             throw new Exception("Nombre muy corto");
         }
        this.nombreEquipo = nombreEquipo;
    }

    public ArrayList<String> getJugadores() throws Exception {
          if (jugadores.isEmpty()) {
              throw new Exception("El equipo está vacío.");
          }
        return jugadores;
    }

    public void setJugadores(ArrayList<String> jugadores) throws NullPointerException {
          if (jugadores == null) {
              throw new NullPointerException();
          }
        this.jugadores = jugadores;
    }

    public void ficharJugador(String nombre) throws Exception {
          if (jugadores.contains(nombre)) {
              throw new Exception("Este jugador ya está en el equipo.");
          } else if (nombre.isEmpty()) {
              throw new CadenaVaciaException("El nombre del jugador está vacío.");
          } else if (jugadores.size() == 5) {
              throw new Exception("No se puede añadir más jugadores.");
          }
          jugadores.add(nombre);
    }

    public void expulsarJugador(String nombre) throws Exception {
          if (!jugadores.contains(nombre)) {
              throw new Exception("Este jugador no está en el equipo.");
          }
          jugadores.remove(nombre);
    }

    public void cambiarPosicion (int actual, int nueva) throws Exception {
          if (actual == nueva) {
              throw new Exception("Indices no pueden ser iguales.");
          }
          if (actual < 0 || nueva < 0 || actual > jugadores.size() - 1 || nueva > jugadores.size() - 1) {
              throw new Exception("Indices no validos.");
          }
          String tmp = jugadores.get(actual);
          jugadores.set(actual, jugadores.get(nueva));
          jugadores.set(nueva, tmp);
    }

    public void mostrarAlineacion() throws Exception {
          if (jugadores.isEmpty()) {
              throw new CadenaVaciaException("El equipo está vacío.");
          }
          for (int i = 0; i < jugadores.size(); i++) {
              System.out.println(i + ": " + jugadores.get(i));
          }
    }

    public void jugar() throws Exception {
        if (jugadores.size() != 5) {
            throw new Exception("No se puede inicar el juego con menos de 5 jugadores.");
        }
        System.out.println("Jugando...");
    }
}
