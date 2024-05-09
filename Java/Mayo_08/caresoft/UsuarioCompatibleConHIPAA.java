package Mayo_08.caresoft;

public interface UsuarioCompatibleConHIPAA {

    abstract boolean assignPin(int pin);

    abstract boolean accessAuthorized(Integer confirmedAuthID);

}
