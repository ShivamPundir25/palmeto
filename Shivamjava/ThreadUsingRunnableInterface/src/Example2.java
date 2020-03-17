import java.util.function.*;
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Predicate<Integer> p=(a)->a%2==0;
if(p.test(23)) {
System.out.println("even");}
else System.out.println("odd"); */
		
		
/*		Function<Integer,Integer> f=(a)->a*a;
		System.out.println(f.apply(2));
*/
		
		BiFunction<Integer,Integer,Integer> f=(a,b)->
		a>b?a:b;
		System.out.println(f.apply(2, 5));
	}

}
