package estudo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ExemploCursos {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Java", 10));
		cursos.add(new Curso(".Net", 180));
		cursos.add(new Curso("Android", 10));
		cursos.add(new Curso("Swift", 110));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		cursos.stream().filter(al -> al.getAlunos() < 50)
				.forEach(c -> System.out.println(c.getNome()));
				
//				
//		.mapToInt(Curso::getAlunos)
//		.sum();
		
//		System.out.println(sum);
	}
	
}

