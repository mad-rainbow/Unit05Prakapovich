package lt.lhu.unit05_01.main;

public class Triangle {

	private double base;
	private double aSide;
	private double cSide;

	public Triangle() {
		this(0, 0, 0);
	}

	public Triangle(double a, double b, double c) {
		base = b;
		aSide = a;
		cSide = c;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getaSide() {
		return aSide;
	}

	public void setaSide(double aSide) {
		this.aSide = aSide;
	}

	public double getcSide() {
		return cSide;
	}

	public void setcSide(double cSide) {
		this.cSide = cSide;
	}

	public double perimeter() {
		double p;

		p = base + aSide + cSide;

		return p;
	}

	public double area() {
		double a, s;

		s = perimeter() / 2;
		a = Math.sqrt(s * (s - aSide) * (s - base) * (s - cSide));

		return a;
	}
}
