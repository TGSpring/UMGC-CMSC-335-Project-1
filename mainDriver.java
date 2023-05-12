package project_1;

import java.util.*;

/**
 * @author tyler spring 
 * project 1 CMSC 335 
 * This is the first project. 
 * This is the main class for this program to be an example of inheritance and 
 * using interfaces. Here the user is prompted with a command line
 * looking menu and asked to select one of the 10 options below. If the
 * user selects any of the first 9 options, they will be further
 * prompted to enter numbers related to what option they have chosen.
 * After the iteration of the option they have chosen is over. They will
 * be shown the menu again. The 10th option if the one that allows them
 * to exit the program. After that is selected they are again if they
 * would like to exit the program. They can choose Y or N in order to
 * either keep going, or exit.
 */
public class mainDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date curr = new Date();

		char input;
//Here is the beginning of the menu/program.
		System.out.println("*********Welcome to the Java OO Shapes Program **********");

		do {
			System.out.printf("Select from the menu below:" + "\n" + "1. Construct a Circle" + "\n"
					+ "2. Construct a Rectangle" + "\n" + "3. Construct a Square" + "\n" + "4. Construct a Triangle"
					+ "\n" + "5. Construct a Sphere" + "\n" + "6. Construct a Cube" + "\n" + "7. Construct a Cone"
					+ "\n" + "8. Construct a Cylinder" + "\n" + "9. Construct a Torus" + "\n" + "10. Exit the program");
			int ind = sc.nextInt();
//switch statement used to catch the input that the user gives, then run against different cases by using a
			// do while loop.
			switch (ind) {
			case 1:
				System.out.printf("You have selected Circle" + "\n" + "Enter Radius");
				int cRad = sc.nextInt();
				Circle crc = new Circle(cRad);
				System.out.println("\nThe area of the Circle is: " + crc.getArea());
				break;

			case 2:
				System.out.printf("You have selected a Rectangle" + "\n" + "Enter Width of rectangle");
				int recW = sc.nextInt();
				System.out.println("Enter the length");
				int recL = sc.nextInt();
				Rectangle rec = new Rectangle(recW, recL);
				System.out.println("The area of the Rectangle is: " + rec.getArea());
				break;
			case 3:
				System.out.printf("You have selected Square" + "\n" + "Enter a side");
				int sidesq = sc.nextInt();
				Square sq = new Square(sidesq);
				System.out.println("The area of the square is: " + sq.getArea());
				break;
			case 4:
				System.out.printf("You selected Triangle" + "\n" + "Enter its height");
				int triH = sc.nextInt();
				System.out.println("Enter its base");
				int triB = sc.nextInt();
				Triangle tri = new Triangle(triH, triB);
				System.out.println("The area of the triangle you entered is: " + tri.getArea());
				break;
			case 5:
				System.out.printf("You selected Sphere" + "\n" + "Enter its radius");
				int spRadi = sc.nextInt();
				Sphere sph = new Sphere(spRadi);
				System.out.println("Volume of the sphere is: " + sph.getVol());
				break;
			case 6:
				System.out.printf("You selected Cube" + "\n" + "Enter the area of the cube");
				int cArea = sc.nextInt();
				Cube cb = new Cube(cArea);
				System.out.println("Volume of the cube is: " + cb.getVol());
				break;
			case 7:
				System.out.printf("You selected Cone" + "\n" + "Enter its radius");
				int cRadi = sc.nextInt();
				System.out.println("Enter its height");
				int cHei = sc.nextInt();
				Cone c = new Cone(cRadi, cHei);
				System.out.println("The volume of the cone is: " + c.getVol());
				break;
			case 8:
				System.out.printf("You selected Cylinder" + "\n" + "Enter the radius");
				int cyRadi = sc.nextInt();
				System.out.println("Enter the height");
				int cyHei = sc.nextInt();
				Cylin cy = new Cylin(cyRadi, cyHei);
				System.out.println("The volume of the Cylinder is: " + cy.getVol());
				break;
			case 9:
				System.out.printf("You selected Torus" + "\n" + "Enter its minor radi");
				int miRadi = sc.nextInt();
				System.out.println("Enter its major radi");
				int maRadi = sc.nextInt();
				Torus tor = new Torus(miRadi, maRadi);
				System.out.println("The volume of the Torus is:" + tor.getVol());
				break;
			}
			// Where user is asked a second time if they would like to exit the program.
			System.out.println("Would you like to continue? Enter Y or N");
			input = sc.next().charAt(0);
		} while (input == 'Y');
		System.out.println("Thank you for using the inheritance project on " + curr);
		sc.close();

	}

}
