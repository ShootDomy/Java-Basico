package basico;

public class Animal {
  String nombre;
  int edad;
  static int contadorAnimales = 0;

  public Animal(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
    contadorAnimales++;
  }

  public String hacerSonido() {
    return "Hacer sonido generico";
  }

  public static int getContadorAnimales() {
    return contadorAnimales;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public static void setContadorAnimales(int contadorAnimales) {
    Animal.contadorAnimales = contadorAnimales;
  }

}
