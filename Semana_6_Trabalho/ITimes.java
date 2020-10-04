package Semana_6_Trabalho;

public abstract interface ITimes {

	public void printNomeTime();
	public void adicionarVitoria();
	public void adicionarEmpate();
	public void adicionarDerrota();
	public int totalPontos();
	public int getVitoria();
	public int getEmpate();
	public int getDerrota();
	
}