
public class commandLineArg {
	public static void main(String[] args[]) {
		System.out.println("you passed" + args.length+"no. of arguments");
		for (int i=0;i<args.length;i++)
		{ System.out.println("data is"+ args[i]);
		}
	}
}
