package ru.stqa.pft.sandbox;

public class First {

	public static void main(String[] args) {

//		hello ("world");
//		hello ("Кирилл");
//		hello ("Данила");
//		hello ("Марина");

		Point p1 = new Point(3, 4);
		Point p2 = new Point(6, 8);
//		System.out.println("расстояние между двумя точками (6;8) и (3,4) равно "+p1.distance(p1, p2));
		System.out.println("расстояние между двумя точками (6;8) и (3,4) равно "+p1.distance(p2));
	}
//		public static double distance(ru.stqa.pft.sandbox.Point p1, ru.stqa.pft.sandbox.Point p2) {
//				double d = Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
//				return d;
//		}
	}

//		ru.stqa.pft.sandbox.Square s = new ru.stqa.pft.sandbox.Square(5); // создали объект типа ru.stqa.pft.sandbox.Square
//		//s.l= 5;
//		System.out.println("Площадь квадрата со стороной "+s.l+" = "+s.area()+" найдена через объект");
//
//		double len= 5;
//		System.out.println("Площадь квадрата со стороной "+len+" = "+area(len));
//
//		ru.stqa.pft.sandbox.Rectangle r = new ru.stqa.pft.sandbox.Rectangle(6,7);
//	//	r.a= 6;
//	//	r.b= 7;
//		System.out.println("Площадь прямоугольника со сторонами "+r.a+" и "+r.b+" = "+r.area()+" найдена через объект");
//
//
//
//		double a= 5;
//		double b= 6;
//		System.out.println("Площадь прямоугольника со сторонами "+a+" и "+b+" = "+area(a,b));
//
//	}
//
//	public static void hello (String somebody){
//		System.out.println("Hello, "+somebody+"!");
//	}
//
//	public static double area(double l){
//		return l*l;
//	}
//
////	public static double areas(ru.stqa.pft.sandbox.Square s){ // передаём в функцию параметр (не число, а сам объект)
////		return s.l*s.l;
////	}
//
//	public static double area(double a, double b){
//		return a*b;
//	}
//
////	public static double arear(ru.stqa.pft.sandbox.Rectangle r){
////		return r.a*r.b;
////	}






