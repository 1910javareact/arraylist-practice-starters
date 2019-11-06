package com.revature.list;

public class MyArrayList {
	int size = 0;
	int capacity = 10;
	int[] arr = new int[10];

	public void add(int val) {
		// TODO Auto-generated method stub
		arr[size] = val;
		size++;
		if (size >= capacity) {
			capacity *= 2;
			int[] arr2 = new int[capacity];
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = arr[i];
			}
			arr = arr2;
		}
	}

	public void set(int index, int val) {
		// TODO Auto-generated method stub
		arr[index] = val;
	}

	public void remove(int index) {
		// TODO Auto-generated method stub
		size--;
		for (int i = index; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
	}

	public int get(int index) {
		// TODO Auto-generated method stub
		return arr[index];
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.print("{ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.print("} ");
		
		return null;
	}
}
