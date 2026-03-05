// Creacion de aaray y gestion de conjunto de alumnos
public class CentroFP {

    private Alumno[] alumnos;
    private final int MAX_ALUMNOS;
}
// Construcor
public CentroFP (int maximo_alumnos){
    MAX_ALUMNOS = maximo_alumnos ;
    alumnos = new Alumno[MAX_ALUMNOS];
}
// Metodo buscar alumno
public Alumno buscarAlumno (int idAlumno){
    boolean seguirBuscando = true;
    Alumno AlumnoEncontrado = null;
// Bucle buscar alumno
    for (int i = 0; i < MAX_ALUMNOS && seguirBuscando; i++) {
        if( alumnos[i] != null && alumnos[i].getId() == idAlumno ){
            seguirBuscando = false;
            alumnoEncontrado = alumnos[i];
        }
    }

    return alumnoEncontrado;
}

// Metodo busca del primer hueco vacio y de no conseguirlo devuelve -1
private int buscarPrimerHuecoVacio(){
int posicion = -1;
boolean seguirBuscando = true;

        for (int i = 0; i < MAX_ALUMNOS; i++) {
        if (alumnos[i] == null){
posicion = i;
seguirBuscando = false;}

        }
        return posicion;
}

