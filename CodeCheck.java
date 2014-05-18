public class CodeCheck
{
    public static void main(String [] args)
    {
        System.out.print ("May 13, 1988 fell on a day number ");
        System.out.println( ((13 + (13 * 3 - 1) / 5
                                 + 1988 % 100
                                 + 1988 % 100 / 4
                                 + 1988 % 100 / 400
                                 - 2 * ( 1988 / 100)) % 7 + 7) % 7 );
                                 
        

                               
    }
}
