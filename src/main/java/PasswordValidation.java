public class PasswordValidation {
    public static void main(String[] args) {
        String password = "Keks";
        System.out.println(checkPasswordLength(password, 3));
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
}
