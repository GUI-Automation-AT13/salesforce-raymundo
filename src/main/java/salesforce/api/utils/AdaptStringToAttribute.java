package salesforce.api.utils;

public final class AdaptStringToAttribute {
    private AdaptStringToAttribute() {
    }

    /**
     * Changes a String from salesforce and changes it to attributes format.
     *
     * @param string to change
     * @return converted string
     */
    public static String changeFieldName(final String string) {
        return (string.substring(0, 1).toLowerCase() + string.substring(1))
                .replace(" ", "").replace("/", "");
    }
}
