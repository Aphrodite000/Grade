import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int result=0;
        int grade=0;
        String s=null;
        while (in.hasNextLine()){
            String sN=in.nextLine();
            int studentNumber=Integer.parseInt(sN);
            if(studentNumber==0) {
                return;
            }
            s=in.nextLine();
            String g=in.nextLine();
            grade=Integer.parseInt(g);
            String[] strings = s.split(" ");
            int[] c = new int[strings.length];
            for (int i = 0; i < c.length; i++) {
                c[i] = Integer.parseInt(strings[i]);
            }
            int count = 0;
            for (int i = 0; i < c.length; i++) {
                if (c[i] == grade) {
                    count++;
                }
            }
            sb.append(count);
            for (int i = 0; i < sb.length(); i++) {
                System.out.println(sb.charAt(i));
            }
        }
    }
}