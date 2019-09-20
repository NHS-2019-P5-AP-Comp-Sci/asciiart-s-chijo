/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using
 * ASCII (American Standard Code for Information Interchange). Using the already
 * created file named `ASCIIArt.java` write a program that outputs your artwork
 * to the console. The goal of this project is to use ONLY what we have learned
 * in Unit 1 to create anything you would like so be creative (and school
 * appropriate). Artwork must also have a caption describing what it's
 * depicting.
 * 
 * For those of you who have dabbled in coding before, try to contain your code
 * to just what we have discussed in this unit.
 * 
 * @author Mr. Rasmussen
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void main(String[] args) {
		line();
		head();
		neck();
		body();
		legs();
		grass();
		message();
	}

	public static void line() {
		System.out.println("______________________________________________________");

	}

	public static void head() {
		System.out.println("");
		System.out.println("\t^       ^");
		System.out.println("\t( \"   \" )");
		System.out.println("\t (     )");
		System.out.println("\t  ( ^ )");
		System.out.println("\t   ( )");
	}

	public static void neck() {
		System.out.println("\t  /   \\                          ***");
		System.out.println("\t  /   \\                          /");
		System.out.println("\t  /   \\                        /");
		System.out.println("\t  /   \\                      /");

	}

	public static void body() {
		System.out.println("\t  /   \\ ____________________|\\");
		System.out.println("\t  _____________________|     |");
	}

	public static void legs() {
		System.out.println("\t |     |               |     |");
		System.out.println("\t |     |               |     |");
		System.out.println("\t |     |               |     |");
		System.out.println("\t |     |               |     |");
		System.out.println("\t |     |               |     |");
		System.out.println("\t |     |               |     |");
		System.out.println("\t \\\\___//               \\\\___//       ");
	}

	public static void grass() {
		System.out.println("|^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^|");
	}

	public static void message() {
		System.out.println("Ascii art of a giraffe at The Official Ascii Art Museum");
	}
}