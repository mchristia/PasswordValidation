public class PasswordValidation {
    public static void main(String[] args) {
        String password = "Bunny88";
        System.out.println(checkPasswordLength(password, 3));
        System.out.println(checkForNumber(password));
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
}
