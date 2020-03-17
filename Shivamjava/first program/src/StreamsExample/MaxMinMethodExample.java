package StreamsExample;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class MaxMinMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(1001,"Apple",50000);
		Product p2=new Product(1001,"Sony",40000);
		Product p3=new Product(1001,"Voltes",20000);
		Product p4=new Product(1001,"MI",13210);
		Product p5=new Product(1001,"Samsung",50000);
		Product p6=new Product(1001,"Sony",37000);
		Product p7=new Product(1001,"Voltes",23000);
		Product p8=new Product(1001,"MI",17500);
		Product p9=new Product(1001,"Samsung",50000);
		Product p10=new Product(1001,"Sony",30000);
		Product p11=new Product(1001,"Apple",550000);
		Product p12=new Product(1001,"MI",10000);
		ArrayList<Product> products=new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p6);
		products.add(p7);
		products.add(p8);
		products.add(p9);
		products.add(p10);
		products.add(p11);
		products.add(p12);
		/*Product list=products.stream()
				.filter(p->p.name.equals("Apple"))
				.max((Product a,Product b)->a.price<b.price?-1:1)
				.get(); */
		List <Product> list=products.stream()
				.sorted((a,b)->a.price>=b.price?-1:1)
				.collect(Collectors.toList());
		
		System.out.println(list);
	}

}
