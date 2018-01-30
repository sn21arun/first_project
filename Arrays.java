package com.java.linkedlist;

public class Arrays {

	int top;
	int[] a = new int[50];

	public Arrays() {
		top = -1;
	}

	public boolean push(int x) {
		if (top > x) {
			System.out.println("Stack overflow");
			return false;
		}

		a[++top] = x;
		return true;
	}

	public int pop() {
		if (top < 0) {
			System.out.println("Stack underflow");
			return -1;
		} else {

			int x = a[top--];
			return x;
		}
	}

	public static void main(String[] args) {
		Arrays ar = new Arrays();
		ar.push(12);
		ar.push(25);
		ar.push(36);
		ar.push(15);
		System.out.println("Element popped form stack: "+ ar.pop());
	}
}
