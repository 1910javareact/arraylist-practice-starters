package com.revature.list;

import java.util.Arrays;

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
			arr = Arrays.copyOf(arr, capacity);
		}
	}

	public void set(int index, int val) {
		// TODO Auto-generated method stub
		if (index > size || index < 0) {
			return;
		}
		arr[index] = val;
	}

	public void remove(int index) {
		// TODO Auto-generated method stub
		if (index > size || index < 0) {
			return;
		}
		size--;
		for (int i = index; i < size-1; i++) {
			arr[i] = arr[i+1];
		}
	}

	public int get(int index) {
		// TODO Auto-generated method stub
		if (index > size || index < 0) {
			throw new RuntimeException("Index out of bounce");
		}
		return arr[index];
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder test = new StringBuilder();
		test.append("{ ");
		//String output = "{ ";
		for (int i = 0; i < size; i++) {
			//output += arr[i];
			test.append(arr[i]);
			if(i < size-1) {
				//output += ", ";
				test.append(", ");
			}
		}
		//output += " }";
		test.append(" }");
		return test.toString();
	}
}
