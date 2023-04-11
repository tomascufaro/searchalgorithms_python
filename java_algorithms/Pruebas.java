package java_algorithms;
public class Pruebas {
    
    public static void main(String[] args) throws Exception {
    Lista lista = new Lista();
    lista.agregarAlFinal(12);
    lista.agregarAlFinal(15);
    lista.agregarAlFinal(9);
    lista.agregarAlInicio(41);
    lista.agregarAlInicio(6);
    // lista.removerPorReferencia(12);
    lista.listar();
    System.out.println(lista.obtenerValor(3));
   
    }
   }

