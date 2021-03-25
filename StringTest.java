package home.com;

public class StringTest {
	
	public static void main(String[] args) {
		String name="jayshri";
		System.out.println("result by String buffer="+revByStringBuffer(name));
		System.out.println("result by String builder="+revByStringBuilder(name));
		System.out.println("result by String TocharArray="+revByToCharArray(name));
		System.out.println("result by String chatAtMethod="+revByCharAt(name));

		System.out.println("result by String Recursion="+revByRecursion(""));
	}

//using StringBuffer
	static String revByStringBuffer(String str)
	{
		if(null!=str && !str.isEmpty())
		{
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		
		return sb.toString();
		}
		else
		{
			return "invalid String";
		}
		
	}
//using StringBuilder
	
	static String revByStringBuilder(String str)
	{
		if(null!=str && !str.isEmpty())
		{
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
	
		return sb.toString();
		}
		else
		{
			return "invalid String";
		}
	
	}
	
//using CharArray
	static String revByToCharArray(String str)
	{
		if(null!=str && !str.isEmpty())
		{
		
		String rev="";
		char [] result =str.toCharArray();	
		for(int i=result.length-1;i>=0;i--)
		{
			rev +=result[i];
		}
		return rev;
		}
		else
		{
			return "invalid string";
		}
		
	}
//using CharAt()	
	static String revByCharAt(String str)
	{
		if(null!=str && !str.isEmpty())
		{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev +=str.charAt(i);
		}
		return rev;
		}
		else
		{
			return "invalid string";
		}
	}
		
//using Recursion method	
	static String revByRecursion(String str)
	{
		if(null!=str && !str.isEmpty())
		{
		if(str.length()<2)
		{
			return str;
		}
		return revByRecursion(str.substring(1)) +str.charAt(0);
		}
		else
		{
			return "invalid string";
		}
	}	
		
}	
		