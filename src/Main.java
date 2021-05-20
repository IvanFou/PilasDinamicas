import javax.swing.*;
import java.lang.*;


    // Clase principal
    class miPilaDinamica{
    // Función que muestra los avisos adecuados durante la ejecucíon
    static void Aviso (String msg){
        JOptionPane.showMessageDialog(null, msg);
    }

    // Método principal de la Interfz del usuario
    public static void main(String args[]){
        PilaDinamica miPila = new PilaDinamica();
        int op = 0;
        Object dato;
        Object datoy;
        String msg;

        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Operaciones con la Pila\n1.-Push\n2.-Pop\n3.-StockTop\n0.-Terminar"));
            switch (op) {
                case 1:
                    dato=JOptionPane.showInputDialog("Dato a insertar");
                    miPila.Push(dato);

                    break;

                case 2:
                    if (miPila.PilaVacia()){
                        msg = "ERROR... La Pila está VACIA!!";
                        Aviso(msg);
                    }
                    else{
                        dato = miPila.Pop();
                        JOptionPane.showMessageDialog(null, "Dato EXTRAIDO de la pila:" +dato);
                    }

                    break;

                case 3:
                    if (miPila.PilaVacia()) {
                        msg = "ERROR... La Pila está VACIA!!";
                        Aviso(msg);
                    }
                    else{
                        dato = miPila.StackTop();
                        datoy = miPila.StackRaiz();
                        JOptionPane.showMessageDialog(null, "El primer dato de la pila es: " + datoy);
                        JOptionPane.showMessageDialog(null, "Dato en la CIMA de la pila:" +dato);
                    }

                    break;
            }
        } while(op != 0);
        System.exit(0);
    }
}
