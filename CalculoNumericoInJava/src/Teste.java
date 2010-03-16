import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Teste {
	
	public static void main(String[] args)
	{
		//int a =CalculoNumerico.conversaoInteiroBinarioToDecimal("1111");
		//int a = CalculoNumerico.briot_Ruffine_Inteiro("1110");
		//float a = CalculoNumerico.briot_Ruffine_Fracao("01");
		//float a = CalculoNumerico.binaryToDecimal("1101,01");
		//String a = CalculoNumerico.divisao_sucessiva(13);
		//String a = CalculoNumerico.multiplicacao_sucessiva(0.625);
		//System.out.println(a);
		int choose = 0;
		while(choose != 7)
		{
			System.out.println("Por favor, escolha uma das fun��es abaixo de acordo com o n�mero:");
			System.out.println("1: Bin�rio para Decimal");
			System.out.println("2: Briot-Ruffine Fra��o");
			System.out.println("3: Briot-Ruffine Inteiro");
			System.out.println("4: Divis�o Sucessiva");
			System.out.println("5: Multiplica��o Sucessiva");
			System.out.println("6: Bin�rio Inteiro para Decimal(For�a Bruta");
			System.out.println("7: Sair do Programa");

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			try
			{
				choose = Integer.parseInt(reader.readLine());
				if(choose == 1)
				{
					System.out.println("Digite a representa��o em bin�ria do n�mero, pode ser fra��o tamb�m");
					System.out.println("Resultado: " + CalculoNumerico.binaryToDecimal(reader.readLine().trim()));
					reader.readLine();
				}
				else if(choose == 2)
				{
					System.out.println("Digite a a representa��o em bin�ria da fra��o, sendo esta menor que 1");
					System.out.println("Resultado: " + CalculoNumerico.briot_Ruffine_Fracao(reader.readLine().trim()));
					reader.readLine();
				}
				else if(choose == 7)
				{
					System.out.println("Saindo do programa...");
					return;
				}
			
			}
			catch(NumberFormatException e)
			{
				System.out.println("O que voc� digitou n�o � um n�mero");
			}
			
			
			
			catch(Exception e)
			{
				System.out.println("Voce nao digitou um n�mero");
				System.out.println("Saindo do Programa");
				return;
			}		

		}
				
	}

}
