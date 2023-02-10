import java.util.Scanner;

public class Main {
    public static void main(String[] args){
      BancAccount bancAccount = new BancAccount(20000);
      try {
          bancAccount.withDraw(6000);
      }catch (LimitException e){
          System.out.println("Я могу только снять" +e.getRemainingAmount() + "Сом");
      }
          }
      }

