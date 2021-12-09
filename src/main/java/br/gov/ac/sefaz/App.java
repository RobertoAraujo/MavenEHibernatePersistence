package br.gov.ac.sefaz;
import javax.swing.*;
import java.io.*;
import java.nio.file.Files;

public class App {

    public static void main(String[] args) throws IOException {
        File arquivo = new File( "C:\\Users\\sefaz\\Documents\\efds\\nome_do_arquivo.txt" );
        boolean existe = arquivo.exists();
        arquivo.createNewFile();//cria um arquivo (vazio)
        arquivo.mkdir();//cria um diretório
        File [] arquivos = arquivo.listFiles();//caso seja um diretório, é possível listar seus arquivos e diretórios
        arquivo.delete();//exclui o arquivo ou diretório

        FileWriter fw = new FileWriter( arquivo );//construtor que recebe o objeto do tipo arquivo
        //construtor que recebe também como argumento se o conteúdo será acrescentado
        //ao invés de ser substituído (append)
        FileWriter fileWriter = new FileWriter( arquivo, true );



        BufferedWriter bw = new BufferedWriter( fw ); //construtor recebe como argumento o objeto do tipo FileWriter
        bw.write( "Texto a ser escrito no txt 111111" );//escreve o conteúdo no arquivo
        bw.newLine();//quebra de linha
        bw.close(); //fecha os recursos
        fw.close(); //fecha os recursos

        
        FileReader fr = new FileReader( arquivo );//construtor que recebe o objeto do tipo arquivo
        BufferedReader br = new BufferedReader( fr ); //construtor que recebe o objeto do tipo FileReader
        while( br.ready() ){//enquanto houver mais linhas
            //lê a proxima linha
            String linha = br.readLine();
            //faz algo com a linha
        }
        br.close();
        fr.close();
    }


}
