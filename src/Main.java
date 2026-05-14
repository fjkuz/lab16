import java.io.*;
// Дан файл с программным кодом, содержащий комментарии - однострочные и многострочные.
// Необходимо программно удалить комментарии и переписать программный код в другой файл.
public class Main{
    public static  void main(String[]args){
        try
        {
            BufferedReader br=new BufferedReader(new FileReader("C:/lab/lab16.txt"));
            StringBuilder sb = new StringBuilder();
            String str;
            while((str=br.readLine())!=null){
                sb.append(str).append("\n");
            }
            br.close();
            String rez = sb.toString().replaceAll("//.*|/\\*(\\s|.)*?\\s\\*/","");
            File file =new File("C:/lab/lab162.txt");
            BufferedWriter bw=new BufferedWriter(new FileWriter(file));
            bw.write(rez);
            bw.close();
            System.out.println("комментарии удалены");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}