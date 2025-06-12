public class App {
    public static void main(String[] args) throws Exception {
        Carrera c = new Carrera();
        c.nombre = "Ingeniería de Software";
        c.duracion = 10;
        c.estaEnCurso = true;

        Persona p = new Persona();
        p.nombre = "Domenica";
        p.apellido = "Cañizares";
        p.edad = 25;
        p.tecnologias = new String[] { "Java", "Typescript", "React" };
        p.esEstudiante = true;
        p.carrera = c;

        System.out.println(p.darNombreCompleto() + " " + p.edad);

        String saludado = "Domenica";
        System.out.println(p.enviarSaludo(saludado));

        System.out.println(p.carrera.nombre);

    }
}
