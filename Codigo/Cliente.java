
public class Cliente extends Banco{
    
    private String nombre ,usuario , password; 
    private int sueldo, edad, antiguedad;
    private char sexo;
    private boolean deuda;

    /*public Cliente(String nombre, String usuario, String password, int sueldo, int edad, int antiguedad, char sexo, boolean deuda) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.password = password;
        this.sueldo = sueldo;
        this.edad = edad;
        this.antiguedad = antiguedad;
        this.sexo = sexo;
        this.deuda = deuda;
    }*/

    public Cliente(String nombre, String usuario, String password, int sueldo, int edad, int antiguedad, char sexo, boolean deuda, int numeracion, int año, String nombreTarjeta, boolean vip, double saldo, double id) {
        super(numeracion, año, nombreTarjeta, vip, saldo, id);
        this.nombre = nombre;
        this.usuario = usuario;
        this.password = password;
        this.sueldo = sueldo;
        this.edad = edad;
        this.antiguedad = antiguedad;
        this.sexo = sexo;
        this.deuda = deuda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isDeuda() {
        return deuda;
    }

    public void setDeuda(boolean deuda) {
        this.deuda = deuda;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", usuario=" + usuario + ", password=" + password + ", sueldo=" + sueldo + ", edad=" + edad + ", antiguedad=" + antiguedad + ", sexo=" + sexo + ", deuda=" + deuda + '}';
    }
    
    
    
    
    
    
    
    
    
}
