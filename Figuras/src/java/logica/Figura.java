/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Estudiantes
 */
public class Figura {
    String nombre;
    float area;
    float perimetro;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
    public void calcularArea() {
        this.area=0;
    }
    public void calcularPerimetro() {
        this.perimetro=0;
    }
    
}
