
package ultimo;
public class data {
    private byte micaio;
    private byte xxmicaio;
    private short xmicaio;
    data(byte d,byte m,short a){
        if(!dataValida(d,m,a)){
            this.xmicaio = a;
            this.micaio = d;
            this.xxmicaio = m;
        }
    }
    public boolean dataValida(byte d,byte m,short a){
      if((d>=1 && d<=31) && (m>=1 && m<=12) && (a>0)){
          return false;
      }System.out.println("Data não valida!");  
      return true;  
    }
   
    public String toString(){
        String x;
        x = micaio +"/"+xxmicaio+"/"+xmicaio;
        return x;
    }
    
}
