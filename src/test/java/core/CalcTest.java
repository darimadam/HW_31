package core;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	static double divide(double a, double b)                      {return a / b;}
	static double divide(double a, double b, double c)            {return a / b / c;}
	static double divide(double a, double b, double c, double d)  {return a / b / c / d;}
	
	static double divide(double a, double b, double c, double d, double e)                      {return a / b / c / d / e;}
	static double divide(double a, double b, double c, double d, double e, double f)            {return a / b / c / d / e / f;}
	static double divide(double a, double b, double c, double d, double e, double f, double g)  {return a / b / c / d / e / f / g ;}

	static double add(double a, double b)                          {return a + b;}
	static double add(double a, double b, double c)                {return a + b + c;}
	static double add(double a, double b, double c, double d)      {return a + b + c + d;}

	static double add(double a, double b, double c, double d, double e)                      {return a + b + c + d + e;}
	static double add(double a, double b, double c, double d, double e, double f)            {return a + b + c + d + e + f;}
	static double add(double a, double b, double c, double d, double e, double f, double g)  {return a + b + c + d + e + f + g ;}
	
	static double subtract(double a, double b)                     {return a - b;}
	static double subtract(double a, double b, double c)           {return a - b - c;}
	static double subtract(double a, double b, double c, double d) {return a - b - c - d;}

	static double subtract(double a, double b, double c, double d, double e)                      {return a - b - c - d - e;}
	static double subtract(double a, double b, double c, double d, double e, double f)            {return a - b - c - d - e - f;}
	static double subtract(double a, double b, double c, double d, double e, double f, double g)  {return a - b - c - d - e - f - g ;}

	static double multiply(double a, double b)                     {return a * b;}
	static double multiply(double a, double b, double c)           {return a * b * c;}
	static double multiply(double a, double b, double c, double d) {return a * b * c * d;}

	static double multiply(double a, double b, double c, double d, double e)                      {return a * b * c * d * e;}
	static double multiply(double a, double b, double c, double d, double e, double f)            {return a * b * c * d * e * f;}
	static double multiply(double a, double b, double c, double d, double e, double f, double g)  {return a * b * c * d * e * f * g ;}

//////////////////////////////////////////////////////////////////	
	
	@Test
	public void test_01() {assertEquals("Method divide is Not correct", divide(90.0, 7.0), 12.9, 0.09);}
	
	@Test
	public void test_02() {assertEquals("Method add is Not correct", add(60.0, 5.0, 7.0), 72.0, 0.09);}
	
	@Test
	public void test_03() {assertEquals("Method subtract is Not correct", subtract(100.0, 22.0), 78.0, 0.09);}
	
	@Test
	public void test_04() {assertEquals("Method multiply is Not correct", multiply(9.0, 5.0, 2.0), 90.0, 0.09);}
	
	@Test
	public void test_05() {assertEquals("Method multiply is Not correct", multiply(9.0, 5.0, 2.0, 4.0), 360.0, 0.09);}
}
