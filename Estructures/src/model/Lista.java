package model;


public class Lista {
    private Nodo primerNodo;
    private Nodo ultimoNodo;
    private String nombre;

    public Lista (String nombreLista)
    {
        nombre = nombreLista;
        primerNodo = ultimoNodo = null;
    }

    public boolean estaVacia(){
       return primerNodo == null;  // devolver true si la Lista está vacía
    }

    public void insertarAlFrente (Object elemento)
    {
       if (estaVacia())
          primerNodo = ultimoNodo = new Nodo(elemento);
       else
          primerNodo = new Nodo(elemento, primerNodo);
    }

    public void insertarAlFinal (Object elemento)
    {
       if (estaVacia())
          primerNodo = ultimoNodo = new Nodo(elemento);
       else {
          Nodo n = new Nodo(elemento);
          ultimoNodo.siguienteNodo = n;
          ultimoNodo = n;
        }
    }

    public Object eliminarDelFrente() throws RuntimeException
    {
        if (!estaVacia()) {
            Object elementoEliminado = primerNodo.datos;

            if (primerNodo == ultimoNodo)
                primerNodo = ultimoNodo = null;
            else
                primerNodo = primerNodo.siguienteNodo;

            return elementoEliminado;
        } else {
            throw new RuntimeException(nombre);
        }
    }

    public Object eliminarDelFinal() throws RuntimeException{
       if (!estaVacia()) {
            Object elementoEliminado = ultimoNodo.datos;
            if (primerNodo == ultimoNodo)
                primerNodo = ultimoNodo = null;
            else {
                Nodo actual = primerNodo;
                while (actual.siguienteNodo != ultimoNodo) {
                    actual = actual.siguienteNodo;
                    }
                ultimoNodo = actual;
                actual.siguienteNodo = null;
            }
            return elementoEliminado;
        } else {
            throw new RuntimeException(nombre);
        }
    }
    
    public void imprimir()
    {
       if (estaVacia()){
          System.out.println(nombre + " vacia." );
          return;
       }
        System.out.print ("Nodos de la lista " + nombre + ":\n");
        Nodo actual = primerNodo;
        while (actual != null)
        {
            System.out.print (actual.datos.toString() + "\n");
            actual = actual.siguienteNodo;
        }
    }

    public Nodo darNodoInicial(){
        return primerNodo;
    }

    public static void main(String[] args){
     Object obj1 = "1";
     Object obj2 = "2";
     Object obj3 = "3";
     Object obj4 = "4";
     Lista list = new Lista("xd");
     list.insertarAlFrente(obj1);
      list.insertarAlFrente(obj2);
        list.insertarAlFrente(obj3);
          list.insertarAlFrente(obj4);
            list.imprimir();
              list.eliminarDelFinal();
                list.imprimir();
    }
}
