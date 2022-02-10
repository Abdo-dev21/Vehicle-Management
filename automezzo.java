public class automezzo {
	private String Marca;
	private String Modello;
	private String n_targa;
	private int anno_imm;
	private int anno_ultima_rev;
	public automezzo () {
		}
	public automezzo (String Marca, String Modello, String n_targa,int anno_imm, int anno_ultima_rev) {
		this.Marca=Marca;
		this.Modello=Modello;
		this.n_targa=n_targa;
		this.anno_imm=anno_imm;
		this.anno_ultima_rev=anno_ultima_rev;	
	}
	public String get_marca() {
		return  this.Marca;
	}
	public String get_modello() {
		return  this.Modello;
	}
	public String get_ntarga() {
		return  this.n_targa;
	}
	public int get_annoimm() {
		return  this.anno_imm;
	}
	public int get_annoultrev() {
		return  this.anno_ultima_rev;
	}
	public void set_annoultrev(int anno) {
		this.anno_ultima_rev=anno;
	}
}
