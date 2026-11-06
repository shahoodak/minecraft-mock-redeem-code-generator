import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> hmap = new HashMap<>();
        for (int i = 0; i < 36; i++) {
            if (i < 10) {
                for (int j = 0; j <= 9; j++) {
                    String add = "" + j;
                    hmap.put(i, add);
                    i++;
                }
            }
            if (i >= 10) {
                for (char k = 'A'; k <= 'Z'; k++) {
                    String a = "" + k;
                    hmap.put(i, a);
                    i++;
                }
            }
        }
        while (true) {
            String answer = "";
            for (int i = 0; i < 25; i++) {
                int num = (int) (Math.random() * 36);
                String c = hmap.get(num);
                answer += c;
            }
            System.out.println("Your Code:\n" + answer);
            System.out.println("\n\n\n\n");
            System.out.print("Do you want to continue y/n? ");
            String next = input.nextLine();
            if (next.equals("y"))
                continue;
            else
                break;
        }

    }
}