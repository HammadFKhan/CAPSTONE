package library;

public class Nanoparticle {
	protected String name = "Nanoparticles";
	
	// Define Parameters of Nanoparticles
	public double weight = 0;
	public double size = 0;

	
public Nanoparticle() {
	
}

public Nanoparticle(String name,double weight,
		double size) {
	
	this.setName(name);
	this.size = size;
	this.weight = weight;
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
