
using System.Text;

namespace ProgramaU5_10;

class Password
{
    static void Main(string[] args)
    {
        int longitud = 8;
        Console.Write("Password: " + random(longitud));
    }
    public static String random(int x)
    { //x es el tamaño    
        //Caracteres
        string letras = "ABSLHDLHKAH/$%#&_jkjsaloqn"; 
        StringBuilder cadena = new StringBuilder(x); 
        Random alea = new Random(); 

        for (int i = 0; i < x; i++)
        {
           
            int IndiceCaracter = alea.Next(letras.Length); 
            cadena.Append(letras[IndiceCaracter]);

        }
        return cadena.ToString(); 
    }
}
