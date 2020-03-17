package StreamsExample;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p1=new Product(1001,"Samsung",50000);
		Product p2=new Product(1001,"SOny",30000);
		Product p3=new Product(1001,"Voltes",20000);
		Product p4=new Product(1001,"MI",10000);
		ArrayList<Product> products=new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		List<Product> list= products.stream()
				.filter(p->p.price<=20000)
				.map(p->p).
				collect(Collectors.toList());
		long cnt=products.stream().filter(p->p.price<=20000).count();
		System.out.println(cnt);
		list.forEach(System.out::println);
		}

}
class Product{
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}