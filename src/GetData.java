import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

public class GetData {
	public static void main(String[] args) {
		int dia, mes, ano, h,m,s;
       	Date data = new Date();
        DateFormat DataeHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        DateFormat dia_aux = new SimpleDateFormat("dd");
        DateFormat mes_aux = new SimpleDateFormat("MM");
        DateFormat ano_aux = new SimpleDateFormat("yyyy");
        DateFormat h_aux = new SimpleDateFormat("HH");
        DateFormat m_aux = new SimpleDateFormat("mm");
        DateFormat s_aux = new SimpleDateFormat("ss");
        dia = Integer.parseInt(dia_aux.format(data));
        mes = Integer.parseInt(mes_aux.format(data));
        ano = Integer.parseInt(ano_aux.format(data));
        h = Integer.parseInt(h_aux.format(data));
        m = Integer.parseInt(m_aux.format(data));
        s = Integer.parseInt(a_aux.format(data));
        
        System.out.println("Date(): "+ data);
        System.out.println("SimpleDateFormat(\"dd/MM/yyyy HH:mm:ss\"):" +DataeHora.format(data));
        System.out.println("Dia: "+dia);
        System.out.println("Mês: "+mes);
        System.out.println("Ano: "+ano);
        System.out.println("Hora: "+h);
        System.out.println("Minutos: "+m);
        System.out.println("Segundos: "+s);
         
        System.out.println();
        System.out.println("------------Calendar-----------------------------");
        System.out.println();
        
        Calendar c = Calendar.getInstance();
        c.set(ano,mes,dia);
        
        System.out.println(c.getTime().toString());      
        System.out.println("Dia: "+c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Mês: "+c.get(Calendar.MONTH));
        System.out.println("Ano: "+c.get(Calendar.YEAR));
        System.out.println("Hora: "+c.get(Calendar.HOUR));
        System.out.println("Ano: "+c.get(Calendar.MINUTE));
        System.out.println("Ano: "+c.get(Calendar.SECOND));
               
        System.out.println();
        System.out.println("----------------LocalDateTime-------------------------");
        System.out.println();

        System.out.println(LocalDateTime.now());
        System.out.println("Dia: "+LocalDateTime.now().getDayOfMonth());
        System.out.println("Mês: "+LocalDateTime.now().getMonthValue());
        System.out.println("Ano: "+LocalDateTime.now().getYear());
        System.out.println("Ano: "+LocalDateTime.now().getHour());
        System.out.println("Ano: "+LocalDateTime.now().getMinute());
        System.out.println("Ano: "+LocalDateTime.now().getSecond());
        
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println(); 
        
    }
 }
