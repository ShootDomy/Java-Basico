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

        // Persona p = new Persona("Domenica", "Cañizares", 25/* , "Ingeniería de
        // Software", 10, true */);

        // System.out.println(p.darNombreCompleto() + " " + p.getEdad());

        // String saludado = "Domenica";
        // System.out.println(p.enviarSaludo(saludado));

        // System.out.println(p.carrera.nombre);

        Animal animal = new Animal("Bestia", 10);
        Gato gato = new Gato("Gatito", 5);
        Perro perro = new Perro("Perrito", 7);

        System.out.println("Animal: " + animal.nombre + " " + animal.edad + " Hace sonido: " + animal.hacerSonido());
        System.out.println("Animal: " + gato.nombre + " " + gato.edad + " Hace sonido: " + gato.hacerSonido());
        System.out.println("Animal: " + perro.nombre + " " + perro.edad + " Hace sonido: " + perro.hacerSonido());
    }
}
