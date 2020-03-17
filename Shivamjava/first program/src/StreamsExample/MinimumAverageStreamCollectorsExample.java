package StreamsExample;
import java.util.*;
import java.util.stream.Collector;

public class MinimumAverageStreamCollectorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(1001,"A",50000);
		Product p2=new Product(1001,"S",40000);
		Product p3=new Product(1001,"S",20000);
		Product p4=new Product(1001,"A",13210);
		Product p5=new Product(1001,"S",50000);
		Product p6=new Product(1001,"S",37000);
		Product p7=new Product(1001,"A",23000);
		Product p8=new Product(1001,"A",17500);
		Product p9=new Product(1001,"S",50000);
		Product p10=new Product(1001,"S",30000);
		Product p11=new Product(1001,"A",550000);
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
	//	List<Product> list=products.stream().collect(averagingDouble(Product a->a.price))
		//		.min(Product a, Product b->a.price<b.price?-1:1).get());
	//	System.out.println(list);
	List<Product> list1=products.stream().
	
	}


}
