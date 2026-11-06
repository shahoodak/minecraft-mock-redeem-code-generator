# minecraft-mock-redeem-code-generator
A Java-based random alphanumeric code generator built for simulating Minecraft redeem keys and promotional codes.
# Minecraft Mock Redeem Code Generator

A Java console application that generates random 25-character alphanumeric redeem codes utilizing a `HashMap` lookup table.

## 🚀 Features
* **Alphanumeric Character Pool:** Dynamically populates digits (`0-9`) and uppercase alphabets (`A-Z`) using ASCII character loops.
* **Standard 25-Character Length:** Generates codes that match the length format commonly used for major gaming gift cards and retail codes.
* **Interactive Console Loop:** Allows you to continuously generate new codes or exit the program via user prompts (`y/n`).

## 🛠️ How It Works
1. **Map Initialization:** The program initializes a `HashMap<Integer, String>`. It uses a nested loop to map integers `0-9` to their string digit representations, and integers `10-35` to characters `A` through `Z`.
2. **Randomization:** Inside a `while` loop, it picks 25 random indexes between `0` and `35` using `Math.random()`.
3. **Code Compilation:** It extracts the character corresponding to each random index from the map and appends it to form a 25-character string.

## 💻 Source Code

```java
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
            System.out.println("\n\n\n");
            
            System.out.print("Do you want to continue y/n? ");
            String next = input.nextLine();
            
            if (next.equals("y")) continue;
            else break;
        }
    }
}
```

## 📋 How to Run
1. Save the code into a file named `Main.java`.
2. Open your terminal or command prompt in that directory.
3. Compile the file:
   ```bash
   javac Main.java
   ```
4. Run the program:
   ```bash
   java Main
   ```

## ⚠️ Disclaimer
This program is an **educational project** intended purely for simulation, code testing, and practicing data structure logic. It generates entirely random string values and does **not** interact with Mojang/Minecraft servers, nor does it create genuine, functional retail Minecraft activation keys.
