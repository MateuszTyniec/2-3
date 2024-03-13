import java.util.random;
public class Main 
{
  Random liczby = new Random();
  int suma = 0;
  
  for(int i = 0; i < 5; i++);
    {
      int liczbylosowe = liczby.nextInt(100);
      int kwadrat = liczbylosowe;
      liczbylosowe = (int) Math.pow(kwadrat,2.0);
      suma = suma + liczbylosowe;
      System.out.println(" losowa liczba: " + liczbylosowe);
}
    System.out.println(" suma = " + suma);

    }  

}