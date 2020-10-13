package udemy.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import javax.mail.internet.MimeMessage;

public class SmtpEmailService extends  AbstractEmailService {

    @Autowired
    private MailSender mailSender;

    @Autowired
    private JavaMailSender javaMailSender;

    private static final Logger LOG = (Logger) LoggerFactory.getLogger(SmtpEmailService.class);
    @Override
    public void sendEmail(SimpleMailMessage msg) {
        LOG.info("Preparando para enviar email...");
        mailSender.send(msg);
        LOG.info("Email enviado!");
    }

    @Override
    public void sendHtmlEmail(MimeMessage msg) {
        LOG.info("Preparando para enviar email...");
        javaMailSender.send(msg);
        LOG.info("Email enviado!");
    }
}
