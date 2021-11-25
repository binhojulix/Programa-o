package br.com.fabio;

public class Estudante implements Prototype{
    private static int idGen=0;
	private int id;
	public String name;
	private String dept;


    public Estudante(String name, String dept){
        this.id = ++idGen;
		this.name = name;
		this.dept = dept;
    }


    @Override
    public Prototype getClone() {
        // TODO Auto-generated method stub
        return new Estudante(name, dept);
    }


	@Override
	public String toString() {
		return "Estudante [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
    
    
    
}
