package udemy.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

public class EmailDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotEmpty(message="Preenchimento obrigatório")
    @javax.validation.constraints.Email(message="Email inválido")
    private String Email;

    public  EmailDTO(){}

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
