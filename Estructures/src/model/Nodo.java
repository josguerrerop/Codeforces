package model;

public class Nodo {
    Object datos;
    Nodo siguienteNodo;

    public Nodo(Object objeto)
    {
        this(objeto, null);
    }
    
    public Nodo(Object objeto, Nodo nodo)
    {
        datos= objeto;
        siguienteNodo = nodo;
    }

    public Object obtenerObjeto()
    {
        return datos;
    }

    //devolver referencia al siguiente nodo en la lista
    public Nodo obtenerSiguiente()
    {
        return siguienteNodo;
    }
    
}
