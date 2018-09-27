package course;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("jose 1");
		list.add("jose 2");
		list.add("jose 3");
		list.add("jose 4");
		list.add("jose 5");
		list.add(2,"jose 9");
		list.add(0,"Maria 0");
		list.add(3,"Maria 1");
		list.add(4,"Bob");
		list.add("Amarildo");
		list.add("Armando");
		
		System.out.println("--- Lista ---");	
		System.out.println("Tamanho da lista: "+ list.size());
		for(String x : list) {
			System.out.println(x);
		}
		
		list.remove("jose 4");
		list.remove(0);
		list.removeIf( x -> x.charAt(0) == 'M');
		
		System.out.println("--- REMOVIDOS ---");
		System.out.println("Tamanho da lista: "+ list.size());
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--- Buscando ---");
		System.out.println("Index of Bob = " + list.indexOf("Bob"));
		System.out.println("Index of Marcus = " + list.indexOf("Marcus")); // -1
		
		System.out.println("--- Filtro ---");
		// operações de lambda - converte para stream / faz a operação / e depois volta para lista
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("--- Encontrar elemento que atenda a um predicado ---");
		String name = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);
		System.out.println(name);
	}
}
