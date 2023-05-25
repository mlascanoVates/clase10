import java.util.*;

public class Boleta {
    TreeSet<Integer> boleta;

    public Boleta() {
        boleta= new TreeSet<>();
    }

    public TreeSet<Integer> getBoleta() {
        return boleta;
    }

    public void setBoleta(TreeSet<Integer> boleta) {
        this.boleta = boleta;
    }


    //Duda se agrega int o Integer
    public void addUnNumero(int numero){
        boleta.add(numero);
    }
    //PONER LOS NUMEROS DE LA BOLETA DE MENOR A MAYOR, para comparar
    //UN HASHSET NO SE PUEDE ORDER
    public void ordenarBoleta(){

    }

import java.util.*;

public class Boleta {
    TreeSet<Integer> boleta;

    public Boleta() {
        boleta= new TreeSet<>();
    }

    public TreeSet<Integer> getBoleta() {
        return boleta;
    }

    public void setBoleta(TreeSet<Integer> boleta) {
        this.boleta = boleta;
    }


    //Duda se agrega int o Integer
    public void addUnNumero(int numero){
        boleta.add(numero);
    }
    //PONER LOS NUMEROS DE LA BOLETA DE MENOR A MAYOR, para comparar
    //UN HASHSET NO SE PUEDE ORDER
    public void ordenarBoleta(){

    }
