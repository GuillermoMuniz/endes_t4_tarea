import java.util.ArrayList;

// Clase que corresponde al objeto Concesionario.

public class Concesionario {



    // Sería una lista de autos disponibles en el concesionario con una lista en un método privado
    private ArrayList<Auto> autos;
    // Constructor de la clase Concesionario
    // Inicializa la lista de autos
    public Concesionario() {
        autos = new ArrayList<>();
    }

    //Agregamos un auto al inventario del concesionario

    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    // Se obtiene la lista de autos en el inventario del concesionario, con su return de lista de autps en el concesionario
    public ArrayList<Auto> listarAutos() {
        return autos;
    }

    // Imprimimos la información de los autos en el inventario.
    public void imprimirAutos(){
        for (Auto auto: autos){
            System.out.println(auto);
        }
    }
}

