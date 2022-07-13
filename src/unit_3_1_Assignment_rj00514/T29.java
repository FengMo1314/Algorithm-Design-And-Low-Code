/**
 *
 */
package unit_3_1_Assignment_rj00514;

import java.util.Scanner;

/**
 * @author 柳和(本地)
 *
 */
public class T29 {

	/**
	 * @param args
	 */
	public boolean hui(String s) {
		if(s.length()==0||s.length()==1) {
			return true;
		}
		char start=s.charAt(0);
		char end=s.charAt(s.length()-1);
		if(start==end&&hui(s.substring(1,s.length()-1))) {
			return true;
		}else {
			return false;
		}

	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	T29 t=	new T29();
		Scanner sc=new Scanner(System.in);
		System.out.println(t.hui(sc.next()));
		sc.close();

	}

}
