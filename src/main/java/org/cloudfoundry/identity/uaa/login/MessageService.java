package org.cloudfoundry.identity.uaa.login;

public interface MessageService {

    public void sendMessage(String email, MessageType messageType, String subject, String htmlContent);

}
