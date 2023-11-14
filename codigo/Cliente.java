import java.util.ArrayList;

public class Cliente extends Banco{
    private String nombre ,usuario , password; 
    private int sueldo, edad;
    private char sexo;
    
    public Cliente (){
    }
    
    public Cliente (String nombre ,String usuario, String password, int sueldo , int edad, char sexo){
    this.nombre = nombre;
    this.usuario = usuario;
    this.password = password;
    this.sueldo = sueldo;
    this.edad = edad;
    this.sexo = sexo;
    }

    public String getnombre (){
    return nombre;
    }
    public void setnombre (String nombre){
    this.nombre = nombre;
    }
    public String getUsuario (){
    return usuario;
    }
    public void setUsuario(String usuario){
    this.usuario = usuario;
    }
    public String getPassword(){
    return password;
    }
    public void setPassword (String password){
    this.password = password;
    }
    public int getSueldo (){
    return sueldo;
    }
    public void setSueldo(int sueldo){
    this.sueldo = sueldo;
    }
    public int getEdad (){
    return edad;
    }
    public void setEdad (int edad){
    this.edad = edad;
    }
    public char getSexo(){
    return sexo;
    }
    public void setSexo(char sexo){
    this.sexo = sexo;
    }
       /* public void agregarCliente(Banco Cliente){
     Banco.add(Cliente);
        }*/
 
   @Override 
   public String toString(){
   return "Cliente{" +
           "Nombre:"+ nombre + 
           "Edad:" + edad +
           "Sexo:" + sexo +
           "Sueldo:" + sueldo +
           "Usuario:" + usuario + 
           "Contraseña" + password +
           '}';    

   }
}
    

