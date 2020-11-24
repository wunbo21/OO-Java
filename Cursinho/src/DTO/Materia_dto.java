package DTO;

public class Materia_dto {

	private int Id;
	private String Nome;
	private String Codigo_Materia;
	private int Carga_Horaria;
	
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
	public String getCodigo_Materia() {
		return Codigo_Materia;
	}
	public void setCodigo_Materia(String codigo_Materia) {
		Codigo_Materia = codigo_Materia;
	}
	public int getCarga_Horaria() {
		return Carga_Horaria;
	}
	public void setCarga_Horaria(int carga_Horaria) {
		Carga_Horaria = carga_Horaria;
	}
	
}