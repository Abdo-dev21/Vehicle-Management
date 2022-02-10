import java.util.*;
import java.io.*;
public class GestioneAutomezzi extends ArrayList <automezzo>  {
    private Scanner in=new Scanner(System.in);
	private  ArrayList <automezzo> park;
	public GestioneAutomezzi() {
		park=new ArrayList<automezzo>();
	}
	public void O0() throws Exception {
		String ma,mo,nt,riga;
		int ai,aur,i,j;
		FileReader file=new FileReader ("input.txt");
		BufferedReader buf=new BufferedReader (file);
		riga = buf.readLine();
	    while(riga!=null) {
			for(i=0;riga.charAt(i)!=',';i++);
			ma=riga.substring(0,i);
			for(j=i+1;riga.charAt(j)!=',';j++);
			mo=riga.substring(i+2, j);
			for(i=j+1;riga.charAt(i)!=',';i++);
			nt=riga.substring(j+2, i);
			for(j=i+1;riga.charAt(j)!=',';j++);
			ai=Integer.parseInt(riga.substring(i+2,j));
			for(i=j+1;i<riga.length();i++);
			aur=Integer.parseInt(riga.substring(j+2, riga.length()));
		    automezzo a=new automezzo(ma,mo,nt,ai,aur);
			park.add(a);
			riga = buf.readLine();
	    }
		buf.close();
	}
	public void O1()  {
		String ma,mo,nt;
		int ai,aur;
		System.out.println("inserisci valori del veicolo,"
				+ "se nuovo inserire 2020 sia come anno di immatric. sia come anno ult rev ");
		
		ma=in.next();
		mo=in.next();
		nt=in.next();
		ai=in.nextInt();
		aur=in.nextInt();
	    automezzo a= new automezzo(ma,mo,nt,ai,aur);
	    park.add(a);
	    System.out.println("elemento inserito con successo!");
	    //in.close();
	}
	public void O2() {
		String targa;
		System.out.println("quale veicolo eliminare? inserisci la targa");
		targa=in.next();
		StringBuffer sb=new StringBuffer(targa);
		for (int i=0;i<park.size();i++)
			if(sb.toString().equals(park.get(i).get_ntarga())) {
				park.remove(i);
		        System.out.println("automezzo rimosso con successo!");
			    }
		   }
	public void AA (int i) {
			System.out.println(park.get(i).get_marca()+" "
					+park.get(i).get_modello()+" "
					+park.get(i).get_ntarga()+" "
					+park.get(i).get_annoimm()+" "
					+park.get(i).get_annoultrev()+" ");
		}
	public void O3() {
		String targa;
		int k=0;
		System.out.println("inserire la targa del veicolo da cercare");
		targa=in.next();
		for (int i=0;i<park.size();i++)
			if(park.get(i).get_ntarga().equals(targa))
				k=i;
		AA(k);
		}
	public void O4() {
		for (int i=0;i<park.size();i++)
			if((((park.get(i).get_annoultrev()==park.get(i).get_annoimm()&&park.get(i).get_annoimm()==2016)))||park.get(i).get_annoultrev()==2018)
				AA(i);
	    }
	public ArrayList<String> AB() {
		ArrayList<String> s=new ArrayList <String>();
		boolean f=true;
		for (int i=0;i<park.size();i++)
		    {for (int j=0;j<s.size();j++)
			    if(park.get(i).get_modello()==s.get(j))
				   f=false;
		    if(f)
		    	s.add(park.get(i).get_modello());
		    f=true;
		    }
		return s;
	    }
	public void O5() {
		ArrayList<String> s1=AB();
		for (int i=0;i<s1.size();i++)
			System.out.print(s1.get(i)+" ");
		System.out.println(" ");
	}
    public void O6() throws Exception {
    	ArrayList<String> s1=AB();
    	FileWriter output= new FileWriter ("output.txt");
    	PrintWriter scrivi=new PrintWriter(output);
    	for (int i=0;i<s1.size();i++) {
    		scrivi.printf(s1.get(i)+" ");
    		scrivi.println(" ");
    	}
    	System.out.println("scrittura avvenuta con sccesso!");
    	scrivi.close();
    	output.close();
        }
	public static void main (String[] args) throws Exception {
		GestioneAutomezzi ga=new GestioneAutomezzi();
		Scanner in=new Scanner (System.in);
		int n=0;
		boolean f=true;
        do {System.out.println("che operazione si desisdera fare?");	
            System.out.println( "0 per caricare dal file gli automezzi. N.B. questa operazione "
        		+ "può essere svolta una volta sola, se successivamente si reeinserirà"
        		+ "il valore 0 verrà ignorata la scelta e chiederà il reinserimento");
            System.out.println("1 per inserire un nuovo automezzo nel parcheggio");
            System.out.println("2 per eliminare il veicolo in base alla targa");
            System.out.println("3 per stampare in output un veicolo in base alla targa");
            System.out.println("4 per stampare in output i veicoli che hanno anno immatricolazione "
            		+ "uguale a quello dell'ultima revisione di almeno 4 anni fa', oppure che hanno come anno ultima revisione "
            		+ "almeno 2 anni fa'");
            System.out.println("5 per stampare i diversi modelli disponibili");
            System.out.println("6 per stampare i diversi modelli disponibili su file 'output.txt' ");
            System.out.println("7 per uscire");
            n=in.nextInt();
            switch (n) {
            case 0: if(f==true) {
                       ga.O0();
                       f=false;
                      }
                    else System.out.println("operazione già effettuata in precedenza, non ripetibile");
            break;
            case 1:ga.O1();
            break;
            case 2:ga.O2();
            break;
            case 3:ga.O3();
            break;
            case 4:ga.O4();
            break;
            case 5:ga.O5();
            break;
            case 6:ga.O6();
            break;
            case 7:System.out.println("uscita in corso...");
            break;
            }
        }while(n!=7);
       in.close();
	}
}
