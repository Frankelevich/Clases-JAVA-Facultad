package Ejercicios_LAB2;

public interface Instrumento {
    String notas[] = {"do","re","mi","fa","sol","la","si"};
    double ritmo[]={4.0,2.0,1.0,0.5,0.25};
    abstract void Sonar(String notas,double ritmo);
}
