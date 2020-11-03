package pack1;
	import java.util.Scanner;
	import java.util.*;
	public class RandomAlphabets {
	char r[];
	char res;
	char tmp[];
	int i,j,n;
	void random(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of characters");
		n=sc.nextInt();
		r=new char[n];
		RandomAlphabets ra=new RandomAlphabets();
		for(i=0;i<n;i++){
			r[i]=(char)(sc.nextInt(26)+65);
			System.out.println("");
			System.out.println(""+r[i]+"");
		}
	}
		void sort(){
		for(i=0;i<n;i++)
			for(j=i+1;j<n;j++){
				if(r[i]<r[j])
				{
					res=r[i];
					r[i]=r[j];
					r[j]=res;
				}
			}
		System.out.println(+r[i]);
	}
		void duplicate(){
			tmp=new char[n];
			j=0;
			for(i=0;i<n-1;i++)
			{
				if(r[i]!=r[j]){
					tmp[j++]=r[i];
				}
			}
			tmp[j++]=r[n-1];
		}
		void finalString(){
			for(i=0;i<j;i++)
			{
				System.out.println(+tmp[i]);
			}
		}
		public static void main(String[] args) {
	RandomAlphabets r=new RandomAlphabets();
	r.random();
	r.sort();
	r.duplicate();
	r.finalString();
		}
	}


