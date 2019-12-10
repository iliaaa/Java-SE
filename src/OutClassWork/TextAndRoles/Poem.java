package OutClassWork.TextAndRoles;

public class Poem {
    static String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
    static String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                    "Аммос Федорович: Как ревизор?", "Артемий Филиппович: Как ревизор?",
                    "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                    "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!",
                    "Лука Лукич: Господи боже! еще и с секретным предписаньем!", "Городничий: "};

    /*
Городничий:
1) Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.
4) Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.

Аммос Федорович:
2) Как ревизор?
5) Вот те на!
     */

    private static String printTextPerRole(String[] roles, String[] textLines) {
        String rol = "";
        String line = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < roles.length; i++) {
            rol = roles[i] + ":" + "\n";
            sb = sb.append(rol);
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(roles[i] + ":")) {
                    line = (j + 1) + ")" + textLines[j].substring(roles[i].length() + 1) + "\n";
                    sb = sb.append(line);
                }
            }
            sb = sb.append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(printTextPerRole(roles, textLines));
    }
}
