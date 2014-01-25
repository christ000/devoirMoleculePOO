package fyl.devoir;
// this is a comment to know the change file
// this project works properly and i do not no why
public class Atome implements Comparable<Object>{
	
	private String nom;
	private String symbole;
	private int masse;
	
	public Atome(String nom, String symbole, int masse) {
		this.nom = nom;
		this.symbole = symbole;
		this.masse = masse;
	}

	@Override
	public boolean equals(Object o){
		if(!(o instanceof Atome))
			return false;
		Atome a = (Atome)o;
		return a.masse == this.masse;
	} 

	@Override
	public int compareTo(Object o) {  
        if (o instanceof Atome) {  
        	Atome a = (Atome) o;
            if(this.equals(o))
            	return 0;
            else
            	return this.masse - a.masse;
        }  
        throw new ClassCastException("\nCannot compare Atome with "  
                + o.getClass().getName());  
    }

	//getters
	public String getNom() {
		return nom;
	}

	public String getSymbole() {
		return symbole;
	}

	public int getMasse() {
		return masse;
	}

	@Override
	public String toString() {
		return "Atome [nom=" + nom + ", symbole=" + symbole + ", masse="
				+ masse + "]";
	}  
	
	

}
