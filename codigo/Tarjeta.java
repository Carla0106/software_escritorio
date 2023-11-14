
public class Tarjeta extends Banco{
    private int numeracion , año;
    private String nombreTarjeta;
     private boolean vip;
     private double saldo;
    
    public Tarjeta (){
    }
    
    public Tarjeta (int numeracion , int año , String nombreTarjeta , boolean vip, double saldo) {
    this.numeracion = numeracion;
    this.año = año;
    this.nombreTarjeta = nombreTarjeta;
    this.vip = vip;
    this.saldo = saldo;
    }
    public int getNumeracion(){
    return numeracion;
    }
    public void setNumeracion(int numeracion){
    this.numeracion = numeracion;
    }
    public int getAño(){
    return año;
    }
    public void setAño(int año){
    this.año = año;
    }
    public String getNombreTarjeta(){
    return nombreTarjeta;
    }
    public void setNombreTarjeta(String nombreTarjeta){
    this.nombreTarjeta = nombreTarjeta;
    }
    public boolean getVip(){
    return vip;
    }
    public void setVip(boolean vip){
    this.vip = vip;
    }
    public double getSaldo(){
    return saldo;
    }
    public void setSaldo(double saldo){
    this.saldo = saldo;
    }
    @Override
    public String toString(){
    return "Tarjeta{" + 
            "Nombre de la Tarjeta:" + nombreTarjeta + 
            "Numeracion:" + numeracion + 
            "Año" + año + 
            "Saldo:" + saldo + 
            "Vip?:" + vip + 
            "}";
    } 
}
