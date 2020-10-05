package Trabalho;

public class TimeDeFutebol implements ITime{

	private String nome;
	private int qtdVitoria;
	private int qtdEmpate;
	private int qtdDerrota;
	private int qtdPontos;
	private int numeroDeTorcida;
	private int qtdJogos;
	
	//construtor
	public TimeDeFutebol(String nome, int torcida) {
		this.qtdDerrota = 0;
		this.qtdEmpate = 0;
		this.qtdVitoria = 0;
		this.qtdPontos = 0;
    this.qtdJogos = 0;
		this.nome = nome;
		setNumeroDeTorcida(torcida);
	}
	
  public void adicionarPartida(){
    this.qtdJogos++;
  }

  public int getPartida(){
    return this.qtdJogos;
  }

	@Override
	public void printNomeTime() {
		if(this.nome.length() > 5) {
			System.out.printf("%s\t", this.nome);
		} else {
			System.out.printf("%s\t\t", this.nome);
		}
		
	}

	@Override
	public void adicionarVitoria() {
		this.qtdVitoria++;
		this.qtdPontos += 3;
	}

	@Override
	public void adicionarEmpate() {
		this.qtdEmpate++;
		this.qtdPontos++;
	}

	@Override
	public void adicionarDerrota() {
		this.qtdDerrota++;
	}

	@Override
	public int totalPontos() {
		return this.qtdPontos;
	}

	@Override
	public int getVitoria() {
		return this.qtdVitoria;
	}

	@Override
	public int getEmpate() {
		return this.qtdEmpate;
	}

	@Override
	public int getDerrota() {
		return this.qtdDerrota;
	}

	public int getNumeroDeTorcida() {
		return numeroDeTorcida;
	}

	public void setNumeroDeTorcida(int numeroDeTorcida) {
		this.numeroDeTorcida = numeroDeTorcida;
	}
	
}