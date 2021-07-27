package salesforce.ui.urls;

public enum SalesforceUrl {
    CASES("lightning/o/Case/list?filterName=Recent");

    private final String url;

    SalesforceUrl(final String enumUrl) {
        this.url = enumUrl;
    }

    /**
     * Gets the web site URL.
     *
     * @return a String with the url
     */
    public String getUrl() {
        return url;
    }
}
