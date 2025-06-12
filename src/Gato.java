public class Gato extends Animal {
  public Gato(String nombre, int edad) {
    // Con super llamamos al constructor de la superclase (informacion heredada)
    super(nombre, edad);
  }

  // Override subscribe un metodo
  @Override
  public String hacerSonido() {
    return "Miau!";
  }
}
