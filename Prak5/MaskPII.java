public class MaskPII {
    private String maskEmail(String email) {
        email = email.toLowerCase();// Konversi ke lowercase
        String[] parts = email.split("@");// Pisahkan name dan domain

        // Ambil name dan domain
        String name = parts[0];
        String domain = parts[1];

        // Masking name
        int n = name.length();
        name = name.charAt(0) + "*****" + name.charAt(n - 1);

        // Gabungkan name dan domain
        return name + "@" + domain;
    }

    private String maskPhoneNumber(String phoneNumber) {
        // Menghapus semua karakter pemisah
        String normalizedPhoneNumber = phoneNumber.replaceAll("[^0-9]", "");

        int length = normalizedPhoneNumber.length();

        // Mask local num
        String maskedLocalNumber = "****";
        if (length > 4) {
            maskedLocalNumber = normalizedPhoneNumber.substring(length - 4);
        }

        // Mask country code
        if (length <= 10) {
            return "***-***-" + maskedLocalNumber;
        } else {
            String mask = new String(new char[length - 10]).replace("\0", "*");
            String countryCode = "+" + mask;
            return countryCode + "-" + "***-***-" + maskedLocalNumber;
        }
    }

    public String maskPII(String pii) {
        if (pii.contains("@")) {
            return maskEmail(pii);
        } else {
            return maskPhoneNumber(pii);
        }
    }
}
