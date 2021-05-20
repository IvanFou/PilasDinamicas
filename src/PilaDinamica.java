import javax.swing.*;
import java.nio.file.FileStore;

public class PilaDinamica {
    private NodoPila Tope;
    private NodoPila Raiz;
    private NodoPila Inicio;
    String msg;

    // Constructor de la clase que asegura que al inicio la Pila esté Vacía
    public PilaDinamica(){
        Tope = null;
        Raiz = null;
        Inicio = null;
    }


    // Función que muestra los avisos apropiados a la situación de ejecución
    void Aviso (String msg){
        JOptionPane.showMessageDialog(null, msg);
    }


    // Función que indica si la Pila está llena -en función del Nodo a crear
    boolean PilaLlena(NodoPila NodoX){
        boolean status = false;

        if (NodoX == null) status = true;

        return(status);
    }

    // Método que indica si la Pila está vacía -en función del Tope
    boolean PilaVacia(){
        boolean status = false;

        if (Tope == null) status = true;

        return(status);
    }


    // Función que crea un nuevo nodo para insertarlo en la pila
    void Push(Object dato){
        NodoPila Nodo = new NodoPila(dato);
        NodoPila Nodos = new NodoPila(dato);

        if (PilaLlena(Nodo)) {
            msg = "ERROR, la Pila está LLENA!!";
        }
        else{

            if (PilaVacia()){
                Nodo.Ant = Tope; // Nodo en la parte Ant apunta a donde apunta el Tope
                Tope = Nodo; // Tope apunta al Nodo
                Nodos.Iniciar = Tope;
                Inicio = Nodos.Iniciar;
            }
                Nodo.Ant = Tope;
                Tope = Nodo;
                msg = "El dato se agregó el valor a la Pila!!";
                Nodo.Sig = Raiz;
                Raiz = Nodo;
        }
        Aviso(msg);
    }


    // Función que extrae el nodo de la cima o tope de la Pila
    Object Pop(){
        Object datoX;
        NodoPila aux;

        aux = Tope;
        datoX = aux.Info;
        Tope = aux.Ant;
        aux = null;

        return(datoX);
    }

    //Funcion que muestra el primer dato de la pila
    Object StackRaiz(){
        Object datoY;

        NodoPila min = null;
        min = Inicio;
        datoY = min.Info;
        min = null;

        return(datoY);
    }

    // Función que muestra o consulta el nodo en la cima de la Pila
    Object StackTop(){
        Object datoX;

        NodoPila aux = null;

        aux = Tope;
        datoX = aux.Info;
        aux = null;

        return(datoX);
    }


}

