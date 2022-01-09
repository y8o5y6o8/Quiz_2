package Quiz02;


interface iShape03//界面iShape03
{   
	public void show(); 
	public int area(); 
}
interface iColor//界面iColor
{
	public void showColor();
}
class CWin implements iColor,iShape03
{
	protected int width;
	protected int height;
	protected String color;
	public CWin(int w,int h,String str)
	{
		width = w;
		height = h;
		color = str;		
	}
	public void show()
	{
		System.out.println("width = "+width);
		System.out.println("height = "+height);
		System.out.println("area = "+area());
		System.out.println("color = "+color);
	}
	public int area()
	{
		return(width*height);
	}
	public void showColor()
	{
		System.out.println("color = "+color);
	}
}



public class Teat_2 {

	public static void main(String[] args) {
		CWin win = new CWin(5,7,"green");
		win.show();
	}