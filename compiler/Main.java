package compiler;

import java.io.*;

class Main {

  public static void main(String[] args) throws LexicalError, Exception {
    File file = new File("compiler/sample.txt");
    BufferedReader br = new BufferedReader(new FileReader(file));
    Lex lex = new Lex();

    Token currentToken;

    lex.setInput(br);
    System.out.println();

    try {
      do {
        currentToken = lex.nextToken();

        if (currentToken != null)
          System.out.println(currentToken);

      } while (currentToken != null);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
