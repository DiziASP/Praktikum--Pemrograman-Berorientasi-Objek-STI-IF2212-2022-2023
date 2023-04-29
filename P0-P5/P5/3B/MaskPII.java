public class MaskPII {
    private String maskEmail(String email) {
        String[] sEmail = email.split("@");
        String name = sEmail[0];
        String domain = sEmail[1];

        char firstChrName = name.charAt(0);
        char lastChrName = name.charAt(name.length()-1);
        String newEmail = (firstChrName + "*****" + lastChrName).toLowerCase();
        String newDomain = domain.toLowerCase();

        String maskedEmail = newEmail + "@" + newDomain;

        return maskedEmail;
    }

    private String maskPhoneNumber(String phoneNumber) {
        StringBuilder cleanPhoneNumber = new StringBuilder();
        for(int i=0;i<phoneNumber.length();i++) {
            char currDigit = phoneNumber.charAt(i);
            if(Character.isDigit(currDigit)) cleanPhoneNumber.append(currDigit);
        }

        StringBuilder maskedPhoneNumber = new StringBuilder();

        int phoneNumberLen = cleanPhoneNumber.length();

        if(phoneNumberLen > 10) maskedPhoneNumber.append('+');
        for(int i=0;i<phoneNumberLen-10;i++) maskedPhoneNumber.append("*");
        if(phoneNumberLen > 10) maskedPhoneNumber.append('-');
        maskedPhoneNumber.append("***-***-");
        maskedPhoneNumber.append(cleanPhoneNumber.substring(phoneNumberLen-4));

        return maskedPhoneNumber.toString();
    }

    public String maskPII(String pii) {
        if(pii.contains("@")) {
            return maskEmail(pii);
        } else {
            return maskPhoneNumber(pii);
        }
    }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String pii = sc.nextLine();

    //     MaskPII maskPII = new MaskPII();

    //     System.out.println(maskPII.maskPII(pii));
    // }
}
