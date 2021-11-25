package br.com.fabio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
        		new InputStreamReader(System.in));
        System.out.println("nome: - ");
		String nameString = bufferedReader.readLine();
		System.out.println("department: - ");
		String depString=bufferedReader.readLine();
		
		Estudante st1=new Estudante(nameString, depString);
		System.out.println(st1.toString());
		
//		Student st2=new Student(st1.name, st1.dept);//error will be there for dept.
		
		Estudante st2=(Estudante)st1.getClone();
		System.out.println(st2.toString());
    }
}
