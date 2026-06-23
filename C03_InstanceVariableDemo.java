public class C03_InstanceVariableDemo {
	int number = 50;

	public static void main(String[] args) {
		C03_InstanceVariableDemo obj = new C03_InstanceVariableDemo();
		System.out.println("Instance Variable Value: " + obj.number);
	}
}

/*
Topic: Instance Variable
Project: Java_02_Variables_DataTypes
Package: p01_variables
Class: C03_InstanceVariableDemo

Purpose:
To understand instance variable.

Explanation:
- Instance variable is declared inside class but outside method
- It belongs to object
- To access instance variable, object is created

Output:
Instance Variable Value: 50
*/