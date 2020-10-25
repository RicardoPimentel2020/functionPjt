package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.00));

		// converte a lista para string utilizando metodo stream
		// map aplica a função UpperCase a cada elemento da lista gerando uma nova lista
		// depois convertendo novamente para lista uzando metodo collectors.toList();

	//	List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		///************
		//Utilizando Método static da class Product com mesmo resultado
		
	//	List<String> names = list.stream().map(Product::staticUpperCase).collect(Collectors.toList());
	
		//Método não static 
		
	///	List<String> names = list.stream().map(Product::nonstaticUpperCase).collect(Collectors.toList());
		
		//names.forEach(System.out::println);
		
		///Expressão Lambda 
		
		
		//Function<Product, String> func = p -> p.getName().toUpperCase();
		
		//List<String> names = list.stream().map(func).collect(Collectors.toList());
		
		///Expressão Lambda inline
		
		List<String> names = list.stream().map( p -> p.getName().toUpperCase()).collect(Collectors.toList());
	    names.forEach(System.out::println);

	}

}
