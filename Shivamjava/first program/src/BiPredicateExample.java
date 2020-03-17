import java.util.function.*;

public class BiPredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//BiPredicate example
		BiPredicate<Integer,Integer> bip=(a,b)->(a+b)%2==0;
System.out.println(bip.test(10, 2));
System.out.println(bip.test(2, 7));
//BiFunction example
BiFunction<Integer,Integer,Integer> add=(c,d)->c+d;
BiFunction<Integer,Integer,Integer> sub=(c,d)->c-d;
BiFunction<Integer,Integer,Integer>mul=(c,d)->c*d;
System.out.println(add.apply(20,45));
System.out.println(sub.apply(20,45));
System.out.println(mul.apply(20,45));

	}

}

