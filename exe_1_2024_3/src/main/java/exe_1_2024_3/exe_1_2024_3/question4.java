package exe_1_2024_3.exe_1_2024_3;

public class question4 {
	public static String compare(int a,int b, String mod) {
		switch (mod) {
		case "regular":
		if (a<b)
			return "B";
		else
			return "A";
		case "negative":
			if(-a<-b)
				return "B";
			else
				return "A";
		case "reciprocal":
			break;
			default:
		}
		return mod;
	}

}
