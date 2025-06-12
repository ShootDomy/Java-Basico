public class Persona {
  // Atributos
  private String nombre;
  private String apellido;
  private int edad;
  // String[] tecnologias;
  // boolean esEstudiante;
  // Carrera carrera;

  // Constructores
  public Persona(String nombre, String apellido, int edad
  // String nombreCarrera, int duracion, boolean estaEnCurso
  ) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    // this.tecnologias = tecnologias;
    // this.esEstudiante = esEstudiante;
    // carrera = new Carrera(nombreCarrera, duracion, estaEnCurso);
    // carrera.nombre = nombreCarrera;
  }

  // Metodos
  public String darNombreCompleto() {
    return nombre + " " + apellido;
  }

  public String enviarSaludo(String saludado) {
    return "Hola, ¿como estas? " + saludado;
  }

  // Getters y setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }
}
