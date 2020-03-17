package StreamsExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortingUserDefinedinStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(1001,"Samsung",50000);
		Product p2=new Product(1001,"Sony",30000);
		Product p3=new Product(1001,"Voltes",20000);
		Product p4=new Product(1001,"MI",10000);
		ArrayList<Product> products=new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		List <Product> list=(List<Product>)
				products
				.stream()
				.sorted((a,b)->a.name.compareTo(b.name))
				.collect(Collectors.toList());
	System.out.println(list);
	list.forEach(System.out::println);
	}

}
