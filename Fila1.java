package filadeimpressao;

public class Fila1{
private static Fila1 instancia;

private Fila1(){

}

public static Fila1 getInstancia(){
    if (instancia == null){
        instancia = new Fila1();
    }
    



}

}