public class PasswordValidation {
    public static void main(String[] args) {
        String password = "buNny88";
//        System.out.println(checkPasswordLength(password, 3));
//        System.out.println(checkForNumber(password));
        System.out.println(checkForLowerUpperLetter(password));
    }
    public static boolean checkPasswordLength(String password, int passMinLength){

        int minPasswordLength;
        if(passMinLength > 0){
            minPasswordLength = passMinLength;
        } else {
            minPasswordLength = 3;
        }
        return (password.length() >= minPasswordLength);
    }

    public static boolean checkForNumber(String password) {
        return password.matches(".*[0-9].*");
    }

    public static boolean checkForLowerUpperLetter(String password) {
//        return password.matches("(?=.*[a-z])(?=.*[A-Z])");   //"(.*[a-z].*)(.*[A-Z].*)");
        String regex1 = ".*[a-z].*";
        String regex2 = ".*[A-Z].*";

        if(password.matches(regex1 )&& password.matches(regex2)){
            return true;
        }else {
            return false;
        }

    }
}
