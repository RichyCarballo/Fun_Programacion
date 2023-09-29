// See https://aka.ms/new-console-template for more information
/*Console.WriteLine es parea escribir texto este se escribe rentre comillas dobles*/

using System;

class Hola
{
    static void Main()
    {
        Console.WriteLine("Ingresa tu nombre: ");
        string Nombre;
        Nombre = Console.ReadLine();
        Console.WriteLine("Hola " + Nombre);

        Console.WriteLine("Ingresa tu edad: ");
        int Edad;
        Edad = Int32.Parse(Console.ReadLine());
        
        if (Edad < 18)
        {
            Console.WriteLine ("Eres menor de edad");
        }else if (Edad <= 85)
        {
            Console.WriteLine("Eres mayor de edad");
        }else
        {
            Console.WriteLine("Eres una momia o que pdo");
        }
    }
}
