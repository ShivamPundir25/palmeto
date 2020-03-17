
public class Std implements Comparable<Std> {
String name;
String age;
String city;
public Std(String name, String age, String city) {
	super();
	this.name = name;
	this.age = age;
	this.city = city;
}
@Override
public String toString() {
	return "Std [name=" + name + ", age=" + age + ", city=" + city + "]";
}
@Override
public int compareTo(Std s) {
	if(name.compareTo(s.name)<0)
	{
		return -1;
	}
	else if(name.compareTo(s.name)>0)
	{
		return 1;
	}
	return 0;
}




}


