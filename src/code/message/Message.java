package code.message;

public class Message {
    protected String classe;
    protected String methode;
    protected String information;

    protected Message(String information) {
        this.information = information;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (classe != null) {
            sb.append(classe);
            if (methode != null)
                sb.append(",");
        }
        if (methode != null) {
            sb.append(methode);
        }
        if (methode != null || classe != null)
            sb.append(":");
        sb.append(information);
        return sb.toString();
    }
}
