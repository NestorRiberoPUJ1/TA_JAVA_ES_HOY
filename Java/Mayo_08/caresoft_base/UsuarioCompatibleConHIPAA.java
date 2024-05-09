package Mayo_08.caresoft_base;

public interface UsuarioCompatibleConHIPAA {

    abstract boolean assignPin(int pin);

    abstract boolean accessAuthorized(Integer confirmedAuthID);

}
