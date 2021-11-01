package program_1;

public class Main {

  public static void main(String[] args) {
    File file = new File("test.pdf");
    file.encrypt(Encryptor.aesEncryptor);
  }
}