class One
{
	int x=10,y=20;
	void display()
	{
		System.out.println("Value of X : "+x);
		System.out.println("Value of Y : "+y);
	}
}

class Two extends One
{
	void addNum()
	{
		int z=x+y;
		System.out.println("Addition is : "+z);
	}
}

class Three extends One
{
	void mulNum()
	{
		int z=x*y;
		System.out.println("Multiplication is : "+z);
	}
}

class Hierarchical
{
	public static void main(String args[])
	{
		Two t2=new Two();
		Three t3=new Three();
		t2.display();
		t2.addNum();
		t3.mulNum();
	}
}

