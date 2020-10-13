package udemy.services;

import org.springframework.mail.SimpleMailMessage;
import udemy.domain.Cliente;
import udemy.domain.Pedido;

import javax.mail.internet.MimeMessage;

public interface EmailService {

    void sendOrderConfirmation(Pedido obj);

    void sendEmail(SimpleMailMessage msg);

    void sendOrderConfirmationHtmlEmail(Pedido obj);

    void sendHtmlEmail(MimeMessage msg);

    void sendNewPasswordEmail(Cliente cliente, String newPass);

}
