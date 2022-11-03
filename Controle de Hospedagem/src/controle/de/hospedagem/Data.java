
package controle.de.hospedagem;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Data {

    //atributos da data de entrada no hotel
    private int anoEnt;       
    private int mesEnt;    
    private int diaEnt;
    private int horaEnt;
    private int minutosEnt;
    
    //atributos da data de saída no hotel
    private int anoOut;
    private int mesOut;
    private int diaOut;
    private int horaOut;
    private int minutosOut;
    
    //indicadores de quartos, número de diárias e valor total a pagar
    private int escolha1;
    private int escolha2;
    private double totalDiarias;
    private double aluguel;
    
    public Data() {
        
        this.anoEnt = 0;
        this.mesEnt = 0;      
        this.diaEnt = 0;
        
        this.anoOut = 0;
        this.mesOut = 0;
        this.diaOut = 0;
        this.horaOut = 0;
        this.minutosOut = 0;
        
        this.escolha1 = 0;
        this.escolha2 = 0;
        this.totalDiarias = 0;
        this.aluguel = 0;
    }
    
    public void ComparaData() {
        
        QuartoIndividual indiv = new QuartoIndividual();
        QuartoIndividualPlus iplus = new QuartoIndividualPlus();
        QuartoCasal casal = new QuartoCasal();
        QuartoCasalPlus cplus = new QuartoCasalPlus();

        //transforma os dados de entrada/saída cliente em uma data pela classe GregorianCalendar
        GregorianCalendar entrada = new GregorianCalendar(anoEnt, mesEnt - 1, diaEnt, horaEnt, minutosEnt);
        GregorianCalendar saida = new GregorianCalendar(anoOut, mesOut - 1, diaOut, horaOut, minutosOut);
        
        //faz uma data sem as horas para contar a quantidade de dias
        GregorianCalendar entradaDias = new GregorianCalendar(anoEnt, mesEnt - 1, diaEnt);
        GregorianCalendar saidaDias = new GregorianCalendar(anoOut, mesOut - 1, diaOut);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy HH:mm"); //usado pra definir a forma que a data vai aparecer
        
        //exibe as datas e horários de entrada e saída no hotel
        System.out.printf("\nData de entrada: ");
        System.out.println(sdf.format(entrada.getTimeInMillis()));
        System.out.printf("Data de saída: ");
        System.out.println(sdf.format(saida.getTimeInMillis()));
        
        long diferenca = saidaDias.getTimeInMillis() - entradaDias.getTimeInMillis(); //calcula a diferença entre as datas em milisegundos
        double diferencaEmDias = (diferenca/1000) / 60 / 60 / 24; //calcula a diferença entre as datas em dias

        int diaria; //indicador da última diária
               
        //Calcula se vai precisar pagar +1 diária: antes de 12h não paga(0), após 12h paga(1)
        if(horaOut >= 12) {
            diaria = 1;
        }        
        else {
            diaria = 0;
        }
        
        setTotalDiarias(diferencaEmDias + diaria);//calcula o total de diárias a pagar
        System.out.printf("Número de diárias: %.0f\n",getTotalDiarias());
        
        //calcula o valor do aluguel
        if(escolha1 == 1){
            if(getEscolha2() == 0){                
                setAluguel(indiv.getDiaria() * totalDiarias);
            }
           
            else {            
                setAluguel(iplus.getDiaria() * totalDiarias);
            }
        }  
        
        else {
           if(escolha2 == 0){              
                setAluguel(casal.getDiaria() * totalDiarias);
            }
            
           else {              
                setAluguel(cplus.getDiaria() * totalDiarias);
            }
        }
        
        System.out.printf("O valor total a pagar é de R$%.2f\n", getAluguel());
    }

    public int getAnoEnt() {
        return anoEnt;
    }

    public void setAnoEnt(int anoEnt) {
        this.anoEnt = anoEnt;
    }

    public int getMesEnt() {
        return mesEnt;
    }

    public void setMesEnt(int mesEnt) {
        this.mesEnt = mesEnt;
    }

    public int getDiaEnt() {
        return diaEnt;
    }

    public void setDiaEnt(int diaEnt) {
        this.diaEnt = diaEnt;
    }

    public int getAnoOut() {
        return anoOut;
    }

    public void setAnoOut(int anoOut) {
        this.anoOut = anoOut;
    }

    public int getMesOut() {
        return mesOut;
    }

    public void setMesOut(int mesOut) {
        this.mesOut = mesOut;
    }

    public int getDiaOut() {
        return diaOut;
    }

    public void setDiaOut(int diaOut) {
        this.diaOut = diaOut;
    } 

    public int getHoraOut() {
        return horaOut;
    }

    public void setHoraOut(int horaOut) {
        this.horaOut = horaOut;
    }

    public int getMinutosOut() {
        return minutosOut;
    }

    public void setMinutosOut(int minutosOut) {
        this.minutosOut = minutosOut;
    }

    public int getHoraEnt() {
        return horaEnt;
    }

    public void setHoraEnt(int horaEnt) {
        this.horaEnt = horaEnt;
    }

    public int getMinutosEnt() {
        return minutosEnt;
    }

    public void setMinutosEnt(int minutosEnt) {
        this.minutosEnt = minutosEnt;
    }

    public double getTotalDiarias() {
        return totalDiarias;
    }

    public void setTotalDiarias(double totalDiarias) {
        this.totalDiarias = totalDiarias;
    }

    public int getEscolha1() {
        return escolha1;
    }

    public void setEscolha1(int escolha1) {
        this.escolha1 = escolha1;
    }

    public int getEscolha2() {
        return escolha2;
    }

    public void setEscolha2(int escolha2) {
        this.escolha2 = escolha2;
    }

    public double getAluguel() {
        return aluguel;
    }

    public void setAluguel(double aluguel) {
        this.aluguel = aluguel;
    }
}
