public class AeropuertoException extends Exception{
    public static final String ERRORLLENO = "ya no hay reservas, no hay asientos disponibles.";
    public static final String ERRORRESERVA = "Pasajero ya posee una reserva en el vuelo.";
    public static final String ERRORNODISPONIBLE = "No es posible hacer reserva, vuelo cancelado o no disponible.";
    public static final String ERRORPASAPORTEINVALIDO = "Pasaporte no valido";


    public AeropuertoException(String message){
        super(message);
    }

}
