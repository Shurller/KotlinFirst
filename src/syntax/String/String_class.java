package syntax.String;

public class String_class {
    public static void main(String[] args) {

        String strName = "Sasha";
        String strLastName = new String("Last asha");
        System.out.println(strName+' '+strLastName);

        //equals
        String  firstString= "Hello";
        var secondString = "hello";
        System.out.println(firstString.equals(secondString));
        System.out.println(firstString.equalsIgnoreCase(secondString));

        //получение подстроки
        String greetings = "Hello World";
        String subString = greetings.substring(greetings.indexOf("W"), greetings.lastIndexOf("r"));
        System.out.println(subString);
        System.out.println(greetings.toLowerCase().contains("world"));
        System.out.println(greetings);

        //удаление пробелов
        String login = "   rfrrf   ff  ";
        System.out.println(login.trim());

        //замена
        var loginForReplace = "edde_eqweq";
        System.out.println(loginForReplace.replace("_", "."));
        System.out.println(loginForReplace);

    }
}
