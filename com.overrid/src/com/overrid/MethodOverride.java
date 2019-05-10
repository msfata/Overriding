/**
 * 
 */
package com.overrid;

/**
 * @author msfata ProgrammingHelp
 *
 */
public class MethodOverride {
	public static void main(String[] args) {
		/*
		 * invoking parent run method
		 */
		Parent p = new Parent();
		System.out.println(p.run("hi"));

		/*
		 * invoking child run method
		 */
		Child c = new Child();
		System.out.println(c.run("hi"));

		/*
		 * indication method overriding
		 */
		Parent pc = new Child();
		System.out.println(pc.run("child run overrids parent run"));
	}
}

class Parent {
	public String run(String input) {
		return input + ": Parent Class";
	}
}

class Child extends Parent {
	public String run(String input) {
		return input + ": Child Class ";
	}
}