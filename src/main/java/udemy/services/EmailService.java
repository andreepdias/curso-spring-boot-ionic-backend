package udemy.services;

import org.springframework.mail.SimpleMailMessage;
import udemy.domain.Pedido;

public interface EmailService {

    public void sendOrderConfirmation(Pedido obj);

    public void sendEmail(SimpleMailMessage msg);

}
