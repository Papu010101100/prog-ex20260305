public class Alumno {
// Declarar atributos
    public class Alumnos {
        private int id;
        private String nombre;
        private String tituloFP;
        private int edad;
}
// Metodo constructor
    public Alumno(int id, String nombre, String tituloFP, int edad){

        this.id = id;
        this.nombre = nombre;
        this.tituloFP = tituloFP;
        this.edad = edad;
    }
}
// Metodos Getter
    public int getId(){
          return getid;
}
    public string getNombre(){
        return getNombre;
}
    public string getTituloFP() {
        return getTituloFP;
}
    public int edad(){
    return getEdad;
}

// Metodo toString
@Override
public String toString() {
    StringBuilder sb = new StringBuilder("Alumno{");

    sb.append(String.format("\n id: %d;", id));
    sb.append(String.format(" nombre: %s;", nombre));
    sb.append(String.format(" tituloFP: %s;", tituloFP));
    sb.append(String.format(" edad: %d;", edad));
    sb.append("}");

    return sb.toString();
}
