import java.io.*;
// Дан файл с программным кодом, содержащий комментарии - однострочные и многострочные.
// Необходимо программно удалить комментарии и переписать программный код в другой файл.
public class Main{
    public static  void main(String[]args){
        try(BufferedReader br=new BufferedReader(new FileReader("C:/lab/lab16.txt"));
            BufferedWriter bw=new BufferedWriter(new FileWriter("C/lab/lab162.txt"))){
            StringBuilder sb = new StringBuilder();
            String str;
            while((str=br.readLine())!=null){
                sb.append(str).append("\n");
            }
            String rez = sb.toString().replaceAll("//.*|/\\*(\\s|.)*?\\s\\*/","");
            bw.write(rez);
            System.out.println("комментарии удалены");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}