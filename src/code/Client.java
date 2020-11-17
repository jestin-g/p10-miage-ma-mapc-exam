package code;

import code.message.Message;
import code.message.MessageBuilder;

public class Client {
    public static void main(String[] args) {
        Message m1 = new MessageBuilder("L'information contenue dans mon message")
                .withClasse("ClasseConcernee")
                .withMethode("MethodeConcernee")
                .build();
        System.out.println(m1);
    }
}
