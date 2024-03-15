/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Estudiantes
 */
public class Circulo extends Figura{
    float radio;
    float diametro=radio*2;
    @Override
    public void calcularArea() {
        this.area= (float) (radio*Math.PI);
    }
    @Override
    public void calcularPerimetro() {
        this.perimetro= (float) (diametro*Math.PI);
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }
    
}
