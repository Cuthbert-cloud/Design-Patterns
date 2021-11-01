package program_2.challenge;

public class Client {
  public static void main(String[] args) {
    AuthenticationHandler chain = new BasicAuthenticationHandler(new ClientCertificateAuthenticationHandler(new DigestAuthenticationHandler(null)));
    chain.handleRequest("basic");
    chain.handleRequest("digest");
    chain.handleRequest("client certificate");
  }
}