package Interfaz;

import Interfaz.interfaces.Alimentable;
import Interfaz.interfaces.Comunicacion;

public class Pulpo extends CriaturasMarinas implements Comunicacion, Alimentable {
  int cantidadTentaculos;

  public Pulpo(String nombre, int cantidadTentaculos) {
    super(nombre);
    this.cantidadTentaculos = cantidadTentaculos;
  }

  @Override
  public void nadar() {
    System.out.println(nombre + " Pulpo nadando");
  }

  @Override
  public void comunicarse() {
    System.out.println("Pulpo comunicando");
  }

  @Override
  public void alimentarse() {
    System.out.println("Pulpo alimentando");
  }
}
