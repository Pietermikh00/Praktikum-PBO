import java.util.regex.*;

public class UserInputValidator {
    public static void validateUsername(String username) {
      // TODO: buat assertion yang memenuhi persyaratan username
      Pattern pattern = Pattern.compile("[a-zA-Z0-9_]{5,20}");
      Matcher matcher = pattern.matcher(username);
      boolean found = matcher.find();
      assert(found==true):"Username must be at least 5 characters long";
      pattern = Pattern.compile("^[a-zA-Z]+");
      matcher = pattern.matcher(username);
      found = matcher.find();
      assert(found==true):"Invalid username";
      pattern = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]{4,19}$");
      matcher = pattern.matcher(username);
      found = matcher.find();
      assert(found==true):"Username must be at most 20 characters long";
    }
  
    public static void validateEmail(String email) {
      // TODO: buat assertion yang memenuhi persyaratan email
      Pattern pattern = Pattern.compile("^([a-z\\d\\.-]+)@([a-z\\d-]+)\\.([a-z]{2,8})$");
      Matcher matcher = pattern.matcher(email);
      boolean found = matcher.find();
      assert(found==true):"Invalid email address";
    }
  
    public static void validateAge(int age) {
      // TODO: buat assertion yang memenuhi persyaratan usia
      assert(age>=17 && age <= 99):"Age must be between 17 and 99";

    }
  }
  