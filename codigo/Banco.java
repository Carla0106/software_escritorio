
public class Banco {
    
    private int numeracion , año;
    private String nombreTarjeta;
    private boolean vip;
    private double saldo , id;
    
    public Banco () {
    }
    
    public Banco (int numeracion , int año , String nombreTarjeta , boolean vip , double saldo , double id) {
        this.numeracion = numeracion;
        this.año = año;
        this.nombreTarjeta = nombreTarjeta;
        this.vip = vip;
        this.saldo = saldo;
        this.id = id;
    }
    
    public int getNumeracion (){
        return numeracion;
    }
    public void setNumeracion (int numeracion){
    this.numeracion = numeracion;
    }
    public int getAño (){
    return año;
    }
    public void setAño (int año){
    this.año = año;
    }
    public String getNombreTarjeta (){
    return nombreTarjeta;
    }
    public void setNombreTarjeta (String nombreTarjeta){
    this.nombreTarjeta = nombreTarjeta;
    }
    public boolean getVip (){
    return vip;
    }
    public void setVip (boolean vip){
    this.vip = vip;
    }
    public double getSaldo (){
    return saldo;
    }
    public void setSaldo (double saldo){
    this.saldo = saldo;
    }
    public double getId (){
    return id;
    }
    public void setId (double id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Banco{" + "numeracion=" + numeracion + ", a\u00f1o=" + año + ", nombreTarjeta=" + nombreTarjeta + ", vip=" + vip + ", saldo=" + saldo + ", id=" + id + '}';
    }
    
    
}