@ Dato
public Class Vuelo{
    private String destino;
    private boolean disponible;
    private Avion avion ;
    public Vuelo(>String destino, Avion avion ,boolean disponible){
        this.destino=destino;
        this.avion=avion;
        this.disponible=disponible;
    public void canceladorVuelo() Throws Areropuerto Exception{
        if (avion.getPasajeros().size()>0){
            Throw new Areropuerto Exception ( Areropuerto Exception. ERROR Reserva);
        }
        disponible = false;
    }
    public void reservaAsiento(Pasajero pasajero) Throw Areropuerto Exception;
    if(avion.estaLLeno()){
        Throw new Areropuerto Exception(Areropuerto Exception.ERRORLLeno)
    }
    avion.getPasajeros().add(pasajero);
    }
}