package Trabalho;

import java.util.ArrayList;

public class Campeonato {

private ArrayList<TimeDeFutebol> times = new ArrayList<TimeDeFutebol>();
	
	//lançar partirda
	public void resultadoPartida(TimeDeFutebol time1, int gols1, TimeDeFutebol time2, int gols2) {
		if(gols1 > gols2){
			time1.adicionarVitoria();
      		time2.adicionarDerrota();
		} else if (gols2 > gols1) {
			time2.adicionarVitoria();
			time1.adicionarDerrota();
		} else {
			time1.adicionarEmpate();
			time2.adicionarEmpate();
		}
		time1.adicionarPartida();
		time2.adicionarPartida();
	}
	
	//rankear
	public void listarRank(TimeDeFutebol time1, TimeDeFutebol time2, TimeDeFutebol time3, TimeDeFutebol time4) {
	    ArrayList<TimeDeFutebol> times = new ArrayList<TimeDeFutebol>();
	    times.add(time1);
	    times.add(time2);
	    times.add(time3);
	    times.add(time4);
	    ArrayList<TimeDeFutebol> timesClas = new ArrayList<TimeDeFutebol>();    
	    do{
	    	int maior = 0;
	    	int maiorPontos = times.get(0).totalPontos();
		    for(int i = 0; i < times.size(); i++){
		      if(maiorPontos < times.get(i).totalPontos()){
		        maior = i;
		        maiorPontos = times.get(i).totalPontos();
		      }
		    }
		    timesClas.add(times.get(maior));
		    times.remove(maior);
	    } while (times.size() != 0);
	    
	    System.out.println("******************************************************");
	    System.out.println("********** Classificação Campeonato Carioca **********");
	    System.out.println("******************************************************");
	    System.out.println("Pts\tTime\t\tJogos\tEmp.\tVit.\tDer.");
	    for(int i = 0; i < timesClas.size(); i++){
	      System.out.printf("%d\t", timesClas.get(i).totalPontos());
	      timesClas.get(i).printNomeTime();
	      System.out.printf("%d\t%d\t%d\t%d\n", timesClas.get(i).getPartida(),timesClas.get(i).getEmpate(), timesClas.get(i).getVitoria(), timesClas.get(i).getDerrota());
	    } 
	
	    System.out.println("\n\n** Integrantes **\nGuilherme Rocha / 0050015970\nLucas Bernardes / 0050016045");
	}
	
}