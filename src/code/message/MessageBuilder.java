package code.message;

public class MessageBuilder {
    private Message message;

    public MessageBuilder(String information) {
        this.message = new Message(information);
    }

    public MessageBuilder withClasse(String classe) {
        this.message.classe = classe;
        return this;
    }

    public MessageBuilder withMethode(String methode) {
        this.message.methode = methode;
        return this;
    }

    public Message build() {
        return this.message;
    }
}