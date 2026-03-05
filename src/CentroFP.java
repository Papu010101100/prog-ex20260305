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

