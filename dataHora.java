
package ultimo;


public class dataHora {
    private data estaData;
    private hora estaHora;
    
    dataHora(byte dia,byte mes,short ano,byte hora,byte minutos,byte segundos){
        estaData = new data(dia,mes,ano);
        estaHora = new hora(hora,minutos,segundos);
    }
    dataHora(byte dia,byte mes,short ano){
        estaData = new data(dia,mes,ano);
    }
    public String toString(){
        String x;
        
        x = "Data:"+estaData+" Hora:"+ estaHora;
        return x;
    }
    
}
