package com.epam.collections;
import java.util.Arrays;
import java.util.Scanner;
public class CustomCollectionList<CustomCollections> {
	private int size=0;
	private static final int initialcapacity=10;
    private Object[] list;  
	
    public CustomCollectionList() {
 	   list=new Object[initialcapacity];
    }
    public void addElement(CustomCollections value) {
 	   if(size==list.length) {
 		   growSize();
 	   }
 	   list[size++]=value;
    }
    
    private void growSize() {
		int newlengthoflist=list.length*2;
		list=Arrays.copyOf(list, newlengthoflist);
		
	}
	public CustomCollections fetchElement(int index) {
 	   if(index>=size ||index<0) {
 		  System.out.println("Index out of range");
 	   }
 	   return (CustomCollections)list[index];
    }
	public CustomCollections remove(int index) {
		if(index>=size || index<0) {
			System.out.println("Index out of range");
		}
		Object element=list[index];
		int num=list.length-(index+1);
		System.arraycopy(list, index+1, list, index, num);
		size--;
		return (CustomCollections)element;   
	}
	public String toString() 
	{
	     StringBuilder s = new StringBuilder();
	     s.append('[');
	     for(int i = 0; i < size ;i++) {
	         s.append(list[i].toString());
	         if(i<size-1){
	             s.append(",");
	         }
	     }
	     s.append(']');
	     return s.toString();
	}
	public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
		CustomCollectionList<Integer> customlist=new CustomCollectionList<Integer>();
		customlist.addElement(1);
		customlist.addElement(2);
		customlist.addElement(3);
		customlist.addElement(4);
		customlist.addElement(5);
		customlist.addElement(6);
		customlist.addElement(7);
		customlist.addElement(8);
		customlist.addElement(9);
		customlist.addElement(10);
		System.out.println(customlist);
		int count=1;
		int option1=1;
		while(count == 1) {
		 	System.out.println("Menu::");
		    System.out.println("\n1.Add an element,\n2.Remove an element,\n3.Fetch an element from an index position,\n4.Print the List.");
		    System.out.println("Select the option:");
		   	int option = s.nextInt();
		    switch(option) {
		       case 1:
		    	   System.out.println("Enter an element to add:");
		  		   int n=s.nextInt();
		  		   customlist.addElement(n);
		  		   System.out.println(customlist);
		  		   break;
		       case 2:
		  		   System.out.println("Enter a index to remove");
		  		   int index=s.nextInt();
		  		   System.out.println("The removed element from the list is "+customlist.remove(index));
		  		   System.out.println("The list after removing the element is "+customlist);
		  		   break;
		       case 3:
		    	   System.out.println("Enter an index position to fetch a value:");
		    	   int fetchfromindex=s.nextInt();
		    	   System.out.println("The element fetched from the list is "+customlist.fetchElement(fetchfromindex));
		    	   break;
		       case 4:
		    	   System.out.print("The list is ");
		    	   System.out.println(customlist);
		    	   break;
		       default:
		    	   System.out.println("Option invalid! \n");
		    	   exit(0);
		    	   break;
		    }
		    System.out.println("Do you want to continue?");
		    System.out.println("1.Yes\n2.No");
		    option1 = s.nextInt();
		    count = option1;
		    if(count==2) {
				exit(0);
			}
		}
	}
	private static void exit(int i) {
		System.out.println("----Exited!!----");
	}
}