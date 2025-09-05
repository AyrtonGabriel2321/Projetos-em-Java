package entities;

public class Computador {
	private String nome;
	private String marca;
	private int ram;
	private int hd;
	private String proce;
	
	
	public Computador() {
		
	}
	
	public Computador(String nome, String marca, int ram, int hd, String proce) {
		this.nome = nome;
		this.marca = marca;
		this.ram = ram;
		this.hd = hd;
		this.proce = proce;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getRam() {
		return ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}


	public int getHd() {
		return hd;
	}


	public void setHd(int hd) {
		this.hd = hd;
	}


	public String getProce() {
		return proce;
	}


	public void setProce(String proce) {
		this.proce = proce;
	}

	public void imprimir() {
		System.out.println("Nome:" + nome);
		System.out.println("Marca:"+ marca);
		System.out.println("Memória ram:"+ram);
		System.out.println("Memória interna: "+ hd);
		System.out.println("Processador: "+proce);
		
		
	}
}

