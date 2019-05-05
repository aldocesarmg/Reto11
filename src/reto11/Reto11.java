
package reto11;

public class Reto11 {

    public static void main(String[] args) {
        
        Principe personajeBuscado = new Principe("Augusto", 23, 1.85);
        Principe propuesta2 = new Principe("Augusto", 23, 1.85);
        Principe propuesta3 = new Principe("Guillermo", 30, 1.75);
        
        if (personajeBuscado.getNombre().equals(propuesta3.getNombre()) && personajeBuscado.getEdad() == propuesta3.getEdad() && personajeBuscado.getAltura() == propuesta3.getAltura()){
            System.out.println("Era el personaje que estaba buscando");
        }else{
            System.out.println("Seguiré buscando");
        }
        
        if (personajeBuscado.getNombre().equals(propuesta2.getNombre())) {
            System.out.println("Era el personaje que estaba buscando");
        }else{
            System.out.println("Seguiré buscando");
        }
    }
    
}
