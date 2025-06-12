public class Persona {
  // Atributos
  String nombre;
  String apellido;
  int edad;
  // String[] tecnologias;
  // boolean esEstudiante;
  Carrera carrera;

  // Constructores
  public Persona(String nombre, String apellido, int edad,
      String nombreCarrera, int duracion, boolean estaEnCurso) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    // this.tecnologias = tecnologias;
    // this.esEstudiante = esEstudiante;
    carrera = new Carrera(nombreCarrera, duracion, estaEnCurso);
    carrera.nombre = nombreCarrera;
  }

  // Metodos
  public String darNombreCompleto() {
    return nombre + " " + apellido;
  }

  public String enviarSaludo(String saludado) {
    return "Hola, ¿como estas? " + saludado;
  }
}
