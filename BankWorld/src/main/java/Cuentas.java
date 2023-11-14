import java.util.ArrayList;
import java.util.List;

public class Cuentas extends Banco{
 
    private final List<Cliente> clientes = new ArrayList<>();

  
    public void agregarCliente(Cliente cliente){
     clientes.add(cliente);
 }    
}
