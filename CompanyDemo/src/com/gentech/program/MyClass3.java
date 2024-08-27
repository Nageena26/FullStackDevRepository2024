package com.gentech.program;
class OneDArray
{
	void arraydemo(String a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
}

public class MyClass3 {

	public static void main(String[] args) {
		String b[]= {"10","20"};
		OneDArray o3=new OneDArray();
		o3.arraydemo(b);

	}

}
