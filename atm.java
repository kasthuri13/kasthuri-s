import java.util.*;

public class atm {
    static Scanner sc = new Scanner(System.in);
    static int balance = 20000;
    static int arr[] = { 0, 0, 0, 0 };
    static int balance1 = 30000;
    static int inp;
    static int pass = 1234;
    static int pass1 = 123;
    static int count = 0;
    static String k = "kasthuri";
    static String k1 = "kk";
    static List<Integer> l1 = new ArrayList<>();
    // static List<Integer> l2 = new ArrayList<>();

    public static void admin() {
        System.out.println("\033[H\033[2J");
        System.out.flush();

        System.out.println("Welcome Admin...");
        System.out.print("Enter the name: ");
        String s = sc.next();
        System.out.print("Enter your password: ");
        // String s=sc.next();
        int p = sc.nextInt();
        if (s.equals(k) && p == pass)
            admin1();
    }

    public static void admin1() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println("1.Check Balance");
        System.out.println("2.Cash Deposit");
        System.out.println("3.Exit");
        int g = sc.nextInt();
        if (g == 1)
            showadminbalance();
        else if (g == 2)
            showadminaddmoney();
        else if (g == 2)
            welcome();
        else
            System.out.println("Enter a valid number");

    }

    public static void showadminbalance() {
        System.out.println("2000-------->" + arr[0]);
        System.out.println("500-------->" + arr[1]);

        System.out.println("200-------->" + arr[2]);

        System.out.println("100------->" + arr[3]);

        System.out.println("balance" + balance1);

        System.out.println();
        System.out.println(" Press Enter to continue:");
        sc.nextLine();
        String k = sc.nextLine();
        if (k.equals("")) {
            welcome();
        } else {
            System.out.println("Invalid username and password");
        }
    }

    public static void showadminaddmoney() {
        // System.out.println("enter the no of notes to be added:");
        System.out.print("Enter the no.of 2000 notes: ");
        arr[0] = sc.nextInt();
        System.out.print("Enter the no.of 500 notes: ");
        arr[1] = sc.nextInt();
        System.out.print("Enter the no.of 200 notes: ");
        arr[2] = sc.nextInt();
        System.out.print("Enter the no.of 100 notes: ");
        arr[3] = sc.nextInt();
        balance1 += arr[0] * 2000 + arr[1] * 500 + arr[2] * 200 + arr[3] * 100;
        sc.nextLine();
        String k = sc.nextLine();
        if (k.equals("")) {
            welcome();

        }
    }

    public static void user() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println("welcome user...");
        System.out.print("Enter the name: ");
        String s = sc.next();
        System.out.print("Enter password: ");
        // String s=sc.next();
        int p = sc.nextInt();
        if (s.equals(k1) && p == pass1 && count < 3) {
            user1();
        } else {
            count++;
            if (count < 3) {
                System.out.println("Invalid username and Password");
                System.out.println("Press enter to continue");
                sc.nextLine();
                String k = sc.nextLine();
                if (k.equals(""))
                    user();
            } else {
                System.out.println("locked");
            }
        }
        System.out.println("Press enter to continue");
        sc.nextLine();
        String e = sc.nextLine();
        if (e.equals(""))
            welcome();

    }

    public static void user1() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println("1.Balance enquiry ");
        System.out.println("2.Cash Withdraw");
        System.out.println("3.Deposit");
        System.out.println("4.Pin change");
        System.out.println("5.Transaction");
        System.out.println("6.Mini statement");
        System.out.println("7.Exit");
        int h = sc.nextInt();
        if (h == 1)
            showuserbalance();
        else if (h == 2)
            showuserwithdraw();
        else if (h == 3)
            showuserdeposit();
        else if (h == 4)
            showuserpin();
        else if (h == 5)
            showtransaction();
        else if (h == 6)
            ministatement();
        else if (h == 7)
            System.out.println("Thank You....");
        System.out.println("Press enter to continue");
        sc.nextLine();
        String s = sc.nextLine();
        if (s.equals(""))
            welcome();
    }

    public static void showuserbalance() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println("Your account balance : " + balance);
        System.out.print("enter to continue");
        // System.out.println();
        sc.nextLine();
        String k = sc.nextLine();
        if (k.equals("")) {
            user1();
        }
    }

    public static void showuserwithdraw() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.print("Enter amount : ");
        int amount = sc.nextInt();

        if (amount <= balance) {
            balance -= amount;
            l1.add(amount);
            balance1 -= amount;
            System.out.println("Balance:" + balance);

            while (amount > 0) {
                if (arr[0] > 0 && amount >= 2000) {
                    amount -= 2000;
                    arr[0]--;
                } else if (arr[1] > 0 && amount >= 500) {
                    amount -= 500;
                    arr[1]--;
                } else if (arr[2] > 0 && amount >= 200) {
                    amount -= 200;
                    arr[2]--;
                } else if (arr[3] > 0 && amount >= 100) {
                    amount -= 100;
                    arr[3]--;
                }
                System.out.println(" Kindly collect the cash!!");
                System.out.print("press enter to continue");
                // System.out.println();
                sc.nextLine();
                String k = sc.nextLine();
                if (k.equals("")) {
                    user1();

                }
            }
        } else {
            System.out.println("Insuffiecient balance");
        }
        System.out.println(" PRESS ENTER TO CONTNUE");
        // System.out.println();
        sc.nextLine();
        String k = sc.nextLine();
        if (k.equals("")) {
            user1();

        }
    }

    public static void showuserdeposit() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println("Enter the amount");
        System.out.print("Enter 2000 rupee notes:");
        arr[0] += sc.nextInt();
        System.out.print("Enter 500 rupee notes:");
        arr[1] += sc.nextInt();
        System.out.print("Enter 200 rupee notes:");
        arr[2] += sc.nextInt();
        System.out.print("Enter 100 rupee notes:");
        arr[3] += sc.nextInt();
        balance1 += arr[0] * 2000 + arr[1] * 500 + arr[2] * 200 + arr[3] * 100;
        balance += arr[0] * 2000 + arr[1] * 500 + arr[2] * 200 + arr[3] * 100;
        System.out.print("PRESS ENTER TO CONTNUE");
        // System.out.println();
        sc.nextLine();
        String k = sc.nextLine();
        if (k.equals("")) {
            user1();

        }
    }

    public static void showuserpin() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println("Enter your old pin");
        int s = sc.nextInt();
        if (s == pass) {
            System.out.println("Enter your new pin");
            int s1 = sc.nextInt();
            pass = s1;
            System.out.println("Pin changed successfully!!!");
        } else {
            System.out.println("Invalid pin");
            System.out.println("Re enter the pin");
            int s2 = sc.nextInt();
            if (s2 == pass) {
                System.out.println("Enter a new pin");
                int s3 = sc.nextInt();
                pass = s3;
                System.out.println("Pin changed successfully!!!");
            }
        }
        System.out.println();
        System.out.println(" PRESS ENTER TO CONTNUE.... ");
        sc.nextLine();
        String k = "";
        if (k.equals(""))
            user1();

    }

    public static void showtransaction() {

        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.print("Account holder name: ");
        String s = sc.next();
        System.out.print("Enter the amount:");
        int amount = sc.nextInt();
        System.out.print("IFSC code:");
        String s2 = sc.next();
        if (amount <= balance) {
            if (s2.contains("SBI")) {
                amount += 50;
                balance = balance - amount;
                balance1 = balance1 - amount;
            } else if (s2.contains("ICIC")) {
                amount += 20;
                balance = balance - amount;
                balance1 = balance1 - amount;
            } else if (s2.contains("IOB")) {
                amount += 40;
                balance = balance - amount;
                balance1 = balance1 - amount;
            }

            System.out.println("Transaction successfull");
        } else {
            System.out.println("Insufficient account balance");
        }
        System.out.println("PRESS ENTER TO CONTNUE");
        sc.nextLine();
        String k = sc.nextLine();
        if (k.equals(""))
            user1();

    }

    public static void ministatement() {
        // System.out.println("\033[/H\033[2J");
        // System.out.flush();
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println("Username" + "    " + "Withdrawed" + "         " + "Balance");
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(k + "     " + l1.get(i) + "                " + balance);
        }
        System.out.println("PRESS ENTER TO CONTNUE");
        sc.nextLine();
        String k = sc.nextLine();
        if (k.equals("")) {
            user1();

        }
    }

    public static void welcome() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println("welcome to karur vysya bank..");
        System.out.println("1.Admin Login");
        System.out.println("2.User Login");
        System.out.println("3.Exit");
        inp = sc.nextInt();
        home();
    }

    public static void home() {
        if (inp > 3 || inp < 1) {
            welcome();
        }
        switch (inp) {
            case 1:
                admin();
            case 2:
                user();
            case 3:
                System.out.println("!!!! THANK YOU FOR VISTING KARUR VYSYA BANK ");
                System.out.println();
                System.out.println("PRESS ENTER TO CONTNUE");
                sc.nextLine();
                String k = sc.nextLine();
                if (k.equals("")) {
                    welcome();
                }
        }

    }

    public static void main(String[] args) {
        welcome();
    }
}
