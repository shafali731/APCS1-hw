//Shafali Gupta
//APCS1 pd08
//HW46
//12/05/17

import java.util.ArrayList;

public class ALTester{
    // public void pupulate(int n, java.lang.Object o){
    // 	ArrayList.add(int n, java.lang.Object o);
    // 	for(int i = 0; i<n; i++){
    //    ArrayList.add(n, 10); }}
    public static void populate(int n, ArrayList<Comparable> o){
	for(int i = 0; i<n; i++){
	    o.add ( (int)( Math.random() * 10)); }}
    public static boolean isInOrder(ArrayList<Comparable> a){
        for( int i= 0; i< a.size(); i++){
	    if(a.get(i).compareTo( a.get(i+1)) > 0){
		return false; }}
	    return true; }
    
        public static void main(String [] args){
	 ArrayList<Comparable> foo = new ArrayList<Comparable>();
	 System.out.println(foo);
	 //for(int i = 0; i<23; i++){
	 //   add(i, (int)(Math.random()*100));}
	 populate(23, foo); 
	 System.out.println(foo);
	 System.out.println(isInOrder(foo)); 
	 
    }
}
