import Java.Util.List
import Java.Util.ArrayList;
@ Datos
public Class avion{
    private int capacidad;
    private List<Pasajero>pasajeros = new ArrayList<>>;
    public Avion(int capacidad){
        this.capacidad=capacidad;
    }
    public boolean LLeno(){
        if (capacidad= pasajeros.size()){
            return true;
        }
        return Falso;
    }
    public void agregarPasajero(pasajero pasajero){
        pasajero.add(pasajero);
    }
}

