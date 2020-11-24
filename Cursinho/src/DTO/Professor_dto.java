package DTO;

public class Professor_dto {

	private int Id;
	private String Nome;
	private String Matricula;
	private String Endereco;
	private String Codigo_Materia;
	
	// ###################
	// Getters and Setters
	// ###################
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	public String getCodigo_Materia() {
		return Codigo_Materia;
	}
	public void setCodigo_Materia(String codigo_Materia) {
		Codigo_Materia = codigo_Materia;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	
}