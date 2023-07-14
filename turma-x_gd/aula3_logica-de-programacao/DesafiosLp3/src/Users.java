
import javax.swing.JOptionPane;

public class Users {
    public String nome;
    public String email;
    public String username;
    public String senha;

    public Users(String nome, String email, String username, String senha) {
        this.nome = nome;
        this.email = email;
        this.username = username;
        this.senha = senha;
    }
    public void mostraDados(){
        JOptionPane.showMessageDialog(null, "Meu nome é "+this.nome+"\nMeu email é "+this.email+"\nPode me chamar de "+this.username);
    }
    public void alteraDados(){
        String nome = JOptionPane.showInputDialog("Digite o nome novamente: ");
        String username = JOptionPane.showInputDialog("Como quer ser chamado? ");
        this.nome = nome;
        this.username = username;
    }
    public void alteraSenha(){
        String senhaAtual = JOptionPane.showInputDialog("Digite a senha antiga");
        String novaSenha = JOptionPane.showInputDialog("Digite a senha nova");
        String confirmaSenha = JOptionPane.showInputDialog("Confirme a nova senha");
        if (senhaAtual.equals(this.senha)) {
            if (novaSenha.equals(confirmaSenha)) {
                this.senha = confirmaSenha;
            }else{
                JOptionPane.showMessageDialog(null,"As senhas nao batem");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Senha incorreta!");
        }
    }
}
