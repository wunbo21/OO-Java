package Trabalho;

public class PartidaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TimeDeFutebol flamengo   = new TimeDeFutebol("Flamengo", 36457167);
		TimeDeFutebol vasco      = new TimeDeFutebol("Vasco", 10131991);
		TimeDeFutebol botafogo   = new TimeDeFutebol("Botafogo", 4052796);
		TimeDeFutebol fluminense = new TimeDeFutebol("Fluminense", 4052796);
		
		Campeonato carioca = new Campeonato();
				
		carioca.resultadoPartida(flamengo, 3, vasco, 1);
		carioca.resultadoPartida(flamengo, 2, botafogo, 1);
		carioca.resultadoPartida(flamengo, 5, fluminense, 1);
		carioca.resultadoPartida(vasco, 3, fluminense, 1);
		carioca.resultadoPartida(vasco, 1, botafogo, 1);
		carioca.resultadoPartida(fluminense, 2, botafogo, 1);

		carioca.listarRank(vasco, botafogo, flamengo, fluminense);
		
	}

}
