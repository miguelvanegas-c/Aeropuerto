import java.util.ArrayList;
import java.util.List;

public class Vuelo {
    private String destino;
    private boolean disponible;
    private Avion avion;

    public Vuelo(String destino, Avion avion, boolean disponible) {
        this.avion = avion;
        this.destino = destino;
        this.disponible = disponible;
    }

    public void cancelarVuelo(){
        disponible = false;
        List<Pasajero> pasajeros = avion.getPasajeros();
        for(Pasajero pasajero: pasajeros){
            pasajero.setTieneReserva(false);
        }
        pasajeros.clear();
    }

    public void reservarAsiento(Pasajero pasajero) throws AeropuertoException{
        if(Avion.estaLleno()) {
            throw new AeropuertoException(AeropuertoException.ERRORLLENO);
        }
        if (!disponible){
            throw new AeropuertoException(AeropuertoException.ERRORNODISPONIBLE);
        }
        avion.getPasajeros().add(pasajero);
    }
}