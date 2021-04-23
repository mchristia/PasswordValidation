public class PasswordValidation {
    public static void main(String[] args) {
        String password = "buNny88";
        String[] passwordArray = {"Haus4", "fu3nd", "47uwfh", "AEFef34", "f", "LAL4"};
        System.out.println(checkForLowerUpperLetter(password));
        passwordChecker(passwordArray);
    }
    public static boolean[] passwordChecker(String[] passwords){
        boolean[] passwordsChecked = new boolean[passwords.length];
        for(int i = 0; i< passwords.length; i++){
            boolean pwLength = checkPasswordLength(passwords[i], 5);
            boolean pwNumbers = checkForNumber(passwords[i]);
            boolean pwLetters = checkForLowerUpperLetter(passwords[i]);

            if (pwLength && pwNumbers && pwLetters){
                passwordsChecked[i] = true;
            } else {
                passwordsChecked[i] = false;
            }
            System.out.println(passwordsChecked[i]);
        }
        return passwordsChecked;
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
        String regex1 = ".*[a-z].*";
        String regex2 = ".*[A-Z].*";

        if(password.matches(regex1 )&& password.matches(regex2)){
            return true;
        }else {
            return false;
        }

    }
}
