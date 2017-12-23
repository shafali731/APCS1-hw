public class StatsDriver{
    public static void main(String[] args){
	System.out.println("int max"); 
	System.out.println(Stats.max(15,18,21)); //Output 21?
	System.out.println("Expect: 21");
	System.out.println(Stats.max(15,25,21)); //Output 25?
	System.out.println("Expect: 25");
	System.out.println("=================");
	
	System.out.println("double max");
	System.out.println(Stats.max(567.89,1234.12, 3000.03)); //Output 3000.03
	System.out.println("Expect: 3003.03");
	
	System.out.println("=================");
	System.out.println("goeMean (int)");
	System.out.println(Stats.geoMean(8,2,4)); //Output 4?
	System.out.println("Expect: 4");
	
	System.out.println("=================");
	System.out.println("geoMean(double)");
	System.out.println(Stats.geoMean(12.5, 2.0, 5.0)); //Output 5?
	System.out.println("Expect: 5.0");
    }
}
