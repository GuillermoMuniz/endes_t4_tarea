import java.util.ArrayList;

// Clase que corresponde al objeto auto
public class Auto {

// Atributos privados de la clase auto con String marca
    private String marca;

// Atributos privados de la clase auto con String modelo
    private String modelo;

// Constructor de la clase Auto, marca del auto y el modelo del auto
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

// Obtenemos la marca del auto y return la marca del vehículo
    public String getMarca() {
        return marca;
    }

// Establecemos una marca para el auto como marca nueva y marca del auto
    public void setMarca(String marca) {
        this.marca = marca;
    }

// Obtenemos el modelo del auto y return a el modelo del auto
    public String getModelo() {
        return modelo;
    }

// Establecemos el modelo del auto como nuevo modelo del auto
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

// Reescribimos el metodo toString para representar en cadena el objeto Auto
    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
    }
}


