package Interfaz;

import Interfaz.interfaces.Alimentable;
import Interfaz.interfaces.Comunicacion;

public class Delfin extends CriaturasMarinas implements Comunicacion, Alimentable {

  public Delfin(String nombre) {
    super(nombre);
  }

  @Override
  public void nadar() {
    System.out.println(nombre + " Delfin nadando");
  }

  @Override
  public void comunicarse() {
    System.out.println("Delfin comunicando");
  }

  @Override
  public void alimentarse() {
    System.out.println("Delfin alimentando");
  }
}
