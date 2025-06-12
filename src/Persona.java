public class Persona {
  // Atributos
  String nombre;
  String apellido;
  int edad;
  String[] tecnologias;
  boolean esEstudiante;
  Carrera carrera;

  // Metodos
  public String darNombreCompleto() {
    return nombre + " " + apellido;
  }

  public String enviarSaludo(String saludado) {
    return "Hola, ¿como estas? " + saludado;
  }
}
