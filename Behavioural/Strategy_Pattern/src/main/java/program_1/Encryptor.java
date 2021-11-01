package program_1;

public interface Encryptor {
  String encryptFile();
  Encryptor aesEncryptor = () -> "Applying AES encryption";
  Encryptor rsaEncryptor = () -> "Applying RSB encryption";
}