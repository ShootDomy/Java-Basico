public class App {
    public static void main(String[] args) throws Exception {
        // Carrera c = new Carrera();
        // c.nombre = "Ingeniería de Software";
        // c.duracion = 10;
        // c.estaEnCurso = true;

        // Persona p = new Persona();
        // p.nombre = "Domenica";
        // p.apellido = "Cañizares";
        // p.edad = 25;
        // p.tecnologias = new String[] { "Java", "Typescript", "React" };
        // p.esEstudiante = true;
        // p.carrera = c;

        Persona p = new Persona("Domenica", "Cañizares", 25/* , "Ingeniería de Software", 10, true */);

        System.out.println(p.darNombreCompleto() + " " + p.getEdad());

        String saludado = "Domenica";
        System.out.println(p.enviarSaludo(saludado));

        // System.out.println(p.carrera.nombre);
    }
}
