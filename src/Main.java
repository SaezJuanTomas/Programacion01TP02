import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Ingresa un número entre 1 y 23, o 24 para terminar:");
            opcion = sc.nextInt();
            sc.nextLine();
            int num;

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese numero decimal: ");
                    double valorDecimal = sc.nextInt();
                    short shortVD = (short) valorDecimal;
                    int intVD = (int) valorDecimal;
                    long longVD = (long) valorDecimal;
                    String stringVD = Double.toString(valorDecimal);
                    float floatVD = (float) valorDecimal;

                    System.out.println("Valor double: " + valorDecimal);
                    System.out.println("Valor short: " + shortVD);
                    System.out.println("Valor int: " + intVD);
                    System.out.println("Valor long: " + longVD);
                    System.out.println("Valor String: " + stringVD);
                    System.out.println("Valor float: " + floatVD);
                    break;
                case 2:

                    break;
                case 3:
                    do {
                        System.out.println("Ingrese numero entre 100-999 : ");
                        num = sc.nextInt();
                    } while (num < 100 || num > 999);

                    int unidades = num % 10;
                    int decenas = (num / 10) % 10;
                    int centenas = num / 100;

                    int suma = unidades + decenas + centenas;
                    System.out.println("La suma de los dígitos es: " + suma);
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Ingrese numero: ");
                    num = sc.nextInt();
                    String.valueOf(num);
                    System.out.println("El valor: " + num + " Ahora es de tipo String ");
                    break;
                case 6:
                    String ejemploString = "La lluvia en Mendoza es escasa";
                    System.out.println("Tamaño de la cadena: " + ejemploString.length());
                    break;
                case 7:
                    System.out.println("Ingrese cadena: ");
                    String cadena = sc.nextLine();
                    int cantVocales = 0;
                    int longCadena = cadena.length();

                    for (int i = 0; i < longCadena; i++) {
                        char c = Character.toLowerCase(cadena.charAt(i));
                        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                            cantVocales++;
                        }
                    }

                    System.out.println("Tamaño de la cadena: " + cadena.length());
                    System.out.println("Cantidad de vocales: " + cantVocales);
                    break;
                case 8:
                    System.out.println("Ingrese cadena: ");
                    cadena = sc.nextLine();

                    String cadenaModificada = cadena.replace('a', 'e');
                    System.out.println("Cadena modificada: " + cadenaModificada);
                    break;
                case 9:

                    break;
                case 10:
                    System.out.println("Ingrese cadena: ");
                    cadena = sc.nextLine();
                    do {
                        System.out.println("Ingrese 1 para convertir todo a mayusculas");
                        System.out.println("Ingrese 2 para convertir todo a minusculas");
                        num = sc.nextInt();
                    }while (num != 1 && num != 2);
                if (num == 1) {
                    System.out.println(cadena.toUpperCase());
                } else if (num == 2 ) {
                    System.out.println(cadena.toLowerCase());
                }
                break;
                case 11:
                    System.out.println("Ingrese 1ra palabra: ");
                    cadena = sc.nextLine();
                    System.out.println("Ingrese 2da palabra: ");
                    String cadena2 = sc.nextLine();
                    if (cadena.equals(cadena2)) {
                        System.out.println("Las 2 palabras son iguales");
                    } else System.out.println("Las 2 palabras no iguales");
                    break;
                case 12:
                    System.out.println("Ingrese la cadena: ");
                    cadena = sc.nextLine();
                    if (cadena.length() >= 5) {
                        // Extraer la cuarta y quinta letra (índices 3 y 4)
                        String subcadena = cadena.substring(3, 5);
                        System.out.println("La cuarta y quinta letra son: " + subcadena);
                    } else {
                        System.out.println("La cadena es demasiado corta.");
                    }
                    break;
                case 13:
                    System.out.println("Ingrese la 1ra cadena: ");
                    cadena = sc.nextLine();
                    System.out.println("Ingrese 2da cadena: ");
                    cadena2 = sc.nextLine();
                    if (cadena.contains(cadena2)){
                        System.out.println("La primera cadena contiene a la segunda");
                    } else {
                        System.out.print("La primera cadena no contiene a la segunda");
                    }
                    break;
                case 14:

                    break;
                case 15:
                    Integer numero = null;
                    if (numero == null) {
                        System.out.println("La variable 'numero' es null.");
                    } else {
                        System.out.println("El valor de 'numero' es: " + numero);
                    }
                    numero = 42;
                    System.out.println("Nuevo valor de 'numero': " + numero);
                    break;
                case 16:
                    System.out.print("Ingrese Double: ");
                    Double objetoDouble = sc.nextDouble();
                    double primitivoDouble = objetoDouble;
                    System.out.println("Valor de primitivo double: " + primitivoDouble);
                    break;
                case 17:
                    System.out.println("Ingrese Long: ");
                    break;
                case 18:
                    Date fechaActual = new Date();
                    String fechaComoCadena = Main.getFechaString(fechaActual);
                    System.out.println("La fecha actual es: " + fechaComoCadena);
                    break;
                case 19:
                    System.out.println("Ingrese Long: ");
                    break;
                case 20:
                    System.out.println("Ingrese Long: ");
                    break;
                case 21:
                    System.out.println("Ingrese un número entero mayor a cero: ");
                    num = sc.nextInt();

                    if (num > 0) {
                        suma = sumarNumeros(num);
                        System.out.println("La suma de los números desde " + num + " hasta 1 es: " + suma);
                    } else {
                        System.out.println("El número debe ser mayor a cero.");
                    }
                    break;
                case 22:
                    System.out.println("Ingrese numero: ");
                    num = sc.nextInt();
                    int sumarDigitos = sumarDigitos(num);
                    break;
                case 23:
                    System.out.println("Ingrese una cadena:");
                    cadena = sc.nextLine();

                    String cadenaInvertida = invertirCadena(cadena);

                    System.out.println("Cadena invertida: " + cadenaInvertida);
                    break;

                case 24:
                    System.out.println("Programa terminado.");
                    break;
                    default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        } while (opcion != 24);
        sc.close();
    }
    private static int sumarNumeros(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumarNumeros(n - 1);
        }
    }
    private static int sumarDigitos(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumarDigitos(n / 10);
        }
    }
    private static String invertirCadena(String cadena) {
        if (cadena.isEmpty()) {
            return cadena;
        } else {
            return invertirCadena(cadena.substring(1)) + cadena.charAt(0);
        }
    }
    private static String getFechaString(Date fecha) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return formatoFecha.format(fecha);
    }
}

