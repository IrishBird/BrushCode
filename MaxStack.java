package com.eyang.framework.stars.LeetCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
public class MaxStack {

 private Stack<Integer> mxStack =new Stack<>();
 private Stack<Integer> tempStack=new Stack<>();

 public void push(int j) {
	 int max=mxStack.isEmpty() ? j: Math.max(j, mxStack.peek());
	 mxStack.push(max);
	 tempStack.push(j);
	 	 
 }
 

 public int pop() {
	 
	int value=tempStack.isEmpty()? null:tempStack.pop();
	mxStack.pop();
	 
	return value;
		
	 
 }
 
 public int top() {
	 int top= tempStack.peek();
	 
	 return top;
 }
 
 

 public  int peekMax() {

	 return mxStack.peek();
	 
 }
 
 public  int  popMax() {

   Stack<Integer> temp=new Stack<>();
   int max=mxStack.peek();
   while(tempStack.peek()!=mxStack.peek()) {
	   temp.push(tempStack.pop());
	   
   }
   tempStack.pop();
   
   while(!temp.isEmpty()) {
   tempStack.push(temp.pop());
   }
   return max;
	 
	 
 }
	public static void main(String[] args) {
		
		MaxStack mx=new MaxStack();
		mx.push(5);
		mx.push(1);
		mx.push(3);
		mx.push(5);
		int top=mx.top();
		System.out.println("top  ->" +top);
		
		int prevMaxValue=mx.popMax();
		System.out.println("popMax  ->" +prevMaxValue);
		
		 top=mx.top();
		System.out.println("top  ->" +top);
		
		int maxValue=mx.peekMax();
		System.out.println("peekMax ->" +maxValue);

		int pop=mx.pop();
		System.out.println("pop ->" +pop);

		top=mx.top();
		System.out.println("top ->" +top);

		maxValue=mx.peekMax();
		System.out.println("peekMax ->" +maxValue);
		
		int pops=mx.pop();
		System.out.println("pop ->" +pops);


		
	}
 
}
