package model;

public class ServantCard extends Card{
	private int id;
	private int rank;
	private ServantClass servantClass;
	private String name;
	private int atk;
	private int def;
	
	public ServantCard(int id, int rank, ServantClass servantClass, String name, int atk, int def) {
		super(id,name);
		this.rank = rank;
		this.servantClass = servantClass;
		this.atk = atk;
		this.def = def;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public ServantClass getServantClass() {
		return servantClass;
	}

	public void setServantClass(ServantClass servantClass) {
		this.servantClass = servantClass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
	public void loseDef(int lose) {
		if(this.def-lose <= 0 ) 
			this.def = 0;
		else
			this.def-=lose;
	}
	
	public String toString() {
		return super.toString()+", rang : "+this.rank+", Classe : "+this.servantClass+", Valeur d'attaque : "+this.atk+", Valeur de défense : "+this.def;
	}
	
}
