
package ultimo;


public class hora {
private byte mi;
private byte ca;
private byte io;

hora(byte h,byte m,byte s){
    if(!horaValida(h,m,s)){
        this.mi = h;
        this.ca = m;
        this.io =s;
    }
}
public boolean horaValida(byte h,byte m,byte s){
    if((h>=0 && h<=24) &&(m>=0 && m<=60) && (s>=0 && s<=60)){
        return false;
    }
    System.out.println("Hora não valida!");
    
    return true;
}
public String toString(){
    String x;
    x = mi+"/"+ca+"/"+io;
    return x;
}


}
