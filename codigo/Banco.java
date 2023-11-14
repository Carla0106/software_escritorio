
public class Banco {

    private static void add(Banco banco) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private double id  ; 
    private boolean deuda;
     private int antiguedad;
    
    public Banco () {
    }
    
    public Banco ( int id , boolean deuda , int antiguedad  ){
         this.id = id ;
         this.deuda = deuda ;
         this.antiguedad = antiguedad;
    }
    public double getId (){
    return id;
    }
    public void setId (double id) {
    this.id = id;
    }
    public boolean getDeuda(){
    return deuda;
    }
    public void setDeuda(boolean deuda){
    this.deuda = deuda;
    }
    public int getAntiguedad(){
    return antiguedad;
    }
    public void setAntiguedad(int antiguedad){
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString (){
    return "ID{" + id +
            ",Antiguedad:" + antiguedad +
            ", Deuda:" + deuda +'}';
    }
}