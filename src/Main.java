import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		//MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM
		//DECLARACIONES Y USO DE LAS VARIABLES
		//WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW
		System.out.println("Declaracion de variables");
		
		int edad;
		double altura;
		String nombre;
		boolean estudiante;
		
		System.out.print("Ingrese su nombre");
		nombre = entrada.nextLine();
		System.out.print("Ingrese su edad");
		edad = entrada.nextInt();
		System.out.print("Ingrese su altura");
		altura = entrada.nextDouble();
		System.out.print("¿Ees estudiante? (true/false):");
		estudiante = entrada.nextBoolean();
		
		System.out.println("Los datos que ingresastes son ");
		System.out.println("Tu nombre es:"+nombre);
		System.out.println("Tu edad es: "+edad);
		System.out.println("Tu altura es: "+altura);
		System.out.println("Si eres estudiante o no: "+estudiante);
		
		//MMMMMMMMMMMMMMMMMMMMMMMM
		//OPERACIONES MATEMATICAS
		//WWWWWWWWWWWWWWWWWWWWWWWW
		
		System.out.println("Operaciones Matematicas");
		int num1, num2;
		System.out.println("Ingrese el primer numero");
		num1 = entrada.nextInt();
		System.out.println("Ingresa el segundo numero");
		num2 = entrada.nextInt();
		
		int suma =num1+num2;
		int resta =num1-num2;
		int mult =num1*num2;
		int divi = num1/num2;
		
		System.out.println("La suma de los dos numeros es: "+suma);
		System.out.println("La resta de los dos numeros es: "+resta);
		System.out.println("La multiplicacion de los dos numeros es: "+mult);
		System.out.println("La division de los dos numeros es: "+divi);
		
		short suma1 =(short)(num1+num2);
		double resta1 =num1-num2;
		float mult1 = num1*num2;
		byte divi1 =(byte)(num1/num2);
		
		System.out.println("La suma usando el dato short es: "+suma1);
		System.out.println("La resta usando el dato double es: "+resta1);
		System.out.println("La multiplicaccion usando el dato float es: "+mult1);
		System.out.println("La division usando el dato byte es: "+divi1);
		
		//MMMMMMMMMMMMMMMMMMM
		//OPERACIONES LOGICAS
		//WWWWWWWWWWWWWWWWWWW
		
		System.out.println("Operaciones logicas");

        System.out.print("Ingrese primer valor: ");
        int a = entrada.nextInt();

        System.out.print("Ingrese segundo valor: ");
        int b = entrada.nextInt();
            
        System.out.println("Comparando los valores ingresados:");
        System.out.println("a = " + a + " y b = " + b);

        System.out.println("¿a es mayor que b? → " + (a > b));
        System.out.println("¿a es menor que b? → " + (a < b));
        System.out.println("¿a es igual a b? → " + (a == b));

        System.out.println("Ahora voy a evaluar operadores lógicos usando el número 10 como referencia:");

        System.out.println("AND (&&) significa que ambas condiciones deben cumplirse.");
        System.out.println("¿a > 10 Y b > 10? → " + (a > 10 && b > 10));

        System.out.println("OR (||) significa que al menos una condición debe cumplirse.");
        System.out.println("¿a > 10 O b > 10? → " + (a > 10 || b > 10));
        
        //MMMMMMMMMMMMMMMMMMMMM
        //CLASIFICACION DE EDAD 
        //WWWWWWWWWWWWWWWWWWWWW
        
        System.out.println("Clasificacion de edad");
        
        System.out.println("Ingrese su edad");
        int edad1 = entrada.nextInt();
        
        int nino=12;
        int adolecente=17;
        int adulto=59;
        int adultoM=60;
        
         if (edad1 < nino) {
        System.out.println("Eres un Niño tu edad es: "+edad1); 
        }
         else if(edad1<=adolecente){
        System.out.println("Eres un Adolecente tu edad es: "+edad);
        }
         else if(edad1<=adulto){
        System.out.println("Eres un Adulto tu edad es: "+edad1);
        }
         else {
        	System.out.println("Eres un Adulto Mayor tu edad es: "+edad1);
        }
         
         
        //MMMMMMMMMMMMMMMM
        //DIA DE LA SEMANA 
       //WWWWWWWWWWWWWWWWW
         
         System.out.println("Dia de la Semana");
         System.out.println("Ingrese un numero del 1 al 7");
         int dia1 =entrada.nextInt();
         
         switch (dia1){
         case 1: System.out.println ("El primer dia de la semana es Lunes");
         break;
         case 2: System.out.println ("El segundo dia de la semana es Martes");
         break;
         case 3: System.out.println ("El tercer dia de la seamana es Miercoles");
         break;
         case 4: System.out.println ("El cuerto dia de la semana es Jueves");
         break;
         case 5: System.out.println ("El quinto dia de la semana es Viernes");
         break;
         case 6: System.out.println ("El sexto dia de la semana es Sabado");
         break;
         case 7: System.out.println ("El septimo dia de la semana es Domingo");
         break;
         default: System.out.println ("El numero que incresase no es balido");
           }
       
         //MMMMMMMMMMMMMMMMMMMMMM
         //VERIFICACION DE ACCES
         //WWWWWWWWWWWWWWWWWWWWWW
         
         System.out.println("Verificacion de accseso");
         
         String usuarioCorrecto = "asmin";
         String contrasenaCorrecta = "123456";
         
         System.out.print("Ingrese el Usuario");
         String usuario = entrada.next();
         System.out.print("Ingrese la contraseña");
         String contrasena = entrada.next();
         
         if (usuario==(usuarioCorrecto)&& contrasena==(contrasenaCorrecta))	{
        	 System.out.println("Acceso consedido");
         }
         else if (usuario==(usuarioCorrecto)) {
        	 System.out.println("Contraseña Incorrecta");
         }
         else {
        	 System.out.println("Usuario Incorreto prueba de nuevo");
         }
        
	}
}
